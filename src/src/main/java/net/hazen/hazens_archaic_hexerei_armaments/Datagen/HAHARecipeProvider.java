package net.hazen.hazens_archaic_hexerei_armaments.Datagen;

import io.redspace.irons_artifice.registry.ItemRegistry;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHAItemRegistry;
import net.hazen.hazentouvelib.Registries.HLItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
//import net.warphan.iss_magicfromtheeast.registries.MFTEItemRegistries;

import java.util.concurrent.CompletableFuture;

public class HAHARecipeProvider extends RecipeProvider implements IConditionBuilder {
    public HAHARecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        /*
        *** Statue
         */
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Items.STONE),
                        RecipeCategory.MISC,
                        HAHAItemRegistry.NORA_STATUE_POSE_1.get())
                .unlockedBy("has_stone", has(Items.STONE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID,
                        "stonecutter/statues/nora_statue_pose_1"));
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Items.STONE),
                        RecipeCategory.MISC,
                        HAHAItemRegistry.NORA_STATUE_POSE_2.get())
                .unlockedBy("has_stone", has(Items.STONE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID,
                        "stonecutter/statues/nora_statue_pose_2"));
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Items.STONE),
                        RecipeCategory.MISC,
                        HAHAItemRegistry.NORA_STATUE_POSE_3.get())
                .unlockedBy("has_stone", has(Items.STONE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID,
                        "stonecutter/statues/nora_statue_pose_3"));
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Items.STONE),
                        RecipeCategory.MISC,
                        HAHAItemRegistry.NORA_STATUE_POSE_4.get())
                .unlockedBy("has_stone", has(Items.STONE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID,
                        "stonecutter/statues/nora_statue_pose_4"));


        /*
        *** Guns
         */

        // Royalty's Barrel
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.ROYALTYS_BARREL.get())
                .pattern("CQ ")
                .pattern("EMQ")
                .pattern(" SD")
                .define('D', io.redspace.irons_artifice.registry.ItemRegistry.BLUNDERBUSS.get())
                .define('C', io.redspace.irons_artifice.registry.ItemRegistry.CLOCKWORK_COMPONENTS.get())
                .define('M', io.redspace.irons_artifice.registry.ItemRegistry.MECHANICAL_COMPONENTS.get())
                .define('E', io.redspace.ironsspellbooks.registries.ItemRegistry.CINDER_ESSENCE.get())
                .define('Q', Items.QUARTZ)
                .define('S', Items.NETHERITE_SCRAP)
                .unlockedBy(getHasName(io.redspace.ironsspellbooks.registries.ItemRegistry.CINDER_ESSENCE.get()), has(io.redspace.ironsspellbooks.registries.ItemRegistry.CINDER_ESSENCE.get()))
                .group("gun")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/guns/royaltys_barrel"));

        // Tactical Crossgun
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.TACTICAL_CROSSGUN.get())
                .pattern("MS ")
                .pattern("SCE")
                .pattern(" PN")
                .define('P', io.redspace.irons_artifice.registry.ItemRegistry.OVERCHARGED_POWDER.get())
                .define('C', HAHAItemRegistry.WARHOG_COG.get())
                .define('N', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .define('E', io.redspace.ironsspellbooks.registries.ItemRegistry.CINDER_ESSENCE.get())
                .define('M', io.redspace.ironsspellbooks.registries.ItemRegistry.MITHRIL_INGOT.get())
                .define('S', io.redspace.ironsspellbooks.registries.ItemRegistry.MITHRIL_SCRAP.get())
                .unlockedBy(getHasName(io.redspace.ironsspellbooks.registries.ItemRegistry.MITHRIL_INGOT.get()), has(io.redspace.ironsspellbooks.registries.ItemRegistry.MITHRIL_INGOT.get()))
                .group("gun")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/guns/tactical_crossgun"));

        // Star Cannon
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.STAR_CANNON.get())
                .pattern(" II")
                .pattern("CSB")
                .pattern("RC ")
                .define('R', ItemRegistry.CLOCKWORK_RIFLE.get())
                .define('C', HAHAItemRegistry.WARHOG_COG.get())
                .define('B', ItemRegistry.BLACKPOWDER.get())
                .define('I', io.redspace.ironsspellbooks.registries.ItemRegistry.MITHRIL_SCRAP.get())
                .define('S', Items.NETHER_STAR)
                .unlockedBy(getHasName(ItemRegistry.CLOCKWORK_RIFLE.get()), has(ItemRegistry.CLOCKWORK_RIFLE))
                .group("gun")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/guns/star_cannon"));

        // Super Star Shooter
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.SUPER_STAR_SHOOTER.get())
                .pattern(" MB")
                .pattern("CSN")
                .pattern("RC ")
                .define('R', HAHAItemRegistry.STAR_CANNON.get())
                .define('C', HAHAItemRegistry.WARHOG_COG.get())
                .define('B', io.redspace.ironsspellbooks.registries.ItemRegistry.MITHRIL_INGOT.get())
                .define('M', ItemRegistry.CLOCKWORK_COMPONENTS.get())
                .define('N', Items.NETHERITE_INGOT)
                .define('S', Items.NETHERITE_SCRAP)
                .unlockedBy(getHasName(HAHAItemRegistry.STAR_CANNON.get()), has(HAHAItemRegistry.STAR_CANNON))
                .group("gun")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/guns/super_star_shooter"));

        /*
        *** Materials
         */

        // Warhog Cog
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.WARHOG_COG.get(), 2)
                .pattern("CBS")
                .pattern("RNR")
                .pattern("SBC")
                .define('C', io.redspace.irons_artifice.registry.ItemRegistry.CLOCKWORK_COMPONENTS.get())
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .define('N', Items.NETHERITE_INGOT)
                .define('S', Items.NETHERITE_SCRAP)
                .define('R', Items.REDSTONE)
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .group("gun")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/materials/warhog_cog"));


        /*
        *** Armor
         */

       // Ironclad
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.IRONCLAD_HELMET.get())
                .pattern("SBS")
                .pattern("NIN")
                .define('I', Items.IRON_HELMET)
                .define('N', Items.NETHERITE_SCRAP)
                .define('S', HLItemRegistry.STEEL_INGOT.get())
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .unlockedBy(getHasName(HLItemRegistry.STEEL_INGOT.get()), has(HLItemRegistry.STEEL_INGOT))
                .group("ironclad")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/armor/ironclad/ironclad_helmet"));

            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.IRONCLAD_CHESTPLATE.get())
                .pattern("N N")
                .pattern("SIS")
                .pattern("BSB")
                .define('I', Items.IRON_CHESTPLATE)
                .define('N', Items.NETHERITE_SCRAP)
                .define('S', HLItemRegistry.STEEL_INGOT.get())
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .unlockedBy(getHasName(HLItemRegistry.STEEL_INGOT.get()), has(HLItemRegistry.STEEL_INGOT))
                .group("ironclad")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/armor/ironclad/ironclad_chestplate"));

            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.IRONCLAD_LEGGINGS.get())
                .pattern("BSB")
                .pattern("NIN")
                .pattern("S S")
                .define('I', Items.IRON_LEGGINGS)
                .define('N', Items.NETHERITE_SCRAP)
                .define('S', HLItemRegistry.STEEL_INGOT.get())
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .unlockedBy(getHasName(HLItemRegistry.STEEL_INGOT.get()), has(HLItemRegistry.STEEL_INGOT))
                .group("ironclad")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/armor/ironclad/ironclad_leggings"));

            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.IRONCLAD_BOOTS.get())
                .pattern("   ")
                .pattern("SNS")
                .pattern("BIB")
                .define('I', Items.IRON_BOOTS)
                .define('N', Items.NETHERITE_SCRAP)
                .define('S', HLItemRegistry.STEEL_INGOT.get())
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .unlockedBy(getHasName(HLItemRegistry.STEEL_INGOT.get()), has(HLItemRegistry.STEEL_INGOT))
                .group("ironclad")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/armor/ironclad/ironclad_boots"));

        // Desert Prowler
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.DESERT_PROWLER_HELMET.get())
                .pattern(" G ")
                .pattern("LML")
                .pattern("BDB")
                .define('M', ItemRegistry.MECHANICAL_COMPONENTS.get())
                .define('B', ItemRegistry.BLACKPOWDER.get())
                .define('L', Items.LEATHER)
                .define('G', Items.GOLD_INGOT)
                .define('D', Items.DIAMOND_HELMET)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .group("desert_prowler")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/armor/desert_prowler/desert_prowler_helmet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.DESERT_PROWLER_CHESTPLATE.get())
                .pattern("GMG")
                .pattern("LDL")
                .pattern("BLB")
                .define('M', io.redspace.irons_artifice.registry.ItemRegistry.MECHANICAL_COMPONENTS.get())
                .define('B', ItemRegistry.BLACKPOWDER.get())
                .define('L', Items.LEATHER)
                .define('G', Items.GOLD_INGOT)
                .define('D', Items.DIAMOND_CHESTPLATE)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .group("desert_prowler")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/armor/desert_prowler/desert_prowler_chestplate"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.DESERT_PROWLER_LEGGINGS.get())
                .pattern("GMG")
                .pattern("LDL")
                .pattern("B B")
                .define('M', ItemRegistry.MECHANICAL_COMPONENTS.get())
                .define('B', ItemRegistry.BLACKPOWDER.get())
                .define('L', Items.LEATHER)
                .define('G', Items.GOLD_INGOT)
                .define('D', Items.DIAMOND_CHESTPLATE)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .group("desert_prowler")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/armor/desert_prowler/desert_prowler_leggings"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, HAHAItemRegistry.DESERT_PROWLER_BOOTS.get())
                .pattern("   ")
                .pattern("BDB")
                .pattern("LML")
                .define('M', ItemRegistry.MECHANICAL_COMPONENTS.get())
                .define('B', ItemRegistry.BLACKPOWDER.get())
                .define('L', Items.LEATHER)
                .define('D', Items.DIAMOND_CHESTPLATE)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .group("desert_prowler")
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "crafting/armor/desert_prowler/desert_prowler_boots"));


    }
}