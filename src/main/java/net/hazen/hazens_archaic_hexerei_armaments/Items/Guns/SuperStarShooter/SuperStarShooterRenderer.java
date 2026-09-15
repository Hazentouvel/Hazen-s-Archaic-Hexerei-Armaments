package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.SuperStarShooter;

import com.geckolib.model.DefaultedItemGeoModel;
import com.geckolib.renderer.GeoItemRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import com.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;
import io.redspace.irons_artifice.client.gun.GunInHandRenderer;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public final class SuperStarShooterRenderer extends GunInHandRenderer {
	public SuperStarShooterRenderer() {
		super(new DefaultedItemGeoModel<>(Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "guns/super_star_shooter")));
		withRenderLayer(AutoGlowingGeoLayer::new);
	}
}