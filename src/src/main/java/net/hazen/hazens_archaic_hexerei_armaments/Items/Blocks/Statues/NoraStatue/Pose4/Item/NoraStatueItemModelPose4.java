package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose4.Item;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class NoraStatueItemModelPose4 extends DefaultedItemGeoModel<NoraStatueItemPose4> {
    public NoraStatueItemModelPose4() {
        super(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(NoraStatueItemPose4 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "geo/block/statue/nora_statue_pose_4.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NoraStatueItemPose4 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "textures/block/statue/nora_eclipse_statue_sheathed.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NoraStatueItemPose4 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "animations/item/block/nora_statue.animation.json");
    }
}
