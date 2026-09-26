package net.hazen.hazens_archaic_hexerei_armaments.Registries;


import io.redspace.irons_artifice.item.GunItem;
import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.ClockworkArtificer.ClockworkArtificerArmor;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.DesertProwler.DesertProwlerArmor;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.Ironclad.IroncladArmor;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose1.Item.NoraStatueItemPose1;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose2.Item.NoraStatueItemPose2;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose3.Item.NoraStatueItemPose3;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose4.Item.NoraStatueItemPose4;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.HAHAGuns;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Collection;

public class HAHAItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HazensArchaicHexereiArmaments.MOD_ID);

    /*
    *** Materials
     */

    // Warhog Cog
    public static final DeferredItem<Item> WARHOG_COG = ITEMS.register("warhog_cog",
            () -> new Item(new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .fireResistant())
    );

    // Warhog Cog
    public static final DeferredItem<Item> ILLEGAL_GUN_PARTS = ITEMS.register("illegal_gun_parts",
            () -> new Item(new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .fireResistant())
    );

    /*
     *** Guns
     */

    // Double Barrel Shotgun
    public static final DeferredItem<GunItem> ROYALTYS_BARREL = ITEMS.registerItem("royaltys_barrel",
            properties -> new GunItem(properties, HAHAGuns.ROYALTYS_BARREL)
    );

    // Double Barrel Shotgun
    public static final DeferredItem<GunItem> TACTICAL_CROSSGUN = ITEMS.registerItem("tactical_crossgun",
            properties -> new GunItem(properties, HAHAGuns.TACTICAL_CROSSGUN)
    );


    // Star Cannon
    public static final DeferredItem<GunItem> STAR_CANNON = ITEMS.registerItem("star_cannon",
            properties -> new GunItem(properties, HAHAGuns.STAR_CANNON)
    );

    // Super Star Shooter
    public static final DeferredItem<GunItem> SUPER_STAR_SHOOTER = ITEMS.registerItem("super_star_shooter",
            properties -> new GunItem(properties.rarity(Rarity.EPIC), HAHAGuns.SUPER_STAR_SHOOTER)
    );

    /*
    *** Armor Sets
     */

    // Ironclad Armor Set
    public static final DeferredHolder<Item, Item> IRONCLAD_HELMET = ITEMS.register("ironclad_helmet", () -> new IroncladArmor(ArmorItem.Type.HELMET, new Item.Properties()
            .durability(ArmorItem.Type.HELMET.getDurability(96))
    ));

    public static final DeferredHolder<Item, Item> IRONCLAD_CHESTPLATE = ITEMS.register("ironclad_chestplate", () -> new IroncladArmor(ArmorItem.Type.CHESTPLATE, new Item.Properties()
            .durability(ArmorItem.Type.CHESTPLATE.getDurability(96))
    ));

    public static final DeferredHolder<Item, Item> IRONCLAD_LEGGINGS = ITEMS.register("ironclad_leggings", () -> new IroncladArmor(ArmorItem.Type.LEGGINGS, new Item.Properties()
            .durability(ArmorItem.Type.LEGGINGS.getDurability(96))
    ));


    public static final DeferredHolder<Item, Item> IRONCLAD_BOOTS = ITEMS.register("ironclad_boots", () -> new IroncladArmor(ArmorItem.Type.BOOTS, new Item.Properties()
            .durability(ArmorItem.Type.BOOTS.getDurability(96))
    ));

    // Desert Prowler Armor Set
    public static final DeferredHolder<Item, Item> DESERT_PROWLER_HELMET = ITEMS.register("desert_prowler_helmet", () -> new DesertProwlerArmor(ArmorItem.Type.HELMET, new Item.Properties()
            .durability(ArmorItem.Type.HELMET.getDurability(96))
    ));

    public static final DeferredHolder<Item, Item> DESERT_PROWLER_CHESTPLATE = ITEMS.register("desert_prowler_chestplate", () -> new DesertProwlerArmor(ArmorItem.Type.CHESTPLATE, new Item.Properties()
            .durability(ArmorItem.Type.CHESTPLATE.getDurability(96))
    ));

    public static final DeferredHolder<Item, Item> DESERT_PROWLER_LEGGINGS = ITEMS.register("desert_prowler_leggings", () -> new DesertProwlerArmor(ArmorItem.Type.LEGGINGS, new Item.Properties()
            .durability(ArmorItem.Type.LEGGINGS.getDurability(96))
    ));


    public static final DeferredHolder<Item, Item> DESERT_PROWLER_BOOTS = ITEMS.register("desert_prowler_boots", () -> new DesertProwlerArmor(ArmorItem.Type.BOOTS, new Item.Properties()
            .durability(ArmorItem.Type.BOOTS.getDurability(96))
    ));

    // Clockwork Artificer Armor Set
    public static final DeferredHolder<Item, Item> CLOCKWORK_ARTIFICER_HELMET = ITEMS.register("clockwork_artificer_helmet", () -> new ClockworkArtificerArmor(ArmorItem.Type.HELMET, new Item.Properties()
            .durability(ArmorItem.Type.HELMET.getDurability(96))
    ));

    public static final DeferredHolder<Item, Item> CLOCKWORK_ARTIFICER_CHESTPLATE = ITEMS.register("clockwork_artificer_chestplate", () -> new ClockworkArtificerArmor(ArmorItem.Type.CHESTPLATE, new Item.Properties()
            .durability(ArmorItem.Type.CHESTPLATE.getDurability(96))
    ));

    public static final DeferredHolder<Item, Item> CLOCKWORK_ARTIFICER_LEGGINGS = ITEMS.register("clockwork_artificer_leggings", () -> new ClockworkArtificerArmor(ArmorItem.Type.LEGGINGS, new Item.Properties()
            .durability(ArmorItem.Type.LEGGINGS.getDurability(96))
    ));


    public static final DeferredHolder<Item, Item> CLOCKWORK_ARTIFICER_BOOTS = ITEMS.register("clockwork_artificer_boots", () -> new ClockworkArtificerArmor(ArmorItem.Type.BOOTS, new Item.Properties()
            .durability(ArmorItem.Type.BOOTS.getDurability(96))
    ));

    /*
    *** Blocks
     */

    public static final DeferredHolder<Item, Item> NORA_STATUE_POSE_1 = ITEMS.register("nora_statue_pose_1", () -> new NoraStatueItemPose1((Block)
            HAHABlockRegistry.NORA_STATUE_POSE_1.get(), new Item.Properties()
    ));

    public static final DeferredHolder<Item, Item> NORA_STATUE_POSE_2 = ITEMS.register("nora_statue_pose_2", () -> new NoraStatueItemPose2((Block)
            HAHABlockRegistry.NORA_STATUE_POSE_2.get(), new Item.Properties()
    ));

    public static final DeferredHolder<Item, Item> NORA_STATUE_POSE_3 = ITEMS.register("nora_statue_pose_3", () -> new NoraStatueItemPose3((Block)
            HAHABlockRegistry.NORA_STATUE_POSE_3.get(), new Item.Properties()
    ));

    public static final DeferredHolder<Item, Item> NORA_STATUE_POSE_4 = ITEMS.register("nora_statue_pose_4", () -> new NoraStatueItemPose4((Block)
            HAHABlockRegistry.NORA_STATUE_POSE_4.get(), new Item.Properties()
    ));



    public static Collection<DeferredHolder<Item, ? extends Item>> getEMItems()
    {
        return ITEMS.getEntries();
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}