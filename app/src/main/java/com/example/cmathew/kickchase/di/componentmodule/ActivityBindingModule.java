package com.example.cmathew.kickchase.di.componentmodule;

import com.example.cmathew.kickchase.MainActivity;
import com.example.cmathew.kickchase.di.scope.ActivityScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}