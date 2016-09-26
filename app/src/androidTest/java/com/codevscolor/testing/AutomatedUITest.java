package com.codevscolor.testing;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
@RunWith(AndroidJUnit4.class)
@LargeTest
public class AutomatedUITest {
    private String mEmail;
    private String mPassword;
    private String mSuccessMsg;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);
    @Before
    public void initUserNamePassword() {
        mEmail = "codevscolor@gmail.com";
        mPassword = "password";
        mSuccessMsg = "success";
    }
    @Test
    public void login_MainActivity() {
        onView(withId(R.id.editTextEmail))
                .perform(typeText(mEmail));
        onView(withId(R.id.editTextPassword)).perform(typeText(mPassword));
        onView(withId(R.id.button)).perform(click());
        // Check if the result is success or not
        onView(withId(R.id.textViewResult))
                .check(matches(withText(mSuccessMsg)));
    }
}