package net.hazen.hazens_archaic_hexerei_armaments.Entities.Projectiles.Gun.Star;

import com.geckolib.renderer.GeoEntityRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import com.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.EntityType;

public class StarRenderer<R extends LivingEntityRenderState & GeoRenderState>
        extends GeoEntityRenderer<Star, R> {

    public StarRenderer(EntityRendererProvider.Context context, EntityType<Star> entityType) {
        super(context, entityType);
        withRenderLayer(AutoGlowingGeoLayer::new);
    }
}