package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose3.Item;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class NoraStatueItemModelPose3 extends DefaultedItemGeoModel<NoraStatueItemPose3> {
    public NoraStatueItemModelPose3() {
        super(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(NoraStatueItemPose3 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "geo/block/statue/nora_statue_pose_3.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NoraStatueItemPose3 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "textures/block/statue/nora_eclipse_statue.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NoraStatueItemPose3 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "animations/item/block/nora_statue.animation.json");
    }
}
