package it.feio.android.omninotes.qa.utils;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;
import it.feio.android.omninotes.MainActivity;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class OmniNoteBase {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    public static void tapOn(int resourceId) {
        onView(withId(resourceId)).perform(click());
        onView(withContentDescription("drawer open"));
    }

    public static void tapOn(String text) {
        onView(withText(text)).perform(click());
    }

    public static void goBack() {
        Espresso.pressBack();
    }

    public static void closeKeyboard() {
        Espresso.closeSoftKeyboard();
    }

    public static void closeKeyboardGoBack() {
        closeKeyboard();
        goBack();
    }

    public static void checkExists(int resourceId) {
        onView(withId(resourceId)).check(matches(isDisplayed()));
    }

    public static void checkExists(String text) {
        onView(withText(text)).check(matches(isDisplayed()));
    }

    public static void enterText(int resourceId, String text) {
        onView(withId(resourceId)).perform(click(), replaceText(text), closeSoftKeyboard());
    }

    public static void checkNotExists(String text) {
        onView(withText(text)).check(doesNotExist());
    }

    public static void checkNotExists(int resourceId) {
        onView(withText(resourceId)).check(doesNotExist());
    }
}
