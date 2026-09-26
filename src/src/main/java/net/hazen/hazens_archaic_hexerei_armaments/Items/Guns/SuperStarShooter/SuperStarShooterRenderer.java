package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.SuperStarShooter;

import io.redspace.irons_artifice.client.gun.GunInHandRenderer;
import io.redspace.irons_artifice.item.GunItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class SuperStarShooterRenderer extends GunInHandRenderer {
    public SuperStarShooterRenderer() {
        super(new SuperStarShooterModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
