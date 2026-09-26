package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.StarCannon;

import io.redspace.irons_artifice.client.gun.GunGeoModel;
import io.redspace.irons_artifice.item.GunItem;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class StarCannonModel extends GunGeoModel {
    public StarCannonModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(GunItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "geo/item/star_cannon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GunItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "textures/item/star_cannon.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GunItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "animations/item/star_cannon.animation.json");
    }
}
