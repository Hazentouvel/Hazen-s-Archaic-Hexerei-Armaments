package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.StarCannon;

import io.redspace.irons_artifice.client.gun.GunInHandRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class StarCannonRenderer extends GunInHandRenderer {
    public StarCannonRenderer() {
        super(new StarCannonModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
