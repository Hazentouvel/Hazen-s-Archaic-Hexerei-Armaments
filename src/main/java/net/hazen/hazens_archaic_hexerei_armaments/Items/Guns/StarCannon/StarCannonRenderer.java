package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.StarCannon;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.model.DefaultedItemGeoModel;
import com.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;
import io.redspace.irons_artifice.client.gun.GunInHandRenderer;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;

import net.minecraft.resources.Identifier;

public final class StarCannonRenderer extends GunInHandRenderer {
	public StarCannonRenderer() {
		super(new DefaultedItemGeoModel<>(
				Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "guns/star_cannon")
		));

		withRenderLayer(AutoGlowingGeoLayer::new);
	}
}