package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns;


import io.redspace.irons_artifice.client.particle.FairyDustParticleOption;
import io.redspace.irons_artifice.client.sounds.GunShotSoundSettings;
import io.redspace.irons_artifice.data.*;
import io.redspace.irons_artifice.entity.Bullet;
import io.redspace.irons_artifice.gun.ArmPoseKind;
import io.redspace.irons_artifice.gun.GunProfile;
import io.redspace.irons_artifice.item.AnimationAdjuster;
import io.redspace.irons_artifice.registry.ParticleRegistry;
import io.redspace.irons_artifice.registry.SoundRegistry;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHASoundRegistry;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3f;

import java.util.Map;
import java.util.Optional;

public class HAHAGuns {

    public static final GunProfile ROYALTYS_BARREL = new GunProfile(
            () -> {
                var map = basicGun();
                map.set(ShotComponents.DAMAGE, Value.of(26));
                map.set(ShotComponents.PROJECTILE_COUNT, Value.of(10));
                map.set(ShotComponents.CAMERA_RECOIL, RecoilProfile.of(30f, .35f, 2f, 999));
                map.set(ShotComponents.CHARACTER_BLOWBACK, Value.of(0.45));
                map.set(ShotComponents.SPREAD, Value.of(7));
                map.set(ShotComponents.FIRE_DELAY, Value.of(2));
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

    public static final GunProfile STAR_CANNON = new GunProfile(
            () -> {
                var map = star();
                map.set(ShotComponents.CAMERA_RECOIL, RecoilProfile.of(7.5f, .35f, 0.6f, 6969));
                map.set(ShotComponents.CHARACTER_BLOWBACK, Value.of(0.1));
                map.set(ShotComponents.FIRE_DELAY, Value.of(5));
                map.set(ShotComponents.SPREAD, Value.of(2));
                map.set(ShotComponents.DAMAGE, Value.of(10));
                map.set(ShotComponents.MUZZLE_FLASH, MuzzleFlashSettings.of(2f, MuzzleFlashType.TRIANGLE, MuzzleFlashType.SMALL_STAR));
                map.set(ShotComponents.GUNSHOT_SOUND, new GunShotSoundStack(
                        GunShotSoundSettings.standardShot((Holder<SoundEvent>) HAHASoundRegistry.STAR_FIRE, 1f),
                        GunShotSoundSettings.standardEcho((Holder<SoundEvent>) HAHASoundRegistry.STAR_FIRE, 1f),
                        PlayableSound.of(PlayableSound.holder(HAHASoundRegistry.STAR_FAIL.get()), 0.75f, 1f, 1.1f)
                ));
                return map;
            },
            16,
            7,
            25,
            FireMode.AUTO,
            null,
            ArmPoseKind.RIFLE,
            ReloadCueStack.of(
                    new ReloadCue(0.5f, PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.STAR_CANNON_RELOAD, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(0.88f, PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.STAR_CANNON_RELOAD, 1.25f, 0.9f, 1.1f))
            ),
            PlayableSound.of(SoundRegistry.CLOCKWORK_RIFLE_EQUIP, 0.75f, 0.9f, 1.1f),
            FireCycleCueStack.EMPTY,
            AnimationAdjuster.HARMONICA_MAGAZINE,
            Map.of()
    );

    public static final GunProfile SUPER_STAR_SHOOTER = new GunProfile(
            () -> {
                var map = star();
                map.set(ShotComponents.CAMERA_RECOIL, RecoilProfile.of(12f, .35f, 0.6f, 6969));
                map.set(ShotComponents.CHARACTER_BLOWBACK, Value.of(0.15));
                map.set(ShotComponents.FIRE_DELAY, Value.of(6.5));
                map.set(ShotComponents.SPREAD, Value.of(2));
                map.set(ShotComponents.DAMAGE, Value.of(18));
                map.set(ShotComponents.MUZZLE_FLASH, MuzzleFlashSettings.of(2f, MuzzleFlashType.LARGE, MuzzleFlashType.TRIANGLE));
                map.set(ShotComponents.GUNSHOT_SOUND, new GunShotSoundStack(
                        GunShotSoundSettings.standardShot((Holder<SoundEvent>) HAHASoundRegistry.STAR_FIRE, 1f),
                        GunShotSoundSettings.standardEcho((Holder<SoundEvent>) HAHASoundRegistry.STAR_FIRE, 1f),
                        PlayableSound.of(PlayableSound.holder(HAHASoundRegistry.STAR_FAIL.get()), 0.75f, 1f, 1.1f)
                ));
                map.set(ShotComponents.IMPACT_SOUND, new ImpactSoundStack(
                        Optional.of(PlayableSound.of(PlayableSound.holder(HAHASoundRegistry.STAR_IMPACT.get()), 1f, 0.9f, 1.1f)),
                        Optional.of(PlayableSound.of(PlayableSound.holder(HAHASoundRegistry.STAR_IMPACT.get()), 1f, 0.9f, 1.1f))
                ));
                return map;
            },
            24,
            8,
            60,
            FireMode.AUTO,
            null,
            ArmPoseKind.RIFLE,
            ReloadCueStack.of(
                    new ReloadCue(1f, PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.SUPER_STAR_SHOOTER_RELOAD, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.63f, PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.STAR_CANNON_RELOAD, 1.25f, 0.9f, 1.1f))
            ),
            PlayableSound.of(SoundRegistry.CLOCKWORK_RIFLE_EQUIP, 0.75f, 0.9f, 1.1f),
            FireCycleCueStack.EMPTY,
            AnimationAdjuster.HARMONICA_MAGAZINE,
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
    private static ShotComponentMap star() {
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
        map.getOrCreate(ShotComponents.IMPACT_SOUND).addBlockAccent(PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.STAR_IMPACT, 2f, .7f, 1.3f));
        return map;
    }
}
