package it.feio.android.omninotes.qa.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import it.feio.android.omninotes.qa.screens.HomeScreen;
import it.feio.android.omninotes.qa.utils.OmniNoteBase;

@RunWith(AndroidJUnit4.class)
public class HomeTests extends OmniNoteBase {

    @Test
    public void verifyFabButtonsTest() {
        HomeScreen.openFab();
        HomeScreen.verifyFabButtons();
    }

    @Test //go to Checklist and back to Home screen
    public void verifyChecklistTest() {
        HomeScreen.createNewChecklist();
        closeKeyboardGoBack();
        HomeScreen.isOnHomeScreen();
    }

    @Test //go to Text Note and back to Home screen
    public void verifyTextNoteTest() {
        HomeScreen.createNewTextNote();
        closeKeyboardGoBack();
        HomeScreen.isOnHomeScreen();
    }

    @Test
    public void verifySearchTest() {
        HomeScreen.tapSearchButton();
        HomeScreen.typeSearch("yoyo");
        HomeScreen.tapSearchCancel();
    }
}
