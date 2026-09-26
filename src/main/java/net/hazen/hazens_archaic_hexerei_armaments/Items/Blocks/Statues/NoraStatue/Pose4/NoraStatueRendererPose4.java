package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose4;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class NoraStatueRendererPose4 extends GeoBlockRenderer<NoraStatueBlockEntityPose4> {

    public NoraStatueRendererPose4(BlockEntityRendererProvider.Context context) {
        super(new NoraStatueModelPose4());
    }
}
