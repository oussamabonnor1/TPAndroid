package com.findtheletter.jetlightstudio.tpappigmo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.customaction, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search: {
                Toast.makeText(this, "recherche", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.action_refresh: {
                Toast.makeText(this, "refresh", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.about: {
                Toast.makeText(this, "about", Toast.LENGTH_SHORT).show();
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);

        }
    }*/
}
