package net.hazen.hazens_archaic_hexerei_armaments.Items.Armor.ClockworkArtificer;

import io.redspace.ironslib.transmog.client.TransmogArmorRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;

public class ClockworkArtificerArmorRenderer extends TransmogArmorRenderer<ClockworkArtificerArmor> {
    public ClockworkArtificerArmorRenderer(ClockworkArtificerArmorModel clockworkArtificerArmorModel) {
        super(clockworkArtificerArmorModel);

        this.withCapeBone(new CapeBone("cape", new Vec3(0.5F, 0.5F, 0.5F)));
    }
}