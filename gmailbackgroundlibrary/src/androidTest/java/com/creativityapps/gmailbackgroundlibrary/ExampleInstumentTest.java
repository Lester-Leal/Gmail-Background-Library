package com.creativityapps.gmailbackgroundlibrary;

import static org.junit.Assert.assertEquals;
import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.creativityapps.gmailbackgroundlibrary", appContext.getPackageName());
    }
}