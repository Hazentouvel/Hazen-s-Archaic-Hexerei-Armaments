package net.hazen.hazens_archaic_hexerei_armaments.Events;

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

    private static boolean IroncladArmorSetBonus(LivingEntity entity) {
        return entity.getItemBySlot(ArmorType.HELMET.getSlot()).getItem() instanceof IroncladArmor &&
                entity.getItemBySlot(ArmorType.CHESTPLATE.getSlot()).getItem() instanceof IroncladArmor &&
                entity.getItemBySlot(ArmorType.LEGGINGS.getSlot()).getItem() instanceof IroncladArmor &&
                entity.getItemBySlot(ArmorType.BOOTS.getSlot()).getItem() instanceof IroncladArmor;
    }

    @SubscribeEvent
    public static void onLivingIncomingDamage(LivingIncomingDamageEvent event) {
        LivingEntity livingEntity = event.getEntity();
        if (!livingEntity.getCommandSenderWorld().isClientSide && isCoruscatedValor(livingEntity)) {
            if (!event.isCanceled()) {
                ChargeEffect.addChargeStack(livingEntity, event.getSource().getEntity());
            }
        }
    }

    public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
        if (isDying()) {
            return false;
        }

        if(this.isAlliedTo(source.getEntity())){
            return false;
        }

        if (source.getDirectEntity() instanceof Projectile) {
            amount *= 0.5F;
        }

        float reduced = amount * (1.0F - damageReduction());

        if (reduced >= this.getHealth()) {
            beginDeathSequence(source);
            return true;
        }

        return super.hurtServer(level, source, reduced);
    }

}