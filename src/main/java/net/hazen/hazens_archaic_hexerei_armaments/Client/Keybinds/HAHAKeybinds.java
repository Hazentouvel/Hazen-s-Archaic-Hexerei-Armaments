package net.hazen.hazens_archaic_hexerei_armaments.Client.Keybinds;

import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public final class HAHAKeybinds {

    public static final KeyMapping MODE_SWITCH = new KeyMapping(
            "key.hazens_archaic_hexerei_armaments.mode_switch",
            GLFW.GLFW_KEY_V,
            KeyMapping.Category.GAMEPLAY
    );

    private HAHAKeybinds() {}
}