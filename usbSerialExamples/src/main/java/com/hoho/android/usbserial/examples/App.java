package com.hoho.android.usbserial.examples;

import android.app.Application;

/**
 * Created by igaglioti on 24/04/2015.
 */
public class App extends Application {
    public static boolean isActivityVisible() {
        return activityVisible;
    }

    public static void activityResumed() {
        activityVisible = true;
    }

    public static void activityPaused() {
        activityVisible = false;
    }

    private static boolean activityVisible;
}

