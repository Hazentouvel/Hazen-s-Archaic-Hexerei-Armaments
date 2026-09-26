package net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.Ironclad;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class IroncladArmorModel extends DefaultedEntityGeoModel<IroncladArmor> {
    public IroncladArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(IroncladArmor animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "geo/item/armor/ironclad_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IroncladArmor animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "textures/item/armor/ironclad_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IroncladArmor animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}