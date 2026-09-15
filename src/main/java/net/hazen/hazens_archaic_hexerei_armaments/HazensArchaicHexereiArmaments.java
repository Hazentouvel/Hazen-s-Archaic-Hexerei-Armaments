package net.hazen.hazens_archaic_hexerei_armaments;

import net.hazen.hazens_archaic_hexerei_armaments.Config.HAHAServerConfig;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.*;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(HazensArchaicHexereiArmaments.MOD_ID)
public class HazensArchaicHexereiArmaments {
    public static final String MOD_ID = "hazens_archaic_hexerei_armaments";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HazensArchaicHexereiArmaments(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        HAHAItemRegistry.register(modEventBus);
        HAHASoundRegistry.register(modEventBus);
        HAHAEntityRegistry.register(modEventBus);
        HAHAEffectRegistry.register(modEventBus);
        HAHACreativeModeTabs.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);


        modContainer.registerConfig(ModConfig.Type.SERVER, HAHAServerConfig.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
