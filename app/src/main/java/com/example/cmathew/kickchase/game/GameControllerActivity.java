package com.example.cmathew.kickchase.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cmathew.kickchase.R;

public class GameControllerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_controller);

        Intent gameIntent = new Intent(this, GameActivity.class);
        Bundle extras = new Bundle();
        extras.putLong("challenge_id", 1);
        gameIntent.putExtras(extras);
        startActivityForResult(gameIntent, GameActivity.REQUEST_CHALLENGE_COMPLETION);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
