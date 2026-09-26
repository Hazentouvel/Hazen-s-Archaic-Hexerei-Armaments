package net.hazen.hazens_archaic_hexerei_armaments.Registries;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose1.NoraStatuePose1;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose2.NoraStatuePose2;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose3.NoraStatuePose3;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose4.NoraStatuePose4;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class HAHABlockRegistry {
        public static final DeferredRegister.Blocks BLOCKS =
                DeferredRegister.createBlocks(HazensArchaicHexereiArmaments.MOD_ID);

        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, HazensArchaicHexereiArmaments.MOD_ID);

        //Statues
        public static final DeferredBlock<Block> NORA_STATUE_POSE_1 = registerBlock("nora_statue_pose_1",
                () -> new NoraStatuePose1(BlockBehaviour
                        .Properties.of()
                        .noOcclusion())
        );

        public static final DeferredBlock<Block> NORA_STATUE_POSE_2 = registerBlock("nora_statue_pose_2",
                () -> new NoraStatuePose2(BlockBehaviour
                        .Properties.of()
                        .noOcclusion())
        );

        public static final DeferredBlock<Block> NORA_STATUE_POSE_3 = registerBlock("nora_statue_pose_3",
                () -> new NoraStatuePose3(BlockBehaviour
                        .Properties.of()
                        .noOcclusion())
        );

        public static final DeferredBlock<Block> NORA_STATUE_POSE_4 = registerBlock("nora_statue_pose_4",
                () -> new NoraStatuePose4(BlockBehaviour
                        .Properties.of()
                        .noOcclusion())
        );

        private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
                DeferredBlock<T> toReturn = BLOCKS.register(name, block);
                return toReturn;
        }

        public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
        }
}