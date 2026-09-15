package net.hazen.hazens_archaic_hexerei_armaments.Entities.Projectiles.Gun.Star;

import com.geckolib.animatable.GeoEntity;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.animation.AnimationController;
import com.geckolib.animation.RawAnimation;
import com.geckolib.animation.object.PlayState;
import com.geckolib.animation.state.AnimationTest;
import com.geckolib.util.GeckoLibUtil;
import io.redspace.irons_artifice.entity.Bullet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class Star extends Bullet implements GeoEntity {

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    private static final RawAnimation IDLE = RawAnimation.begin().thenLoop("animation.shooting_star.idle");

    public Star(EntityType<? extends Bullet> type, Level level) {
        super(type, level);
    }

    private PlayState predicate(AnimationTest<Star> state) {
        return state.setAndContinue(IDLE);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>("controller", 0, state -> state.setAndContinue(IDLE)));
    }


    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }
}