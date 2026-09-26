package net.hazen.hazens_archaic_hexerei_armaments.Items.Guns;

import io.redspace.irons_artifice.client.sounds.GunShotSoundSettings;
import io.redspace.irons_artifice.data.*;
import io.redspace.irons_artifice.gun.ArmPoseKind;
import io.redspace.irons_artifice.gun.GunProfile;
import io.redspace.irons_artifice.registry.SoundRegistry;
import net.hazen.hazens_archaic_hexerei_armaments.Registries.HAHASoundRegistry;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import io.redspace.irons_artifice.data.FireMode;
import io.redspace.irons_artifice.data.MuzzleFlashType;
import io.redspace.irons_artifice.data.PlayableSound;
import io.redspace.irons_artifice.data.RecoilProfile;
import io.redspace.irons_artifice.data.ReloadCue;
import io.redspace.irons_artifice.data.ReloadCueStack;

public class HAHAGuns {

    public static final GunProfile ROYALTYS_BARREL = GunProfile.builder(2, 6, 34, FireMode.SEMI, ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(26, 7, 0.75, 6, RecoilProfile.of(30f, .35f, 2f, 999))
                            .projectileCount(10)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot(SoundRegistry.BLUNDERBUSS_SHOOT, 1f),
                                    GunShotSoundSettings.standardEcho(SoundRegistry.BULLET_ECHO_MUZZLELOADER, 0.75f),
                                    PlayableSound.holder(SoundEvents.DISPENSER_FAIL))
                            .muzzleFlash(MuzzleFlashType.LARGE)
                            .build())
            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(0.63f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_OPEN, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_LOAD, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.25f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 1.25f, 0.9f, 1.1f))
            ))
            .equipSound(PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 0.75f, 0.9f, 1.1f))
            .build();

    public static final GunProfile TACTICAL_CROSSGUN = GunProfile.builder(1, 7, 55, FireMode.SEMI, ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(32, 0.5, 0.85, 20, RecoilProfile.of(30f, .35f, 2f, 999))
                            .projectileCount(7)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot(SoundRegistry.BLUNDERBUSS_SHOOT, 1f),
                                    GunShotSoundSettings.standardEcho(SoundRegistry.BULLET_ECHO_MUZZLELOADER, 0.75f),
                                    PlayableSound.holder(SoundEvents.DISPENSER_FAIL))
                            .muzzleFlash(MuzzleFlashType.LARGE)
                            .build())
            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(0.5f, PlayableSound.of(SoundEvents.CROSSBOW_LOADING_START, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.5f, PlayableSound.of(SoundEvents.CROSSBOW_LOADING_MIDDLE, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(2f, PlayableSound.of(SoundEvents.CROSSBOW_LOADING_END, 1.25f, 0.9f, 1.1f))
            ))
            .equipSound(PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 0.75f, 0.9f, 1.1f))
            .build();

    public static final GunProfile STAR_CANNON = GunProfile.builder(
                    16,
                    6,
                    25,
                    FireMode.AUTO,
                    ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(11, 2, 0.1, 5, RecoilProfile.of(7.5f, .35f, 0.6f, 6969))
                            .projectileCount(1)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot((Holder<SoundEvent>) HAHASoundRegistry.STAR_FIRE, 1f),
                                    GunShotSoundSettings.standardEcho((Holder<SoundEvent>) HAHASoundRegistry.STAR_FIRE, 1f),
                                    PlayableSound.of(PlayableSound.holder(HAHASoundRegistry.STAR_FAIL.get()), 0.75f, 1f, 1.1f))
                            .muzzleFlash(MuzzleFlashType.TRIANGLE)
                            .modify(map -> map.getOrCreate(ShotComponents.IMPACT_SOUND)
                                    .addBlockAccent(PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.STAR_IMPACT, 2f, 0.9f, 1.1f)))
                            .build())

            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(0.5f, PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.STAR_CANNON_RELOAD, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(0.88f, PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.STAR_CANNON_RELOAD, 1.25f, 0.9f, 1.1f))
            ))
            .equipSound(PlayableSound.of(
                    SoundRegistry.CLOCKWORK_RIFLE_EQUIP,
                    0.75f, 0.9f, 1.1f
            ))
            .build();

    public static final GunProfile SUPER_STAR_SHOOTER = GunProfile.builder(
                    24,
                    7,
                    60,
                    FireMode.AUTO,
                    ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(14, 2, 0.15, 6, RecoilProfile.of(7.5f, .35f, 0.6f, 6969))
                            .projectileCount(1)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot((Holder<SoundEvent>) HAHASoundRegistry.STAR_FIRE, 1f),
                                    GunShotSoundSettings.standardEcho((Holder<SoundEvent>) HAHASoundRegistry.STAR_FIRE, 1f),
                                    PlayableSound.of(PlayableSound.holder(HAHASoundRegistry.STAR_FAIL.get()), 0.75f, 1f, 1.1f))
                            .modify(map -> map.getOrCreate(ShotComponents.IMPACT_SOUND)
                                    .addBlockAccent(PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.STAR_IMPACT, 2f, 0.9f, 1.1f)))
                            .muzzleFlash(MuzzleFlashType.TRIANGLE)
                            .build())
            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(1f, PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.SUPER_STAR_SHOOTER_RELOAD, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.63f, PlayableSound.of((Holder<SoundEvent>) HAHASoundRegistry.STAR_CANNON_RELOAD, 1.25f, 0.9f, 1.1f))
            ))
            .equipSound(PlayableSound.of(
                    SoundRegistry.CLOCKWORK_RIFLE_EQUIP,
                    0.75f, 0.9f, 1.1f
            ))
            .build();

}
