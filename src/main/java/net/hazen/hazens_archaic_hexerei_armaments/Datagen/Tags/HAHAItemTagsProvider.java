package net.hazen.hazens_archaic_hexerei_armaments.Datagen.Tags;

import io.redspace.irons_artifice.utils.IronsArtificeTags;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHAItemRegistry;
import net.hazen.hazentouvelib.Registries.HLItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class HAHAItemTagsProvider extends ItemTagsProvider {
    public HAHAItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, HazensArchaicHexereiArmaments.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

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