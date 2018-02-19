package com.example.cmathew.kickchase;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cmathew.kickchase.welcome.OverviewActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;

public class MainActivity extends AppCompatActivity {
    @Inject
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean welcomed = preferences.getBoolean(OverviewActivity.PREF_KEY_OVERVIEW_PROVIDED, false);
        if (!welcomed ) {
            Intent welcomeIntent = new Intent(this, OverviewActivity.class);
            startActivityForResult(welcomeIntent, OverviewActivity.REQUEST_PROVIDE_OVERVIEW);
        }
    }
}
