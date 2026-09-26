package net.hazen.hazens_archaic_hexerei_armaments;

import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.HAHABlockEntities;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.*;
import net.hazen.hazens_archaic_hexerei_armaments.Utils.Armor.HAHAArmorMaterials;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(HazensArchaicHexereiArmaments.MOD_ID)
public class HazensArchaicHexereiArmaments {
    public static final String MOD_ID = "hazens_archaic_hexerei_armaments";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HazensArchaicHexereiArmaments(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        HAHAItemRegistry.register(modEventBus);
        HAHAArmorMaterials.register(modEventBus);
        HAHASoundRegistry.register(modEventBus);
        HAHAEffectRegistry.register(modEventBus);
        HAHACreativeModeTabs.register(modEventBus);
        HAHABlockEntities.register(modEventBus);
        HAHABlockRegistry.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, HAHAConfig.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = HazensArchaicHexereiArmaments.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

    public static ResourceLocation id(@NotNull String path)
    {
        return ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, path);
    }
}
