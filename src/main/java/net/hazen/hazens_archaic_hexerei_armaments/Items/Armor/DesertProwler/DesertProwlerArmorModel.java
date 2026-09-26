package net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.DesertProwler;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class DesertProwlerArmorModel extends DefaultedEntityGeoModel<DesertProwlerArmor> {
    public DesertProwlerArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(DesertProwlerArmor animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "geo/item/armor/desert_prowler_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DesertProwlerArmor animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "textures/item/armor/desert_prowler_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DesertProwlerArmor animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}