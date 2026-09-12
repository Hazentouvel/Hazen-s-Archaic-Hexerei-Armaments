package net.hazen.hazens_archaic_hexerei_armaments.Registries;

import io.redspace.irons_artifice.item.GunItem;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.DesertProwler.DesertProwlerArmor;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.Ironclad.IroncladArmor;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.HAHAGuns;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Utils.HAHAArmorMaterials;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HAHAItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HazensArchaicHexereiArmaments.MOD_ID);

    /*
    *** Modifiers
     */

    /*
    *** Guns
     */

    // Double Barrel Shotgun
    public static final DeferredItem<GunItem> ROYALTYS_BARREL = ITEMS.registerItem("royaltys_barrel",
            properties -> new GunItem(properties, HAHAGuns.ROYALTYS_BARREL)
    );

    /*
    *** Armor
     */

    public static final DeferredItem<Item> IRONCLAD_HELMET = ITEMS.registerItem(
            "ironclad_helmet",
            properties -> new IroncladArmor(properties.humanoidArmor(HAHAArmorMaterials.IRONCLAD_MATERIAL, ArmorType.HELMET), ArmorType.HELMET));
    public static final DeferredItem<Item> IRONCLAD_CHESTPLATE = ITEMS.registerItem(
            "ironclad_chestplate",
            properties -> new IroncladArmor(properties.humanoidArmor(HAHAArmorMaterials.IRONCLAD_MATERIAL, ArmorType.CHESTPLATE), ArmorType.CHESTPLATE));
    public static final DeferredItem<Item> IRONCLAD_LEGGINGS = ITEMS.registerItem(
            "ironclad_leggings",
            properties -> new IroncladArmor(properties.humanoidArmor(HAHAArmorMaterials.IRONCLAD_MATERIAL, ArmorType.LEGGINGS), ArmorType.LEGGINGS));
    public static final DeferredItem<Item> IRONCLAD_BOOTS = ITEMS.registerItem(
            "ironclad_boots",
            properties -> new IroncladArmor(properties.humanoidArmor(HAHAArmorMaterials.IRONCLAD_MATERIAL, ArmorType.BOOTS), ArmorType.BOOTS));


    public static final DeferredItem<Item> DESERT_PROWLER_HELMET = ITEMS.registerItem(
            "desert_prowler_helmet",
            properties -> new DesertProwlerArmor(properties.humanoidArmor(HAHAArmorMaterials.DESERT_PROWLER_MATERIAL, ArmorType.HELMET), ArmorType.HELMET));
    public static final DeferredItem<Item> DESERT_PROWLER_CHESTPLATE = ITEMS.registerItem(
            "desert_prowler_chestplate",
            properties -> new DesertProwlerArmor(properties.humanoidArmor(HAHAArmorMaterials.DESERT_PROWLER_MATERIAL, ArmorType.CHESTPLATE), ArmorType.CHESTPLATE));
    public static final DeferredItem<Item> DESERT_PROWLER_LEGGINGS = ITEMS.registerItem(
            "desert_prowler_leggings",
            properties -> new DesertProwlerArmor(properties.humanoidArmor(HAHAArmorMaterials.DESERT_PROWLER_MATERIAL, ArmorType.LEGGINGS), ArmorType.LEGGINGS));
    public static final DeferredItem<Item> DESERT_PROWLER_BOOTS = ITEMS.registerItem(
            "desert_prowler_boots",
            properties -> new DesertProwlerArmor(properties.humanoidArmor(HAHAArmorMaterials.DESERT_PROWLER_MATERIAL, ArmorType.BOOTS), ArmorType.BOOTS));


    public static void register(IEventBus modEventBus){
        ITEMS.register(modEventBus);
    }
}