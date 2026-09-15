package net.hazen.hazens_archaic_hexerei_armaments.Datagen;

import net.hazen.hazens_archaic_hexerei_armaments.Datagen.Tags.HAHAItemTagsProvider;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = HazensArchaicHexereiArmaments.MOD_ID)
public class HAHADataGenerators {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();


        generator.addProvider(true, new HAHARecipeProvider.Runner(packOutput, lookupProvider));
        generator.addProvider(true, new HAHAItemTagsProvider(packOutput, lookupProvider));
    }
}