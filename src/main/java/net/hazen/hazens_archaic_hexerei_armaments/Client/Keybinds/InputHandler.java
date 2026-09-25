package net.hazen.hazens_archaic_hexerei_armaments.Client.Keybinds;

import io.redspace.irons_artifice.IronsArtifice;
import io.redspace.irons_artifice.item.GunItem;
import io.redspace.irons_artifice.network.packets.ServerboundOpenModifierMenuPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

@EventBusSubscriber(modid = IronsArtifice.MODID, value = Dist.CLIENT)
public final class InputHandler {

    private static boolean attackHeldLastTick = false;

    // lowest priority means our screens open last and are on top
    // looking at you, curios
    @SubscribeEvent(priority = EventPriority.LOWEST)
    static void onClientTick(ClientTickEvent.Post event) {
        Minecraft minecraft = Minecraft.getInstance();
        LocalPlayer player = minecraft.player;
        if (player == null) {
            return;
        }

        while (HAHAKeybinds.MODE_SWITCH.consumeClick()) {
            if (player.getMainHandItem().getItem() instanceof GunItem) {
                ClientPacketDistributor.sendToServer(ServerboundOpenModifierMenuPacket.INSTANCE);
            }
        }
    }

}