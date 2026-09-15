package net.hazen.hazens_archaic_hexerei_armaments.Events;

import io.redspace.irons_artifice.api.ComposeShotEvent;
import io.redspace.irons_artifice.data.ShotComponents;
import io.redspace.irons_artifice.data.Value;
import io.redspace.irons_artifice.data.ValueModifier;
import net.hazen.hazens_archaic_hexerei_armaments.Config.HAHAServerConfig;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.DesertProwler.DesertProwlerArmor;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHAEffectRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = HazensArchaicHexereiArmaments.MOD_ID)
public class DesertProwlerSetBonusHandler {
    public static final double DAMAGE_INCREASE = 0.75;

    private static boolean DesertProwlerArmorSetBonus(LivingEntity entity) {
        return entity.getItemBySlot(ArmorType.HELMET.getSlot()).getItem() instanceof DesertProwlerArmor &&
                entity.getItemBySlot(ArmorType.CHESTPLATE.getSlot()).getItem() instanceof DesertProwlerArmor &&
                entity.getItemBySlot(ArmorType.LEGGINGS.getSlot()).getItem() instanceof DesertProwlerArmor &&
                entity.getItemBySlot(ArmorType.BOOTS.getSlot()).getItem() instanceof DesertProwlerArmor;
    }

    private static int getCooldownTicks() {
        return HAHAServerConfig.desertProwlerCooldown * 20;
    }


    @SubscribeEvent
    public static void onComposeShot(ComposeShotEvent event) {
        LivingEntity player = event.getEntity();

        if (!DesertProwlerArmorSetBonus(player)) {
            return;
        }

        Value damage = (Value) event.getShotProfile().get(ShotComponents.DAMAGE);
        if (player.hasEffect(HAHAEffectRegistry.PROWLING)) {
            damage.addModifier(new ValueModifier(DAMAGE_INCREASE, ValueModifier.Operation.MULTIPLY_TOTAL, ValueModifier.Type.BENEFICIAL));
            return;
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
                .getInt("DesertProwlerCooldownTicks")
                .orElse(0);

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
                .getInt("DesertProwlerStationaryTicks")
                .orElse(0);

        stationaryTicks++;

        player.getPersistentData().putInt(
                "DesertProwlerStationaryTicks",
                stationaryTicks
        );

        if (!onCooldown && !player.hasEffect(HAHAEffectRegistry.PROWLING)) {

            player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 40, 0, false, false, true));
            player.addEffect(new MobEffectInstance(HAHAEffectRegistry.PROWLING, 40, 0, false, true, true));
            player.getPersistentData().putInt("DesertProwlerCooldownTicks", getCooldownTicks());
        }
    }
}