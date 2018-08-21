package com.torres.toni.jokedisplaylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        jokeTextView = findViewById(R.id.joke_text_view);
        Intent intent = getIntent();
        if (intent.hasExtra(getString(R.string.joke_extra))) {
            jokeTextView.setText(intent.getStringExtra(getString(R.string.joke_extra)));
        } else {
            jokeTextView.setText(R.string.no_joke);
        }
    }
}
