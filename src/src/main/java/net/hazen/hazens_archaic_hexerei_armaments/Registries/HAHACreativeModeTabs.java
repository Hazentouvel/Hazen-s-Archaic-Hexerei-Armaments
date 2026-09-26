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
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HazensArchaicHexereiArmaments.MOD_ID);

    public static final Supplier<CreativeModeTab> HAHA_ITEMS = CREATIVE_MODE_TAB.register("items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HAHAItemRegistry.TACTICAL_CROSSGUN.get()))
                    .title(Component.translatable("creativetab.hazens_archaic_hexerei_armaments.items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        /*
                        *** Materials
                         */

                        output.accept(HAHAItemRegistry.WARHOG_COG.get());
                        output.accept(HAHAItemRegistry.ILLEGAL_GUN_PARTS.get());
                        /*
                        *** Materials
                         */

                        output.accept(HAHAItemRegistry.NORA_STATUE_POSE_1.get());
                        output.accept(HAHAItemRegistry.NORA_STATUE_POSE_2.get());
                        output.accept(HAHAItemRegistry.NORA_STATUE_POSE_3.get());
                        output.accept(HAHAItemRegistry.NORA_STATUE_POSE_4.get());

                        /*
                        *** Guns
                         */
                        output.accept(HAHAItemRegistry.TACTICAL_CROSSGUN.get());
                        output.accept(HAHAItemRegistry.ROYALTYS_BARREL.get());
                        output.accept(HAHAItemRegistry.STAR_CANNON.get());
                        output.accept(HAHAItemRegistry.SUPER_STAR_SHOOTER.get());

                        /*
                        *** Armor
                         */

                        // Ironclad
                        output.accept(HAHAItemRegistry.IRONCLAD_HELMET.get());
                        output.accept(HAHAItemRegistry.IRONCLAD_CHESTPLATE.get());
                        output.accept(HAHAItemRegistry.IRONCLAD_LEGGINGS.get());
                        output.accept(HAHAItemRegistry.IRONCLAD_BOOTS.get());

                        // Desert Prowler
                        output.accept(HAHAItemRegistry.DESERT_PROWLER_HELMET.get());
                        output.accept(HAHAItemRegistry.DESERT_PROWLER_CHESTPLATE.get());
                        output.accept(HAHAItemRegistry.DESERT_PROWLER_LEGGINGS.get());
                        output.accept(HAHAItemRegistry.DESERT_PROWLER_BOOTS.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}