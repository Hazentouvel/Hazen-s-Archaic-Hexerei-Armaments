package net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.Ironclad;

import com.geckolib.model.DefaultedItemGeoModel;
import com.geckolib.renderer.GeoArmorRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public final class IroncladArmorRenderer<R extends HumanoidRenderState & GeoRenderState> extends GeoArmorRenderer<IroncladArmor, R> {
	public IroncladArmorRenderer() {
		super(new DefaultedItemGeoModel<>(Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "armor/fossil_armor")));
	}
}