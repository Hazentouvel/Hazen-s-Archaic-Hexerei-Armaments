package net.hazen.hazens_archaic_hexerei_armaments.Registries;

import net.hazen.hazens_archaic_hexerei_armaments.Entities.Projectiles.Gun.Star.Star;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class HAHAEntityRegistry {
    public static final DeferredRegister.Entities ENTITY_TYPES = DeferredRegister.createEntities(HazensArchaicHexereiArmaments.MOD_ID);

    public static final Supplier<EntityType<Star>> STAR =
            ENTITY_TYPES.registerEntityType(
                    "star",
                    Star::new,
                    MobCategory.MISC,
                    builder -> builder
                            .sized(0.5f, 0.5f)
                            .noSummon()
                            .noSave()
                            .fireImmune()
                            .clientTrackingRange(64)
                            .updateInterval(1)
            );

    /*
    public static final Supplier<EntityType<BountyHunter>> BOUNTY_HUNTER =
            ENTITY_TYPES.registerEntityType(
                    "bounty_hunter",
                    BountyHunter::new,
                    MobCategory.MONSTER,
                    builder -> builder
                            .sized(0.9f, 2.9f)
                            .clientTrackingRange(64)
            );
     */

    public static void register(IEventBus modEventBus){
        ENTITY_TYPES.register(modEventBus);
    }
}