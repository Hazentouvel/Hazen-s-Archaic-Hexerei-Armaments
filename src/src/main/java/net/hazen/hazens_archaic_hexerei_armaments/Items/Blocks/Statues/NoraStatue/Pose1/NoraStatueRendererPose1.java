package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose1;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class NoraStatueRendererPose1 extends GeoBlockRenderer<NoraStatueBlockEntityPose1> {

    public NoraStatueRendererPose1(BlockEntityRendererProvider.Context context) {
        super(new NoraStatueModelPose1());
    }
}
