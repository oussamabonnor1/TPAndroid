package com.findtheletter.jetlightstudio.tpappigmo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class CompterActivity extends AppCompatActivity {
    RadioButton pommeRadio, poireRadio;
    TextView pommeText, poireText;
    ListView listView;
    int pomme, poire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compter);

        pommeRadio = (RadioButton) findViewById(R.id.pommeRadio);
        poireRadio = (RadioButton) findViewById(R.id.poireRadio);

        pommeText = (TextView) findViewById(R.id.pommes);
        poireText = (TextView) findViewById(R.id.poires);

        listView = (ListView) findViewById(R.id.listView);
        String[] s = {"nb Pommes", "nb Poire", "Quitter"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, s);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Toast.makeText(getApplicationContext(), "Nobre de pommes: " + pomme, Toast.LENGTH_SHORT).show();
                        return;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Nobre de poires: " + poire, Toast.LENGTH_SHORT).show();
                        return;
                    case 2:
                        onStop();
                        return;
                    default:
                        return;
                }
            }
        });

        pomme = poire = 0;
    }

    public void incrementer(View view) {
        if (pommeRadio.isChecked()) {
            pomme++;
        } else {
            poire++;
        }
        pommeText.setText("Pommes=\n " + pomme);
        poireText.setText("Poires=\n " + poire);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.customaction, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.pommeMenu:
                Toast.makeText(this, "Nobre de pommes: " + pomme, Toast.LENGTH_SHORT).show();
                return true;

            case R.id.poireMenu:
                Toast.makeText(this, "Nobre de poires: " + poire, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.quitter:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
