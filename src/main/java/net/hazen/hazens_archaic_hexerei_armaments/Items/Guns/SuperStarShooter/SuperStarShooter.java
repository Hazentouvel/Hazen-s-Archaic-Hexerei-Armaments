package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.SuperStarShooter;

import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.renderer.GeoItemRenderer;
import com.geckolib.util.GeckoLibUtil;
import com.google.common.base.Suppliers;
import io.redspace.irons_artifice.gun.GunProfile;
import io.redspace.irons_artifice.item.GunItem;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.HAHAGuns;

import javax.annotation.Nullable;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SuperStarShooter extends GunItem implements GeoItem {
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public SuperStarShooter(Properties properties, GunProfile gunProfile) {
        super(properties
                ,
                HAHAGuns.ROYALTYS_BARREL);
    }

    @Override
    public void registerControllers(final AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return geoCache;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private final Supplier<SuperStarShooterRenderer> renderer =
                    Suppliers.memoize(SuperStarShooterRenderer::new);

            @Override
            public @Nullable GeoItemRenderer<GunItem> getGeoItemRenderer() {
                return this.renderer.get();
            }
        });
    }

}