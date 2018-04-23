package com.findtheletter.jetlightstudio.tpappigmo;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Tp5Exo1FerenhiteToCelsusActivity extends AppCompatActivity {

    RadioButton radio1, radio2;
    TextView resultat;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp5_exo1_ferenhite_to_celsus);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        resultat = (TextView) findViewById(R.id.resultatTextView);
        input = (EditText) findViewById(R.id.editTextValeur);
    }

    public float f2C(float f) {
        return ((float) 5 / 9) * (f - 32);
    }

    public float c2f(float c) {
        return ((float) 9 / 5) * c + 32;
    }

    public void Convertir(View v) {
        if (!input.getText().toString().isEmpty()) {
            if (radio1.isChecked()) {
                resultat.setText("Resultat:\n" + c2f(Float.valueOf(input.getText().toString())));
            } else {
                resultat.setText("Resultat:\n" + f2C(Float.valueOf(input.getText().toString())));
            }
            input.setText("");
        } else {
            AlertDialog.Builder alrt = new AlertDialog.Builder(this);
            alrt.setMessage("Empty field!!").setCancelable(true).create().show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_f2c, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.goToDevise:
                Intent i = new Intent(this, Tp5Exo1Part2Activity.class);
                startActivity(i);
                break;
            case R.id.quitter:
                onDestroy();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
