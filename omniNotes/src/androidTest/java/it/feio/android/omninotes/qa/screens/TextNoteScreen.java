package it.feio.android.omninotes.qa.screens;

import it.feio.android.omninotes.R;
import it.feio.android.omninotes.qa.utils.OmniNoteBase;

public class TextNoteScreen extends OmniNoteBase {

    //locators
    private static int title = R.id.detail_title;
    private static int content = R.id.detail_content;

    //functions
    public static void enterTitle(String text) {
        enterText(title, text);
    }

    public static void enterContent(String text) {
        enterText(content, text);
    }
}
