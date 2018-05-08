package com.findtheletter.jetlightstudio.tpappigmo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ApplySettingsActivity extends AppCompatActivity {

    LinearLayout background;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_settings);
        background = (LinearLayout) findViewById(R.id.background);
        text = (TextView) findViewById(R.id.text);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        boolean dark = preferences.getBoolean("isDark", false);
        background.setBackgroundColor(Color.parseColor(dark ? "#212121" : "#ffffff"));
        text.setTextColor(Color.parseColor(!dark ? "#212121" : "#ffffff"));

        String pseudo = preferences.getString("EditPseudo","User");
        text.setText("Welcome "+ pseudo);

        int font = preferences.getInt("listFont",14);
        text.setTextSize(font);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.preference_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.settings:
                Intent i = new Intent(ApplySettingsActivity.this, SettingsActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
