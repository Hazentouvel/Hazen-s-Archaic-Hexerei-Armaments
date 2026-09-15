package net.hazen.hazens_archaic_hexerei_armaments.Registries;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class HAHASoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, HazensArchaicHexereiArmaments.MOD_ID);

    public static final Supplier<SoundEvent> STAR_CANNON_RELOAD = SOUND_EVENTS.register("star_cannon_reload",
            () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "star_cannon_reload")));
    public static final Supplier<SoundEvent> SUPER_STAR_SHOOTER_RELOAD = SOUND_EVENTS.register("super_star_shooter_reload",
            () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "super_star_shooter_reload")));

    public static final Supplier<SoundEvent> STAR_FIRE = SOUND_EVENTS.register("star_fire",
            () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "star_fire")));
    public static final Supplier<SoundEvent> STAR_IMPACT = SOUND_EVENTS.register("star_impact",
            () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "star_impact")));
    public static final Supplier<SoundEvent> STAR_FAIL = SOUND_EVENTS.register("star_fail",
            () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, "star_fail")));


    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, name));
    }

    private static DeferredHolder<SoundEvent, SoundEvent> registerJukeboxSong(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}