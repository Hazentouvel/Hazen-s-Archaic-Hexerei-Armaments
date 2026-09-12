package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns;


import io.redspace.irons_artifice.client.sounds.GunShotSoundSettings;
import io.redspace.irons_artifice.data.*;
import io.redspace.irons_artifice.entity.Bullet;
import io.redspace.irons_artifice.gun.ArmPoseKind;
import io.redspace.irons_artifice.gun.GunProfile;
import io.redspace.irons_artifice.item.AnimationAdjuster;
import io.redspace.irons_artifice.registry.SoundRegistry;
import net.minecraft.sounds.SoundEvents;

import java.util.Map;

public class HAHAGuns {

    public static final GunProfile ROYALTYS_BARREL = new GunProfile(
            () -> {
                var map = basicGun();
                map.set(ShotComponents.DAMAGE, Value.of(25));
                map.set(ShotComponents.PROJECTILE_COUNT, Value.of(10));
                map.set(ShotComponents.CAMERA_RECOIL, RecoilProfile.of(30f, .35f, 2f, 999));
                map.set(ShotComponents.CHARACTER_BLOWBACK, Value.of(0.75));
                map.set(ShotComponents.SPREAD, Value.of(7));
                map.set(ShotComponents.FIRE_DELAY, Value.of(1));
                map.set(ShotComponents.GUNSHOT_SOUND, new GunShotSoundStack(
                        GunShotSoundSettings.standardShot(SoundRegistry.BLUNDERBUSS_SHOOT, 1f),
                        GunShotSoundSettings.standardEcho(SoundRegistry.BULLET_ECHO_MUZZLELOADER, 0.75f),
                        PlayableSound.of(PlayableSound.holder(SoundEvents.DISPENSER_FAIL), 0.75f, 1.4f, 1.6f)
                ));
                map.set(ShotComponents.MUZZLE_FLASH, MuzzleFlashSettings.of(2f, MuzzleFlashType.LARGE));
                return map;
            },
            2,
            8,
            34,
            FireMode.SEMI,
            null,
            ArmPoseKind.RIFLE,
            ReloadCueStack.of(
                    new ReloadCue(0.63f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_OPEN, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_LOAD, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.25f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 1.25f, 0.9f, 1.1f))
            ),
            PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 0.75f, 0.9f, 1.1f),
            FireCycleCueStack.EMPTY,
            AnimationAdjuster.DOUBLE_BARREL_HAMMER,
            Map.of()
    );

    private static ShotComponentMap basicGun() {
        ShotComponentMap map = new ShotComponentMap();
        map.set(ShotComponents.PROJECTILE_COUNT, Value.of(1));
        map.set(ShotComponents.SPREAD, Value.of(1.0));
        map.set(ShotComponents.DAMAGE, Value.of(6.0));
        map.set(ShotComponents.BULLET_SPEED, Value.of(Bullet.BASE_SPEED));
        map.set(ShotComponents.GRAVITY, Value.of(0.05));
        map.set(ShotComponents.KNOCKBACK, Value.of(0.3));
        map.set(ShotComponents.CAMERA_RECOIL, RecoilProfile.of(10f, .33f, 1.7f, 431));
        map.set(ShotComponents.CHARACTER_BLOWBACK, Value.of(0.0));
        map.set(ShotComponents.FIRE_DELAY, Value.of(20));
        return map;
    }
}
