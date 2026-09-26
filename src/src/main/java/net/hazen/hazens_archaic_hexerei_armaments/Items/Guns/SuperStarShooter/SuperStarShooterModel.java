package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.SuperStarShooter;

import io.redspace.irons_artifice.item.GunItem;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class SuperStarShooterModel extends DefaultedItemGeoModel<GunItem> {
    public SuperStarShooterModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(GunItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "geo/item/guns/super_star_shooter.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GunItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "textures/item/guns/super_star_shooter.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GunItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "animations/item/guns/super_star_shooter.animation.json");
    }
}
