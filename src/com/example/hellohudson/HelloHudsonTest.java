package com.example.hellohudson;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.hellohudson.HelloHudsonTest \
 * com.example.hellohudson.tests/android.test.InstrumentationTestRunner
 */
public class HelloHudsonTest extends ActivityInstrumentationTestCase2<HelloHudson> {

    public HelloHudsonTest() {
        super("com.example.hellohudson", HelloHudson.class);
    }

}
