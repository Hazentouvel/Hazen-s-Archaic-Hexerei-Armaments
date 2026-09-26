package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose3;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class NoraStatueModelPose3 extends DefaultedBlockGeoModel<NoraStatueBlockEntityPose3> {
    public NoraStatueModelPose3() {
        super(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(NoraStatueBlockEntityPose3 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "geo/block/statue/nora_statue_pose_3.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NoraStatueBlockEntityPose3 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "textures/block/statue/nora_eclipse_statue.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NoraStatueBlockEntityPose3 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "animations/item/block/nora_statue.animation.json");
    }
}
