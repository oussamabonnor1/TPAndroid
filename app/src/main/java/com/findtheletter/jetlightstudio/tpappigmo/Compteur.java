package com.findtheletter.jetlightstudio.tpappigmo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Compteur extends AppCompatActivity {

    TextView r;
    int resultat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compteur);
        r = (TextView) findViewById(R.id.text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.compteur_menu, menu);
        return true;
    }

    public void ajouterUn(View v) {
        resultat++;
        r.setText(resultat + "");
    }

    public void ajouterDix(View v) {
        resultat += 10;
        r.setText(resultat + "");
    }

    public void ajouterCent(View v) {
        resultat += 100;
        r.setText(resultat + "");
    }
}
