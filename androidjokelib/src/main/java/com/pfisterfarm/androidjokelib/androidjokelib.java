package com.pfisterfarm.androidjokelib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class androidjokelib extends AppCompatActivity {
    static private String TELL_JOKE = "tell_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String getJoke;
        TextView joke_tv;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent = getIntent();
        getJoke = intent.getStringExtra(TELL_JOKE);
	    joke_tv = (TextView) findViewById(R.id.joke_tv);
        joke_tv.setText(getJoke);
    }
}
