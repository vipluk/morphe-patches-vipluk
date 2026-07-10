package app.morphe.patches.youtube.layout.logocolor

import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patches.shared.misc.settings.preference.SwitchPreference
import app.morphe.patches.shared.misc.settings.preference.TextPreference
import app.morphe.patches.shared.misc.settings.preference.InputType
import app.morphe.patches.youtube.misc.extension.sharedExtensionPatch
import app.morphe.patches.youtube.misc.settings.PreferenceScreen
import app.morphe.patches.youtube.shared.Constants.COMPATIBILITY_YOUTUBE

private const val EXTENSION_CLASS = "Lapp/morphe/extension/youtube/patches/theme/LogoColorPatch;"

val logoColorPatch = bytecodePatch(
    description = "Set a custom color of the YouTube and Shorts logo inside app",
) {
    dependsOn(
        sharedExtensionPatch,
    )

    compatibleWith(COMPATIBILITY_YOUTUBE)

    execute {
        PreferenceScreen.GENERAL.addPreferences(
            SwitchPreference("morphe_logo_custom_color"),
            TextPreference(
                "morphe_logo_custom_color_value",
                tag = "app.morphe.extension.shared.settings.preference.ColorPickerPreference",
                inputType = InputType.TEXT_CAP_CHARACTERS
            )
        )

        // TODO: Add bytecode hooks here when fingerprints are implemented.
    }
}
