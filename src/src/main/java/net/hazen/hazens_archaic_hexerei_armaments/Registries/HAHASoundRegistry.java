package net.hazen.hazens_archaic_hexerei_armaments.Registries;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HAHASoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, HazensArchaicHexereiArmaments.MOD_ID);


    /*
     * Entity
     */



    /*
     * Gun Sounds
     */

    public static DeferredHolder<SoundEvent, SoundEvent> STAR_CANNON_RELOAD = registerSoundEvent("star_cannon_reload");
    public static DeferredHolder<SoundEvent, SoundEvent> SUPER_STAR_SHOOTER_RELOAD = registerSoundEvent("super_star_shooter_reload");

    public static DeferredHolder<SoundEvent, SoundEvent> STAR_FIRE = registerSoundEvent("star_fire");
    public static DeferredHolder<SoundEvent, SoundEvent> STAR_IMPACT = registerSoundEvent("star_impact");
    public static DeferredHolder<SoundEvent, SoundEvent> STAR_FAIL = registerSoundEvent("star_fail");




    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvent(String name)
    {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent
                (ResourceLocation.fromNamespaceAndPath(HazensArchaicHexereiArmaments.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
