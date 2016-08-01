package com.codevscolor.testing;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class InstrumentedUnitTest {

    private final String prefName = "TEST_PREF";


    @Test
    public void test_sharedPref(){
        Context mContext = InstrumentationRegistry.getContext();
        SharedPreferences mSharedPreferences = mContext.getSharedPreferences(prefName,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString("key", "value");
        editor.apply();

        SharedPreferences mSharedPreferences2 = mContext.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        assertThat("value", is(mSharedPreferences2.getString("key", null)));
    }


}