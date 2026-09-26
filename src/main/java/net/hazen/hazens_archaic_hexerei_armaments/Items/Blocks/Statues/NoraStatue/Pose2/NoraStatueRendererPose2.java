package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose2;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class NoraStatueRendererPose2 extends GeoBlockRenderer<NoraStatueBlockEntityPose2> {

    public NoraStatueRendererPose2(BlockEntityRendererProvider.Context context) {
        super(new NoraStatueModelPose2());
    }
}
