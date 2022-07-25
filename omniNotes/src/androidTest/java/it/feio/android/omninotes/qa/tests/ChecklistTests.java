package it.feio.android.omninotes.qa.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import it.feio.android.omninotes.qa.screens.ChecklistScreen;
import it.feio.android.omninotes.qa.screens.HomeScreen;
import it.feio.android.omninotes.qa.utils.OmniNoteBase;

@RunWith(AndroidJUnit4.class)
public class ChecklistTests extends OmniNoteBase {

    @Test
    public void createChecklistTest() {
        HomeScreen.createNewChecklist();
        ChecklistScreen.enterTitle("Check it out");
    }

    @Test
    public void createChecklistWithReminderTest() {
        createChecklistTest();
        ChecklistScreen.tapAddReminder();
        ChecklistScreen.tapOK();
    }
}
