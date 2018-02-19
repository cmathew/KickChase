package com.example.cmathew.kickchase.di.component;

import android.app.Application;

import com.example.cmathew.kickchase.KickChaseApplication;
import com.example.cmathew.kickchase.di.componentmodule.ActivityBindingModule;
import com.example.cmathew.kickchase.di.module.SharedPreferencesModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules={
        // Required by the dagger-android framework
        AndroidSupportInjectionModule.class,
        // Specify valid injection targets
        ActivityBindingModule.class,
        // Provider modules
        SharedPreferencesModule.class})

public interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        ApplicationComponent.Builder application(Application application);
        ApplicationComponent build();
    }

    void inject(KickChaseApplication app);
}
