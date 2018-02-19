package com.example.cmathew.kickchase;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.example.cmathew.kickchase.di.component.ApplicationComponent;
import com.example.cmathew.kickchase.di.component.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class KickChaseApplication extends Application
        implements HasActivityInjector, HasSupportFragmentInjector {
    public final static String PREFS_PATH = "kick_chase_preferences";

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = createAppComponent();
        applicationComponent.inject(this);
    }

    private ApplicationComponent createAppComponent() {
        return DaggerApplicationComponent.builder().application(this).build();
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }
}


