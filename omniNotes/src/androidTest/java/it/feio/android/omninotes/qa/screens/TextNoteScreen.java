package it.feio.android.omninotes.qa.screens;

import androidx.test.espresso.ViewInteraction;
import it.feio.android.omninotes.R;
import it.feio.android.omninotes.qa.utils.OmniNoteBase;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

public class TextNoteScreen extends OmniNoteBase {

    //locators
    private static int title = R.id.detail_title;
    private static int content = R.id.detail_content;
    private static int addReminder = R.id.reminder_layout;

    //functions
    public static void enterTitle(String text) {
        enterText(title, text);
    }

    public static void enterContent(String text) {
        enterText(content, text);
    }

    public static void tapAddReminder() {
        tapOn(addReminder);
    }

    public static void tapOK() {
        ViewInteraction viewInteraction = onView(allOf(withId(R.id.buttonPositive), withText("Ok"), withParent(allOf(withId(R.id.button_layout)))));
        viewInteraction.perform(click());
    }
}
