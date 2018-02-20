package com.findtheletter.jetlightstudio.tpappigmo;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("info","You created the app!");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("info","You started the app!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("info","You paused the app!");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("info","You stoped the app!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("info","You resumed the app!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("info","You destroyed the app!");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("info","You saved the app!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("info","You restarted the app!");
    }
}
