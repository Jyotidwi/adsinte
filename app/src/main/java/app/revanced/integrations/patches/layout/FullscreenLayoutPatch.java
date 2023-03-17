package app.revanced.integrations.patches.layout;

import android.view.View;

import app.revanced.integrations.adremover.AdRemoverAPI;
import app.revanced.integrations.settings.SettingsEnum;

public class FullscreenLayoutPatch {

    public static void hideFullscreenButtonContainer(View view) {
        if (SettingsEnum.HIDE_FULLSCREEN_BUTTON_CONTAINER.getBoolean() ||
                SettingsEnum.HIDE_FULLSCREEN_PANELS.getBoolean())
            AdRemoverAPI.HideViewWithLayout1dp(view);
    }

    public static int hideFullscreenPanels() {
        return SettingsEnum.HIDE_FULLSCREEN_PANELS.getBoolean() ? 8 : 0;
    }

    public static void hideFullscreenPanels(View view) {
        if (SettingsEnum.HIDE_FULLSCREEN_PANELS.getBoolean()) {
            AdRemoverAPI.HideViewWithLayout1dp(view);
        }
    }

    public static boolean showFullscreenTitle() {
        return SettingsEnum.SHOW_FULLSCREEN_TITLE.getBoolean() || !SettingsEnum.HIDE_FULLSCREEN_PANELS.getBoolean();
    }

    public static boolean hideEndscreenOverlay() {
        return SettingsEnum.HIDE_ENDSCREEN_OVERLAY.getBoolean();
    }

    public static boolean hideFilmstripOverlay() {
        return SettingsEnum.HIDE_FILMSTRIP_OVERLAY.getBoolean();
    }

    public static boolean disableSeekVibrate() {
        return SettingsEnum.DISABLE_HAPTIC_FEEDBACK_SEEK.getBoolean();
    }

    public static boolean disableScrubbingVibrate() {
        return SettingsEnum.DISABLE_HAPTIC_FEEDBACK_SCRUBBING.getBoolean();
    }

    public static boolean disableChapterVibrate() {
        return SettingsEnum.DISABLE_HAPTIC_FEEDBACK_CHAPTERS.getBoolean();
    }

    public static boolean disableZoomVibrate() {
        return SettingsEnum.DISABLE_HAPTIC_FEEDBACK_ZOOM.getBoolean();
    }
}
