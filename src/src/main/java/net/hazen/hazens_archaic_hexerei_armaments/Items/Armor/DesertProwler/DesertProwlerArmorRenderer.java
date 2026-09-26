package net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.DesertProwler;

import io.redspace.ironslib.transmog.client.CapeData;
import io.redspace.ironslib.transmog.client.ICapeDataProvider;
import io.redspace.ironslib.transmog.client.TransmogArmorRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.Optional;

public class DesertProwlerArmorRenderer extends TransmogArmorRenderer<DesertProwlerArmor> {

    public DesertProwlerArmorRenderer(DesertProwlerArmorModel desertProwlerArmorModel) {
        super(new DesertProwlerArmorModel());

        this.withCapeBone(new TransmogArmorRenderer.CapeBone("cape", new Vec3(0.5F, 0.5F, 0.5F)));
    }


}