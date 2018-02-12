package com.example.cmathew.kickchase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cmathew.kickchase.welcome.OverviewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent welcomeIntent = new Intent(this, OverviewActivity.class);
        startActivity(welcomeIntent);
    }
}
