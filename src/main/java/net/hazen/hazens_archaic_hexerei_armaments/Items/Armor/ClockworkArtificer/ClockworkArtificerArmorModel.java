package net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.ClockworkArtificer;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class ClockworkArtificerArmorModel extends DefaultedEntityGeoModel<ClockworkArtificerArmor> {
    public ClockworkArtificerArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(ClockworkArtificerArmor animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "geo/item/armor/clockwork_artificer_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ClockworkArtificerArmor animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "textures/item/armor/clockwork_artificer_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ClockworkArtificerArmor animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "animations/item/armor/clockwork_artificer_armor.animation.json");
    }
}