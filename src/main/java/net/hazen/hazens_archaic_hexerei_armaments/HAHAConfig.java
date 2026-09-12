package net.hazen.hazens_archaic_hexerei_armaments;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

public class HAHAConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.ConfigValue<Integer> DESERT_PROWLER_COOLDOWN;
    private static final ModConfigSpec.ConfigValue<Integer> DESERT_PROWLER_INVISIBILITY_COOLDOWN;
    public static int desertProwlerCooldown;
    public static int desertProwlerInvisibilityCooldown;


    public static final ModConfigSpec SPEC;

    @SubscribeEvent
    static void onLoad(ModConfigEvent event)
    {
        desertProwlerCooldown = (Integer) DESERT_PROWLER_COOLDOWN.get();
        desertProwlerInvisibilityCooldown = (Integer) DESERT_PROWLER_INVISIBILITY_COOLDOWN.get();
    }

    static {
        BUILDER.comment("##############################################################################################");
        BUILDER.comment("##                                                                                          ##");
        BUILDER.comment("##                                                                                          ##");
        BUILDER.comment("##                                       Fear Me                                            ##");
        BUILDER.comment("##                                                                                          ##");
        BUILDER.comment("##                                                                                          ##");
        BUILDER.comment("##                                                                                          ##");
        BUILDER.comment("##############################################################################################");
        BUILDER.comment("");
        {
            BUILDER.push("Armor Abilities");

            DESERT_PROWLER_COOLDOWN = BUILDER
                    .comment("Defines the cooldown in seconds value for the Desert Prowler's ability")
                    .comment("Default is 100 seconds")
                    .define("Desert Prowler CD", 100);

            DESERT_PROWLER_INVISIBILITY_COOLDOWN = BUILDER
                    .comment("Defines the cooldown in seconds value for the Desert Prowler's invisibility")
                    .comment("Default is 10 seconds")
                    .define("Desert Prowler Invisibility CD", 10);

            BUILDER.pop();
        }

        SPEC = BUILDER.build();
    }
}
