package net.hazen.hazens_archaic_hexerei_armaments.Datagen.Tags;

import io.redspace.irons_artifice.utils.IronsArtificeTags;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHAItemRegistry;
import net.hazen.hazentouvelib.Datagen.HLTags;
import net.hazen.hazentouvelib.Registries.HLItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class HAHAItemTagProvider extends ItemTagsProvider {
    public HAHAItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, HazensArchaicHexereiArmaments.MOD_ID, existingFileHelper);
    }

    //.add(GGItems.GEO_RUNE.get())

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(IronsArtificeTags.GUNS)
                .add(HAHAItemRegistry.ROYALTYS_BARREL.get())
                .add(HAHAItemRegistry.STAR_CANNON.get())
                .add(HAHAItemRegistry.SUPER_STAR_SHOOTER.get())
                .add(HAHAItemRegistry.TACTICAL_CROSSGUN.get())
        ;

        tag(HAHATags.Items.IRONCLAD_REPAIR)
                .add(HLItemRegistry.STEEL_INGOT.get())
        ;

        tag(HAHATags.Items.DESERT_PROWLER_REPAIR)
                .add(Items.LEATHER)
        ;

        tag(ItemTags.HEAD_ARMOR)
                .add(HAHAItemRegistry.IRONCLAD_HELMET.get())
                .add(HAHAItemRegistry.DESERT_PROWLER_HELMET.get())
        ;

        tag(ItemTags.CHEST_ARMOR)
                .add(HAHAItemRegistry.IRONCLAD_CHESTPLATE.get())
                .add(HAHAItemRegistry.DESERT_PROWLER_CHESTPLATE.get())
        ;

        tag(ItemTags.LEG_ARMOR)
                .add(HAHAItemRegistry.IRONCLAD_LEGGINGS.get())
                .add(HAHAItemRegistry.DESERT_PROWLER_LEGGINGS.get())
        ;

        tag(ItemTags.FOOT_ARMOR)
                .add(HAHAItemRegistry.IRONCLAD_BOOTS.get())
                .add(HAHAItemRegistry.DESERT_PROWLER_BOOTS.get())
        ;

    }
}