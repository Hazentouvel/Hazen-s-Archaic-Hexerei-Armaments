package net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose1;

import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.HAHABlockEntities;
import net.hazen.hazentouvelib.Items.Blocks.GeckolibBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;

public class NoraStatueBlockEntityPose1 extends GeckolibBlockEntity implements GeoBlockEntity {

    private static final RawAnimation DEPLOY_ANIM =
            RawAnimation.begin()
                    .then("deploy", Animation.LoopType.PLAY_ONCE)
                    .thenLoop("idle");

    private final AnimatableInstanceCache cache =
            GeckoLibUtil.createInstanceCache(this);

    public NoraStatueBlockEntityPose1(BlockPos pos, BlockState state) {
        super(HAHABlockEntities.NORA_STATUE_POSE_1.get(), pos, state);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(
                this,
                "controller",
                0,
                this::deployAnimController
        ));
    }

    private PlayState deployAnimController(AnimationState<NoraStatueBlockEntityPose1> state) {
        state.setAnimation(DEPLOY_ANIM);
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
