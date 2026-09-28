package net.hazen.hazens_archaic_hexerei_armaments.Events.ArmorSetBonuses;

import io.redspace.irons_artifice.api.ComposeShotEvent;
import io.redspace.irons_artifice.data.ShotComponents;
import io.redspace.irons_artifice.data.Value;
import io.redspace.irons_artifice.data.ValueModifier;
import io.redspace.irons_artifice.entity.Bullet;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.DesertProwler.DesertProwlerArmor;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHAEffectRegistry;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

import static com.ibm.icu.text.PluralRules.Operand.e;

@EventBusSubscriber(modid = HazensArchaicHexereiArmaments.MOD_ID)
public class DesertProwlerSetBonusHandler {
    public static final double DAMAGE_INCREASE = 0.75;

    private static boolean DesertProwlerArmorSetBonus(LivingEntity entity) {
        return entity.getItemBySlot(ArmorItem.Type.HELMET.getSlot()).getItem() instanceof DesertProwlerArmor &&
                entity.getItemBySlot(ArmorItem.Type.CHESTPLATE.getSlot()).getItem() instanceof DesertProwlerArmor &&
                entity.getItemBySlot(ArmorItem.Type.LEGGINGS.getSlot()).getItem() instanceof DesertProwlerArmor &&
                entity.getItemBySlot(ArmorItem.Type.BOOTS.getSlot()).getItem() instanceof DesertProwlerArmor;
    }


    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void desertProwlerCriticalStrike(LivingIncomingDamageEvent event) {
        LivingEntity player = event.getSource().getEntity() instanceof LivingEntity le ? le : null;

        if (!(event.getSource().getDirectEntity() instanceof Bullet)) {
            return;
        }

        if (!DesertProwlerArmorSetBonus(player)) {
            return;
        }

        double critChance = 0.20;
        float critDmg = 0.85F;

        RandomSource rand = event.getEntity().getRandom();
        float damage = event.getAmount();

        if (player.hasEffect(HAHAEffectRegistry.PROWLING)) {
            damage = (float) (damage + event.getAmount() * (critDmg + 0.15)); event.setAmount(damage); return;
        }
        else if (rand.nextDouble() <= critChance) {
            damage += event.getAmount() * critDmg; event.setAmount(damage);
        }
    }

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();

        if (player.level().isClientSide()) {
            return;
        }

        if (!DesertProwlerArmorSetBonus(player)) {
            player.removeEffect(MobEffects.INVISIBILITY);
            player.removeEffect(HAHAEffectRegistry.PROWLING);
            player.getPersistentData().putInt("DesertProwlerStationaryTicks", 0);
            return;
        }

        int cooldownTicks = player.getPersistentData()
                .getInt("DesertProwlerCooldownTicks");

        boolean onCooldown = cooldownTicks > 0;

        if (cooldownTicks > 0) {
            cooldownTicks--;

            player.getPersistentData().putInt(
                    "DesertProwlerCooldownTicks",
                    cooldownTicks
            );
        }

        if (!player.isCrouching()) {
            player.removeEffect(HAHAEffectRegistry.PROWLING);
            player.getPersistentData().putInt("DesertProwlerStationaryTicks", 0);
            return;
        }

        double horizontalSpeed = player.getDeltaMovement().x * player.getDeltaMovement().x + player.getDeltaMovement().z * player.getDeltaMovement().z;
        boolean moving = horizontalSpeed > 0.0001D;

        if (moving) {
            player.removeEffect(HAHAEffectRegistry.PROWLING);
            player.getPersistentData().putInt("DesertProwlerStationaryTicks", 0);
            return;
        }

        int stationaryTicks = player.getPersistentData()
                .getInt("DesertProwlerStationaryTicks");

        stationaryTicks++;

        player.getPersistentData().putInt(
                "DesertProwlerStationaryTicks",
                stationaryTicks
        );

        if (!onCooldown && !player.hasEffect(HAHAEffectRegistry.PROWLING)) {

            player.addEffect(new MobEffectInstance(MobEffectRegistry.TRUE_INVISIBILITY, 40, 0, false, false, true));
            player.addEffect(new MobEffectInstance(HAHAEffectRegistry.PROWLING, 40, 0, false, true, true));
            player.getPersistentData().putInt("DesertProwlerCooldownTicks", 200);
        }
    }
}