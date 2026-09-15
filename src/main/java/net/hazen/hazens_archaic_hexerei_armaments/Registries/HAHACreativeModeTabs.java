package net.hazen.hazens_archaic_hexerei_armaments.Registries;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class HAHACreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HazensArchaicHexereiArmaments.MOD_ID);

    public static final Supplier<CreativeModeTab> HAHA_ITEMS = CREATIVE_MODE_TABS.register("hazens_archaic_hexerei_armaments_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HAHAItemRegistry.IRONCLAD_HELMET.get()))
                    .title(Component.translatable("creativetab.hazens_archaic_hexerei_armaments.items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        /*
                        *** Guns
                         */

                        // Ironclad
                        output.accept(HAHAItemRegistry.ROYALTYS_BARREL);
                        output.accept(HAHAItemRegistry.STAR_CANNON);
                        output.accept(HAHAItemRegistry.SUPER_STAR_SHOOTER);

                        /*
                        *** Armor
                         */

                        // Ironclad
                        output.accept(HAHAItemRegistry.IRONCLAD_HELMET);
                        output.accept(HAHAItemRegistry.IRONCLAD_CHESTPLATE);
                        output.accept(HAHAItemRegistry.IRONCLAD_LEGGINGS);
                        output.accept(HAHAItemRegistry.IRONCLAD_BOOTS);

                        // Desert Prowler
                        output.accept(HAHAItemRegistry.DESERT_PROWLER_HELMET);
                        output.accept(HAHAItemRegistry.DESERT_PROWLER_CHESTPLATE);
                        output.accept(HAHAItemRegistry.DESERT_PROWLER_LEGGINGS);
                        output.accept(HAHAItemRegistry.DESERT_PROWLER_BOOTS);

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}