package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose2;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class NoraStatueModelPose2 extends DefaultedBlockGeoModel<NoraStatueBlockEntityPose2> {
    public NoraStatueModelPose2() {
        super(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(NoraStatueBlockEntityPose2 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "geo/block/statue/nora_statue_pose_2.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NoraStatueBlockEntityPose2 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "textures/block/statue/nora_statue.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NoraStatueBlockEntityPose2 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "animations/item/block/nora_statue.animation.json");
    }
}
