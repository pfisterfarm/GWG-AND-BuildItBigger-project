package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.pfisterfarm.javajokelib.*;
import com.pfisterfarm.androidjokelib.androidjokelib;


public class MainActivity extends AppCompatActivity implements JokeAsyncTask.Callback {

    private static final String TELL_JOKE = "tell_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        JokeAsyncTask getJokeTask = new JokeAsyncTask(this);
        getJokeTask.execute(this);
    }


    @Override
    public void jokeFetched(String fetchedJoke) {
        Intent intent = new Intent(this, androidjokelib.class);
        intent.putExtra(TELL_JOKE, fetchedJoke);
        startActivity(intent);
    }
}
