package net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.ClockworkArtificer;

import io.redspace.ironslib.registry.IronsLibRegistries;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.armor.IDisableHat;
import io.redspace.ironsspellbooks.item.armor.IDisableJacket;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.hazen.hazens_archaic_hexerei_armaments.Utils.Armor.HAHAArmorMaterials;
import net.hazen.hazens_archaic_hexerei_armaments.Utils.Armor.ImbuableHAHAArmorItem;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.Unbreakable;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import net.minecraft.network.chat.Component;
import java.util.List;
import java.awt.*;

public class ClockworkArtificerArmor extends ImbuableHAHAArmorItem implements IDisableJacket, IDisableHat {


    public ClockworkArtificerArmor(Type type, Properties settings) {
        super(HAHAArmorMaterials.DESERT_PROWLER_MATERIAL, type,
                settings
                        .stacksTo(1)
                        .component(DataComponents.UNBREAKABLE, new Unbreakable(false))
                        .fireResistant()
                ,
                new AttributeContainer(AttributeRegistry.SPELL_POWER, .07, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 200, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> lines, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, context, lines, flag);

        lines.add(Component.translatable("tooltip.hazens_archaic_hexerei_armaments.set_bonus"));
        lines.add(Component.translatable("item.hazens_archaic_hexerei_armaments.clockwork_artificer.description")
                .withStyle(ChatFormatting.ITALIC)
        );

    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new ClockworkArtificerArmorRenderer(new ClockworkArtificerArmorModel());
    }
}