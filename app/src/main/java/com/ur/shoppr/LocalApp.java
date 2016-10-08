package com.ur.shoppr;

import android.app.Application;

import com.karumi.dexter.Dexter;

import timber.log.Timber;

/**
 * Created by azizimusa on 08/10/2016.
 */

public class LocalApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Dexter.initialize(this);

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
