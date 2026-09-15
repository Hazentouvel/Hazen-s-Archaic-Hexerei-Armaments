package net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.DesertProwler;

import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.renderer.GeoArmorRenderer;
import com.geckolib.util.GeckoLibUtil;
import com.google.common.base.Suppliers;
import net.hazen.hazens_archaic_hexerei_armaments.Events.DesertProwlerSetBonusHandler;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Utils.HAHAArmorMaterials;
import net.hazen.hazentouvelib.Utils.AdditionalArmorAttributes;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Unit;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.fml.common.EventBusSubscriber;

import javax.annotation.Nullable;
import java.util.function.Consumer;
import java.util.function.Supplier;

@EventBusSubscriber
public class DesertProwlerArmor extends Item implements GeoItem {
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public DesertProwlerArmor(Properties properties, ArmorType type) {
        super(properties
                .rarity(Rarity.UNCOMMON)
                .attributes(
                        AdditionalArmorAttributes.createAttributes(
                                HAHAArmorMaterials.DESERT_PROWLER_MATERIAL,
                                type,
                                HAHAArmorMaterials.DESERT_PROWLER_ATTRIBUTES
                        )
                )
                .component(DataComponents.UNBREAKABLE, Unit.INSTANCE)
        );
    }


    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
        builder.accept(Component.translatable("tooltip.hazens_archaic_hexerei_armaments.set_bonus"));
        builder.accept(
                Component.literal(" ").append(Component.translatable("tooltip.hazens_archaic_hexerei_armaments.desert_prowler.description", (int) DesertProwlerSetBonusHandler.DAMAGE_INCREASE * 100))
                        .withStyle(ChatFormatting.GOLD));

        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
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
            // Defer creation of our renderer then cache it so that it doesn't get instantiated too early
            private final Supplier<DesertProwlerArmorRenderer<?>> renderer = Suppliers.memoize(DesertProwlerArmorRenderer::new);

            @Nullable
            @Override
            public GeoArmorRenderer<?, ?> getGeoArmorRenderer(ItemStack itemStack, EquipmentSlot equipmentSlot) {
                return this.renderer.get();
            }
        });
    }
}