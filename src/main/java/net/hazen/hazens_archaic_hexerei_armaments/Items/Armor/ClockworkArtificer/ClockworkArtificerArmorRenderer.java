package net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.ClockworkArtificer;

import io.redspace.ironslib.transmog.client.TransmogArmorRenderer;
import net.minecraft.world.phys.Vec3;

public class ClockworkArtificerArmorRenderer extends TransmogArmorRenderer<ClockworkArtificerArmor> {

    public ClockworkArtificerArmorRenderer(ClockworkArtificerArmorModel clockworkArtificerArmorModel) {
        super(new ClockworkArtificerArmorModel());

        this.withCapeBone(new CapeBone("cape", new Vec3(0.5F, 0.5F, 0.5F)));
    }


}