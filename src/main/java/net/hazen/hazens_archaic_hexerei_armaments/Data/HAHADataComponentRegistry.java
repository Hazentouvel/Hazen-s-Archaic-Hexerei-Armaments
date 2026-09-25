package net.hazen.hazens_archaic_hexerei_armaments.Data;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.util.ExtraCodecs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.UnaryOperator;

public class HAHADataComponentRegistry {
//    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES = DeferredRegister.createDataComponents(HazensArchaicHexereiArmaments.MOD_ID);
//
//    public static DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> GUN_MODE =
//            register("gun_mode", builder -> builder.persistent(ExtraCodecs.POSITIVE_INT).networkSynchronized(ByteBufCodecs.VAR_INT));
//
//    private static <T>DeferredHolder<DataComponentType<?>, DataComponentType<T>> register(String name, UnaryOperator<DataComponentType.Builder<T>> builder)
//    {
//        return DATA_COMPONENT_TYPES.register(name, () -> builder.apply(DataComponentType.builder()).build());
//    }
//
//    public static void register(IEventBus eventBus)
//    {
//        DATA_COMPONENT_TYPES.register(eventBus);
//    }
}