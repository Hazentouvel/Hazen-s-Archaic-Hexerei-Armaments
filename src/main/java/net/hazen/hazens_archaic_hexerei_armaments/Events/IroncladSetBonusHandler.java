package net.hazen.hazens_archaic_hexerei_armaments.Events;

import io.redspace.irons_artifice.entity.Bullet;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.Ironclad.IroncladArmor;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

@EventBusSubscriber(modid = HazensArchaicHexereiArmaments.MOD_ID)
public class IroncladSetBonusHandler {

    public static final float BULLET_RESISTANCE = 0.3F;
    public static final float PROJECTILE_RESISTANCE = 0.1F;

    private static boolean IroncladArmorSetBonus(LivingEntity entity) {
        return entity.getItemBySlot(ArmorType.HELMET.getSlot()).getItem() instanceof IroncladArmor &&
                entity.getItemBySlot(ArmorType.CHESTPLATE.getSlot()).getItem() instanceof IroncladArmor &&
                entity.getItemBySlot(ArmorType.LEGGINGS.getSlot()).getItem() instanceof IroncladArmor &&
                entity.getItemBySlot(ArmorType.BOOTS.getSlot()).getItem() instanceof IroncladArmor;
    }

    @SubscribeEvent
    public static void onLivingIncomingDamage(LivingIncomingDamageEvent event) {
        LivingEntity livingEntity = event.getEntity();

        if (!IroncladArmorSetBonus(livingEntity)) {
            return;
        }

        DamageSource source = event.getSource();

        if (source.getDirectEntity() instanceof Projectile projectile) {

            if (projectile instanceof Bullet) {
                event.setAmount(event.getAmount() * BULLET_RESISTANCE);
            }
            else {
                event.setAmount(event.getAmount() * PROJECTILE_RESISTANCE);
            }
        }
    }

}