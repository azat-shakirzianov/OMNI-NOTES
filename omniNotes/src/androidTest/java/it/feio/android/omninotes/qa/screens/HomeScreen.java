package it.feio.android.omninotes.qa.screens;

import it.feio.android.omninotes.R;
import it.feio.android.omninotes.qa.utils.OmniNoteBase;

public class HomeScreen extends OmniNoteBase {

    //locators
    private static int fabButton = R.id.fab_expand_menu_button;
    private static int newChecklistButton = R.id.fab_checklist;
    private static int newNoteButton = R.id.fab_note;
    private static int cameraButton = R.id.fab_camera;
    private static int searchButton = R.id.menu_search;
    private static int searchCancel = R.id.search_close_btn;
    private static int searchTextField = R.id.search_src_text;

    //functions
    public static void openFab() {
        tapOn(fabButton);
    }

    public static void verifyFabButtons() {
        checkExists(cameraButton);
        checkExists(newChecklistButton);
        checkExists(newNoteButton);
    }

    public static void createNewChecklist() {
        openFab();
        tapOn(newChecklistButton);
    }

    public static void createNewTextNote() {
        openFab();
        tapOn(newNoteButton);
    }

    public static void openCamera() {
        openFab();
        tapOn(cameraButton);
    }

    public static void isOnHomeScreen() {
        checkExists(fabButton);
    }

    public static void verifyHomeScreenEmpty() {
        checkExists("Nothing here!");
    }

    public static void verifyHomeScreenNotEmpty() {
        checkNotExists("Nothing here!");
    }

    public static void tapSearchButton() {
        tapOn(searchButton);
    }

    public static void tapSearchCancel() {
        tapOn(searchCancel);
    }

    public static void typeSearch(String text) {
        enterText(searchTextField, text);
    }
}
