package com.example.cmathew.kickchase.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.cmathew.kickchase.R;

public class GameActivity extends AppCompatActivity {
    public static final int REQUEST_CHALLENGE_COMPLETION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


    }
}
