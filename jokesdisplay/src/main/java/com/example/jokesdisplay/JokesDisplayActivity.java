package com.example.jokesdisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesDisplayActivity extends AppCompatActivity {

    private TextView joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_display);

        joke = findViewById(R.id.tv_joke);

        displayJoke();
    }

    private void displayJoke() {
        joke.setText(getIntent().getStringExtra("JOKE"));
    }
}
