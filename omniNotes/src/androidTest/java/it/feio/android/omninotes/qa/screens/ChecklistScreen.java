package it.feio.android.omninotes.qa.screens;

import it.feio.android.omninotes.R;
import it.feio.android.omninotes.qa.utils.OmniNoteBase;

public class ChecklistScreen extends OmniNoteBase {

    //locators
    private static int title = R.id.detail_title;

    //functions
    public static void enterTitle(String text) {
        enterText(title, text);
    }
}
