package app.morphe.extension.youtube.patches.theme;

import android.graphics.Color;

import app.morphe.extension.shared.Logger;
import app.morphe.extension.shared.Utils;
import app.morphe.extension.youtube.settings.Settings;

import static app.morphe.extension.shared.StringRef.str;

@SuppressWarnings("unused")
public final class LogoColorPatch {

    private static final boolean LOGO_CUSTOM_COLOR_ENABLED = Settings.LOGO_CUSTOM_COLOR.get();

    // TODO: Add injection points here once bytecode fingerprints are implemented.
}
