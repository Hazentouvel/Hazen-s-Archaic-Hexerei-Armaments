package net.hazen.hazens_archaic_hexerei_armaments.Datagen.Tags;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class HAHATags {

    public static class Blocks {


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, name));
        }
    }


    public static class Items {
        public static final TagKey<Item> IRONCLAD_REPAIR = createTag("ironclad_repair");
        public static final TagKey<Item> CLOCKWORK_ARTIFICER_REPAIR = createTag("clockwork_artificer_repair");
        public static final TagKey<Item> DESERT_PROWLER_REPAIR = createTag("desert_prowler_repair");
        public static final TagKey<Item> ROYAL_OFFICER_GARMENTS_REPAIR = createTag("royal_officer_garments_repair");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, name));
        }


    }
}