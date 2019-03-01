package com.android.launcher3;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class LauncherApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
