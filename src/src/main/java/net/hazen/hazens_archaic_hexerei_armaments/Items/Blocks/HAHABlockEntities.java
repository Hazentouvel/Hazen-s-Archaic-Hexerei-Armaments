package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose1.NoraStatueBlockEntityPose1;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose2.NoraStatueBlockEntityPose2;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose3.NoraStatueBlockEntityPose3;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose4.NoraStatueBlockEntityPose4;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHABlockRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class HAHABlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, HazensArchaicHexereiArmaments.MOD_ID);

    public static final Supplier<BlockEntityType<NoraStatueBlockEntityPose1>> NORA_STATUE_POSE_1 =
            BLOCK_ENTITIES.register("nora_statue_pose_1", () -> BlockEntityType.Builder.of(
                    NoraStatueBlockEntityPose1::new, HAHABlockRegistry.NORA_STATUE_POSE_1.get()).build(null));

    public static final Supplier<BlockEntityType<NoraStatueBlockEntityPose2>> NORA_STATUE_POSE_2 =
            BLOCK_ENTITIES.register("nora_statue_pose_2", () -> BlockEntityType.Builder.of(
                    NoraStatueBlockEntityPose2::new, HAHABlockRegistry.NORA_STATUE_POSE_2.get()).build(null));

    public static final Supplier<BlockEntityType<NoraStatueBlockEntityPose3>> NORA_STATUE_POSE_3 =
            BLOCK_ENTITIES.register("nora_statue_pose_3", () -> BlockEntityType.Builder.of(
                    NoraStatueBlockEntityPose3::new, HAHABlockRegistry.NORA_STATUE_POSE_3.get()).build(null));

    public static final Supplier<BlockEntityType<NoraStatueBlockEntityPose4>> NORA_STATUE_POSE_4 =
            BLOCK_ENTITIES.register("nora_statue_pose_4", () -> BlockEntityType.Builder.of(
                    NoraStatueBlockEntityPose4::new, HAHABlockRegistry.NORA_STATUE_POSE_4.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
