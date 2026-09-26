package net.hazen.hazens_archaic_hexerei_armaments.Datagen.Tags;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class HAHATags {

    public static class Items {

        public static final TagKey<Item> IRONCLAD_REPAIR = ItemTags
                .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "ironclad_repair").toString()));
        public static final TagKey<Item> CLOCKWORK_ARTIFICER_REPAIR = ItemTags
                .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "clockwork_artificer_repair").toString()));
        public static final TagKey<Item> DESERT_PROWLER_REPAIR = ItemTags
                .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "desert_prowler_repair").toString()));
        public static final TagKey<Item> ROYAL_OFFICER_GARMENTS_REPAIR = ItemTags
                .create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "royal_officer_garments_repair").toString()));

    }


}