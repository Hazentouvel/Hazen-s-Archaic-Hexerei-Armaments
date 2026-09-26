package net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.Ironclad;

import io.redspace.ironslib.registry.IronsLibRegistries;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.armor.IDisableHat;
import io.redspace.ironsspellbooks.item.armor.IDisableJacket;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.hazen.hazens_archaic_hexerei_armaments.Utils.Armor.HAHAArmorMaterials;
import net.hazen.hazens_archaic_hexerei_armaments.Utils.Armor.ImbuableHAHAArmorItem;
import net.hazen.hazentouvelib.Rarities.HLRarities;
import net.hazen.hazentouvelib.Registries.HLAttributeRegistry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.component.Unbreakable;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IroncladArmor extends ImbuableHAHAArmorItem implements IDisableJacket, IDisableHat {
    public static final int COOLDOWN_TICKS = 200;


    public IroncladArmor(Type type, Properties settings) {
        super(HAHAArmorMaterials.IRONCLAD_MATERIAL, type,
                settings
                        .stacksTo(1)
                        .rarity(HLRarities.COSMIC_RARITY.getValue())
                        .component(DataComponents.UNBREAKABLE, new Unbreakable(false))
                        .fireResistant()
                ,
                new AttributeContainer(Attributes.MAX_HEALTH, 4, AttributeModifier.Operation.ADD_VALUE)
        );
    }



    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new IroncladArmorRenderer(new IroncladArmorModel());
    }
}