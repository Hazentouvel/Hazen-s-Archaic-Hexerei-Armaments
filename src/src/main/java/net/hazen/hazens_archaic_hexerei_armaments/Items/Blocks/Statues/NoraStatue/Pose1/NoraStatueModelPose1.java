package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose1;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class NoraStatueModelPose1 extends DefaultedBlockGeoModel<NoraStatueBlockEntityPose1> {
    public NoraStatueModelPose1() {
        super(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(NoraStatueBlockEntityPose1 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "geo/block/statue/nora_statue_pose_1.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NoraStatueBlockEntityPose1 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "textures/block/statue/nora_statue_sheathed.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NoraStatueBlockEntityPose1 animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "animations/item/block/nora_statue.animation.json");
    }
}
