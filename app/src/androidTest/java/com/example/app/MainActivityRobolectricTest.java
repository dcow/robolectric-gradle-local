package com.example.activity;

import android.app.Activity;
import com.example.app.MainActivity;
import com.example.app.RobolectricGradleTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@Config(emulateSdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityRobolectricTest {

    @Test
    public void testSomething() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertTrue(activity != null);
    }
}