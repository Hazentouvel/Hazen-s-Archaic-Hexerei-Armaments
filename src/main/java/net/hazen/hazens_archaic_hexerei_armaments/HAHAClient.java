package net.hazen.hazens_archaic_hexerei_armaments;

import com.google.common.base.Suppliers;
import io.redspace.irons_artifice.client.gun.GunGeoModel;
import io.redspace.irons_artifice.client.gun.GunInHandRenderer;
import io.redspace.irons_artifice.item.GunItem;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.StarCannon.StarCannonRenderer;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Guns.SuperStarShooter.SuperStarShooterRenderer;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHAItemRegistry;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

import javax.annotation.Nullable;
import java.util.function.Supplier;

@Mod(value = HazensArchaicHexereiArmaments.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = HazensArchaicHexereiArmaments.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HAHAClient {
    public HAHAClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        if (HAHAItemRegistry.ROYALTYS_BARREL.get() instanceof GunItem gun) {
            ResourceLocation modelId = BuiltInRegistries.ITEM.getKey(gun);
            gun.geoRenderProvider.setValue(new GeoRenderProvider() {
                private final Supplier<GeoItemRenderer<GunItem>> renderer =
                        Suppliers.memoize(() -> new GunInHandRenderer(new DefaultedItemGeoModel<>(modelId)));

                @Override
                public @Nullable GeoItemRenderer<GunItem> getGeoItemRenderer() {
                    return this.renderer.get();
                }
            });
        }
        if (HAHAItemRegistry.TACTICAL_CROSSGUN.get() instanceof GunItem gun) {
            ResourceLocation modelId = BuiltInRegistries.ITEM.getKey(gun);
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
            ResourceLocation modelId = BuiltInRegistries.ITEM.getKey(gun);
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
            ResourceLocation modelId = BuiltInRegistries.ITEM.getKey(gun);
            gun.geoRenderProvider.setValue(new GeoRenderProvider() {
                private final Supplier<GeoItemRenderer<GunItem>> renderer =
                        Suppliers.memoize(SuperStarShooterRenderer::new);

                @Override
                public @Nullable GeoItemRenderer<GunItem> getGeoItemRenderer() {
                    return this.renderer.get();
                }
            });
        }
    }

    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {

    }
}