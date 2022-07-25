package it.feio.android.omninotes.qa.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import it.feio.android.omninotes.qa.screens.HomeScreen;
import it.feio.android.omninotes.qa.screens.TextNoteScreen;
import it.feio.android.omninotes.qa.utils.OmniNoteBase;

@RunWith(AndroidJUnit4.class)
public class TextNoteTests extends OmniNoteBase {

    @Test
    public void createTextNoteTest() {
        HomeScreen.createNewTextNote();
        TextNoteScreen.enterTitle("Azat");
        TextNoteScreen.enterContent("pew pew pew");
    }

    @Test
    public void createTextNoteWithReminderTest() {
        createTextNoteTest();
        TextNoteScreen.tapAddReminder();
        TextNoteScreen.tapOK();
    }
}
