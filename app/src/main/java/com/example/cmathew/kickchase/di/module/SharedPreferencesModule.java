package com.example.cmathew.kickchase.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.cmathew.kickchase.KickChaseApplication;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public class SharedPreferencesModule {
    @Provides
    @Reusable
    SharedPreferences providesSharedPreferences(Application application) {
        return application.getSharedPreferences(KickChaseApplication.PREFS_PATH, Context.MODE_PRIVATE);
    }
}
