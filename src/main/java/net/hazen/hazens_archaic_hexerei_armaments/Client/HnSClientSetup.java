package net.hazen.hazens_archaic_hexerei_armaments.Client;

import net.hazen.hazens_archaic_hexerei_armaments.HazensArchaicHexereiArmaments;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.HAHABlockEntities;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose1.NoraStatueRendererPose1;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose2.NoraStatueRendererPose2;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose3.NoraStatueRendererPose3;
import net.hazen.hazens_archaic_hexerei_armaments.Items.Blocks.Statues.NoraStatue.Pose4.NoraStatueRendererPose4;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = HazensArchaicHexereiArmaments.MOD_ID)
public class HnSClientSetup {

    @SubscribeEvent
    public static void registerRenderer(EntityRenderersEvent.RegisterRenderers event) {

        /*
        *** Projectiles
         */
        //event.registerEntityRenderer(HnSEntityRegistry.FROSTBURN_DAGGER.get(), FrostburnDaggerProjectileRenderer::new);

        /*
        *** Entities
         */

        /*
        *** Particles
         */


        /*
        *** Blocks
         */

        event.registerBlockEntityRenderer(HAHABlockEntities.NORA_STATUE_POSE_1.get(), NoraStatueRendererPose1::new);
        event.registerBlockEntityRenderer(HAHABlockEntities.NORA_STATUE_POSE_2.get(), NoraStatueRendererPose2::new);
        event.registerBlockEntityRenderer(HAHABlockEntities.NORA_STATUE_POSE_3.get(), NoraStatueRendererPose3::new);
        event.registerBlockEntityRenderer(HAHABlockEntities.NORA_STATUE_POSE_4.get(), NoraStatueRendererPose4::new);
    }


}