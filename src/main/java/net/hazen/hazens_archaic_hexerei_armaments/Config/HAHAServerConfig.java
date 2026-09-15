package net.hazen.hazens_archaic_hexerei_armaments.Config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class HAHAServerConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;


    // Desert Prowler
    public static final ModConfigSpec.IntValue DESERT_PROWLER_COOLDOWN;
    public static final ModConfigSpec.IntValue DESERT_PROWLER_INVISIBILITY_COOLDOWN;


    public static final ModConfigSpec.IntValue IRONCLAD_PROJECTILE_RESISTANCE;
    public static final ModConfigSpec.IntValue IRONCLAD_BULLET_RESISTANCE;

    // Desert Prowler
    public static int desertProwlerCooldown;
    public static int desertProwlerInvisibilityCooldown;

    public static float ironcladProjectileResistance;
    public static float ironcladBulletResistance;

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


            // Desert Prowler
            DESERT_PROWLER_COOLDOWN = BUILDER
                    .comment("Defines the cooldown in seconds value for the Desert Prowler's ability")
                    .comment("Default is 100 seconds")
                    .defineInRange("Desert Prowler CD", 100, 0, Integer.MAX_VALUE);

            DESERT_PROWLER_INVISIBILITY_COOLDOWN = BUILDER
                    .comment("Defines the cooldown in seconds value for the Desert Prowler's invisibility")
                    .comment("Default is 10 seconds")
                    .defineInRange("Desert Prowler Invisibility CD", 10, 0, Integer.MAX_VALUE);


            // Ironclad
            IRONCLAD_PROJECTILE_RESISTANCE = BUILDER
                    .comment("Defines the projectile resistance percentage value for the Ironclad armor")
                    .comment("Default is 10")
                    .defineInRange("Ironclad Projectile Resistance", 10, 0, Integer.MAX_VALUE);

            IRONCLAD_BULLET_RESISTANCE = BUILDER
                    .comment("Defines the bullet resistance percentage value for the Ironclad armor")
                    .comment("Default is 30")
                    .defineInRange("Ironclad Bullet Resistance", 30, 0, Integer.MAX_VALUE);

            BUILDER.pop();
        }

        SPEC = BUILDER.build();
    }
}
