package net.hazen.hazens_archaic_hexerei_armaments;

import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.model.DefaultedItemGeoModel;
import com.geckolib.renderer.GeoItemRenderer;
import com.google.common.base.Suppliers;
import io.redspace.irons_artifice.client.gun.GunArmPoses;
import io.redspace.irons_artifice.client.gun.GunInHandRenderer;
import io.redspace.irons_artifice.item.GunItem;
import net.hazen.hazens_archaic_hexerei_armaments.Entities.Projectiles.Gun.Star.StarRenderer;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.StarCannon.StarCannonRenderer;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.SuperStarShooter.SuperStarShooterRenderer;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHAEntityRegistry;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHAItemRegistry;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

import javax.annotation.Nullable;
import java.util.function.Supplier;

@Mod(value = HazensArchaicHexereiArmaments.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = HazensArchaicHexereiArmaments.MOD_ID, value = Dist.CLIENT)
public class HAHAClient {
    public HAHAClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        if (HAHAItemRegistry.ROYALTYS_BARREL.get() instanceof GunItem gun) {
            Identifier modelId = BuiltInRegistries.ITEM.getKey(gun);
            gun.geoRenderProvider.setValue(new GeoRenderProvider() {
                private final Supplier<GeoItemRenderer<GunItem>> renderer =
                        Suppliers.memoize(() -> new GunInHandRenderer(new DefaultedItemGeoModel<>(modelId)));

                @Override
                public @Nullable GeoItemRenderer<GunItem> getGeoItemRenderer() {
                    return this.renderer.get();
                }
            });
        }
        if (HAHAItemRegistry.STAR_CANNON.get() instanceof GunItem gun) {
            Identifier modelId = BuiltInRegistries.ITEM.getKey(gun);
            gun.geoRenderProvider.setValue(new GeoRenderProvider() {
                private final Supplier<GeoItemRenderer<GunItem>> renderer =
                        Suppliers.memoize(StarCannonRenderer::new);

                @Override
                public @Nullable GeoItemRenderer<GunItem> getGeoItemRenderer() {
                    return this.renderer.get();
                }
            });
        }
        if (HAHAItemRegistry.SUPER_STAR_SHOOTER.get() instanceof GunItem gun) {
            Identifier modelId = BuiltInRegistries.ITEM.getKey(gun);
            gun.geoRenderProvider.setValue(new GeoRenderProvider() {
                private final Supplier<GeoItemRenderer<GunItem>> renderer =
                        Suppliers.memoize(SuperStarShooterRenderer::new);

                @Override
                public @Nullable GeoItemRenderer<GunItem> getGeoItemRenderer() {
                    return this.renderer.get();
                }
            });
        }

        event.registerEntityRenderer(HAHAEntityRegistry.STAR.get(),
                context -> new StarRenderer<>(context, HAHAEntityRegistry.STAR.get()));
    }

    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
        IClientItemExtensions riflePose = new IClientItemExtensions() {
            @Override
            public HumanoidModel.ArmPose getArmPose(LivingEntity entityLiving, InteractionHand hand, ItemStack itemStack) {
                return GunArmPoses.RIFLE.getValue();
            }
        };
        event.registerItem(riflePose, HAHAItemRegistry.ROYALTYS_BARREL.get());
        event.registerItem(riflePose, HAHAItemRegistry.STAR_CANNON.get());
        event.registerItem(riflePose, HAHAItemRegistry.SUPER_STAR_SHOOTER.get());
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {

    }
}
