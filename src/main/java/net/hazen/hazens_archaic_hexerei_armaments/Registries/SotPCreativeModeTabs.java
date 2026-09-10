package net.hazen.hazens_archaic_hexerei_armaments.Registries;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SotPCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HazensArchaicHexereiArmaments.MOD_ID);

    public static final Supplier<CreativeModeTab> SOTP_ITEMS = CREATIVE_MODE_TABS.register("hazens_archaic_hexerei_armaments_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SotPItemRegistry.IRONCLAD_HELMET.get()))
                    .title(Component.translatable("creativetab.hazens_archaic_hexerei_armaments.items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        /*
                        *** Armor
                         */

                        // Ironclad
                        output.accept(SotPItemRegistry.IRONCLAD_HELMET);
                        output.accept(SotPItemRegistry.IRONCLAD_CHESTPLATE);
                        output.accept(SotPItemRegistry.IRONCLAD_LEGGINGS);
                        output.accept(SotPItemRegistry.IRONCLAD_BOOTS);

                        // Desert Prowler
                        output.accept(SotPItemRegistry.DESERT_PROWLER_HELMET);
                        output.accept(SotPItemRegistry.DESERT_PROWLER_CHESTPLATE);
                        output.accept(SotPItemRegistry.DESERT_PROWLER_LEGGINGS);
                        output.accept(SotPItemRegistry.DESERT_PROWLER_BOOTS);

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}