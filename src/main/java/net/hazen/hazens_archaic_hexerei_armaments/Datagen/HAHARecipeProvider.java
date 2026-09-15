package net.hazen.hazens_archaic_hexerei_armaments.Datagen;

import io.redspace.irons_artifice.registry.ItemRegistry;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHAItemRegistry;
import net.hazen.hazentouvelib.Registries.HLItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import java.util.concurrent.CompletableFuture;

public class HAHARecipeProvider extends RecipeProvider {
    public HAHARecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new HAHARecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "TutorialMod Recipes";
        }
    }

    @Override
    protected void buildRecipes() {

        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.ROYALTYS_BARREL.get())
                .pattern("CQ ")
                .pattern("SMQ")
                .pattern(" BD")
                .define('D', ItemRegistry.BLUNDERBUSS.get())
                .define('C', ItemRegistry.CLOCKWORK_COMPONENTS.get())
                .define('M', ItemRegistry.MECHANICAL_COMPONENTS.get())
                .define('S', HLItemRegistry.STEEL_INGOT.get())
                .define('Q', Items.QUARTZ)
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .unlockedBy(getHasName(HLItemRegistry.STEEL_INGOT.get()), has(HLItemRegistry.STEEL_INGOT))
                .group("gun")
                .save(output);

        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.STAR_CANNON.get())
                .pattern(" II")
                .pattern("CSB")
                .pattern("RC ")
                .define('R', ItemRegistry.CLOCKWORK_RIFLE.get())
                .define('C', ItemRegistry.CLOCKWORK_COMPONENTS.get())
                .define('B', ItemRegistry.BLACKPOWDER.get())
                .define('I', HLItemRegistry.STEEL_INGOT.get())
                .define('S', Items.NETHER_STAR)
                .unlockedBy(getHasName(ItemRegistry.CLOCKWORK_RIFLE.get()), has(ItemRegistry.CLOCKWORK_RIFLE))
                .group("gun")
                .save(output);

        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.SUPER_STAR_SHOOTER.get())
                .pattern(" MB")
                .pattern("CSN")
                .pattern("RC ")
                .define('R', HAHAItemRegistry.STAR_CANNON.get())
                .define('C', ItemRegistry.CLOCKWORK_COMPONENTS.get())
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .define('M', ItemRegistry.MECHANICAL_COMPONENTS.get())
                .define('N', Items.NETHERITE_INGOT)
                .define('S', Items.NETHERITE_SCRAP)
                .unlockedBy(getHasName(HAHAItemRegistry.STAR_CANNON.get()), has(HAHAItemRegistry.STAR_CANNON))
                .group("gun")
                .save(output);


        /*
        *** Armor
         */

        // Ironclad
        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.IRONCLAD_HELMET.get())
                .pattern("SBS")
                .pattern("NIN")
                .define('I', Items.IRON_HELMET)
                .define('N', Items.NETHERITE_SCRAP)
                .define('S', HLItemRegistry.STEEL_INGOT.get())
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .unlockedBy(getHasName(HLItemRegistry.STEEL_INGOT.get()), has(HLItemRegistry.STEEL_INGOT))
                .group("ironclad")
                .save(output);

        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.IRONCLAD_CHESTPLATE.get())
                .pattern("N N")
                .pattern("SIS")
                .pattern("BSB")
                .define('I', Items.IRON_CHESTPLATE)
                .define('N', Items.NETHERITE_SCRAP)
                .define('S', HLItemRegistry.STEEL_INGOT.get())
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .unlockedBy(getHasName(HLItemRegistry.STEEL_INGOT.get()), has(HLItemRegistry.STEEL_INGOT))
                .group("ironclad")
                .save(output);

        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.IRONCLAD_LEGGINGS.get())
                .pattern("BSB")
                .pattern("NIN")
                .pattern("S S")
                .define('I', Items.IRON_LEGGINGS)
                .define('N', Items.NETHERITE_SCRAP)
                .define('S', HLItemRegistry.STEEL_INGOT.get())
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .unlockedBy(getHasName(HLItemRegistry.STEEL_INGOT.get()), has(HLItemRegistry.STEEL_INGOT))
                .group("ironclad")
                .save(output);

        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.IRONCLAD_BOOTS.get())
                .pattern("   ")
                .pattern("SNS")
                .pattern("BIB")
                .define('I', Items.IRON_BOOTS)
                .define('N', Items.NETHERITE_SCRAP)
                .define('S', HLItemRegistry.STEEL_INGOT.get())
                .define('B', HLItemRegistry.STEEL_BLOCK_ITEM.get())
                .unlockedBy(getHasName(HLItemRegistry.STEEL_INGOT.get()), has(HLItemRegistry.STEEL_INGOT))
                .group("ironclad")
                .save(output);

        // Desert Prowler
        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.DESERT_PROWLER_HELMET.get())
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
                .save(output);

        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.DESERT_PROWLER_CHESTPLATE.get())
                .pattern("GMG")
                .pattern("LDL")
                .pattern("BLB")
                .define('M', ItemRegistry.MECHANICAL_COMPONENTS.get())
                .define('B', ItemRegistry.BLACKPOWDER.get())
                .define('L', Items.LEATHER)
                .define('G', Items.GOLD_INGOT)
                .define('D', Items.DIAMOND_CHESTPLATE)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .group("desert_prowler")
                .save(output);

        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.DESERT_PROWLER_LEGGINGS.get())
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
                .save(output);

        shaped(RecipeCategory.COMBAT, HAHAItemRegistry.DESERT_PROWLER_BOOTS.get())
                .pattern("   ")
                .pattern("BDB")
                .pattern("LML")
                .define('M', ItemRegistry.MECHANICAL_COMPONENTS.get())
                .define('B', ItemRegistry.BLACKPOWDER.get())
                .define('L', Items.LEATHER)
                .define('D', Items.DIAMOND_CHESTPLATE)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .group("desert_prowler")
                .save(output);

    }


}