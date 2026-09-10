package net.hazen.hazens_archaic_hexerei_armaments.Items.Utils;

import com.google.common.collect.Maps;
import io.redspace.ironslib.registry.IronsLibRegistries;
import net.hazen.hazens_archaic_hexerei_armaments.Datagen.Tags.HAHATags;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazentouvelib.Utils.AdditionalArmorAttributes;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.List;
import java.util.Map;

public class HAHAArmorMaterials {
    private static ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static ResourceKey<EquipmentAsset> IRONCLAD_KEY = ResourceKey.create(ROOT_ID,
            Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "ironclad"));

    public static ResourceKey<EquipmentAsset> DESERT_PROWLER_KEY = ResourceKey.create(ROOT_ID,
            Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "desert_prowler"));

    public static ResourceKey<EquipmentAsset> ROYAL_OFFICER_GARMENTS_KEY = ResourceKey.create(ROOT_ID,
            Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "royal_officer_garments"));

    public static final ArmorMaterial IRONCLAD_MATERIAL = new ArmorMaterial(29,
            makeDefense(3, 6, 8, 3, 12), 18, SoundEvents.ARMOR_EQUIP_IRON,
            2f,
            0f,
            HAHATags.Items.IRONCLAD_REPAIR, IRONCLAD_KEY);

    public static final List<AdditionalArmorAttributes.CustomAttribute> IRONCLAD_ATTRIBUTES =
            List.of(
                    new AdditionalArmorAttributes.CustomAttribute(Attributes.MAX_HEALTH, Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID,
                            "max_health"), 2, AttributeModifier.Operation.ADD_VALUE)
            );

    public static final ArmorMaterial DESERT_PROWLER_MATERIAL = new ArmorMaterial(29,
            makeDefense(1, 1, 3, 1, 12), 18, SoundEvents.ARMOR_EQUIP_GOLD,
            2f,
            0f,
            HAHATags.Items.DESERT_PROWLER_REPAIR, DESERT_PROWLER_KEY);

    public static final List<AdditionalArmorAttributes.CustomAttribute> DESERT_PROWLER_ATTRIBUTES =
            List.of(
                    new AdditionalArmorAttributes.CustomAttribute(IronsLibRegistries.AttributeRegistry.CRIT_DAMAGE, Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID,
                            "crit"), 0.05, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
            );

    public static final ArmorMaterial ROYAL_OFFICER_GARMENTS_MATERIAL = new ArmorMaterial(29,
            makeDefense(1, 1, 3, 1, 12), 18, SoundEvents.ARMOR_EQUIP_GOLD,
            2f,
            0f,
            HAHATags.Items.ROYAL_OFFICER_GARMENTS_REPAIR, ROYAL_OFFICER_GARMENTS_KEY);


    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );
    }
}