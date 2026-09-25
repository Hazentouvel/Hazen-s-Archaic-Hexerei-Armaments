package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.TacticalCrossgun;

import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.animation.AnimationController;
import com.geckolib.animation.RawAnimation;
import com.geckolib.animation.object.PlayState;
import com.geckolib.util.GeckoLibUtil;
import io.redspace.irons_artifice.client.sounds.GunShotSoundSettings;
import io.redspace.irons_artifice.data.*;
import io.redspace.irons_artifice.entity.Bullet;
import io.redspace.irons_artifice.gun.ArmPoseKind;
import io.redspace.irons_artifice.gun.GunProfile;
import io.redspace.irons_artifice.item.GunItem;
import io.redspace.irons_artifice.registry.SoundRegistry;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.HAHAGuns;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.NonNull;

import java.util.Map;

public class TacticalCrossgun extends GunItem implements GeoItem {
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public TacticalCrossgun(Properties properties) {
        super(properties
                        .rarity(Rarity.EPIC),
                HAHAGuns.TACTICAL_CROSSGUN
        );
    }
//
//    @Override
//    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
//        if (entity instanceof Player player) {
//            if (level.isClientSide) {
//                if (this.type == Type.CHESTPLATE && player.getItemBySlot(EquipmentSlot.CHEST) == stack && HLKeybinds.ABILITY_1.consumeClick()) {
//                    PacketDistributor.sendToServer(new HLMessageArmorKey(EquipmentSlot.CHEST.ordinal(), player.getId(), 5), new CustomPacketPayload[0]);
//                    this.onKeyPacket(player, stack, 5);
//                }
//                return;
//            }
//        }
//
//
//    }

//    public void registerControllers(AnimatableManager.@NonNull ControllerRegistrar controllers) {
//        super.registerControllers(controllers);
//        controllers.add(new AnimationController("gun_animation_controller", this::gunIdleHandler));
//        controllers.add((new GunItem.OffsetableAnimationController("Actions", (test) -> PlayState.STOP)).triggerableAnim("fire", RawAnimation.begin().thenPlay("fire")).triggerableAnim("reload", RawAnimation.begin().thenPlay("reload")).triggerableAnim("equip", RawAnimation.begin().thenPlay("equip")));
//    }

    @Override
    public void registerControllers(final AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return geoCache;
    }
}