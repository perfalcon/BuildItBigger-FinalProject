package com.falcon.balav.jokedisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "Joke key";
    public static final String TAG=JokeActivity.class.getSimpleName ();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG,"In onCreate " );
        setContentView(R.layout.activity_joke);
    }



}
