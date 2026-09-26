package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose3;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class NoraStatueRendererPose3 extends GeoBlockRenderer<NoraStatueBlockEntityPose3> {

    public NoraStatueRendererPose3(BlockEntityRendererProvider.Context context) {
        super(new NoraStatueModelPose3());
    }
}
