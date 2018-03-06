package com.findtheletter.jetlightstudio.tpappigmo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Compteur extends AppCompatActivity {

    TextView r;
    int resultat = 0;
    Button one, ten, cent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compteur);
        r = (TextView) findViewById(R.id.text);
        one = (Button) findViewById(R.id.plusUn);
        one.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                showOptions(view);
                return true;
            }
        });
        ten = (Button) findViewById(R.id.plusDix);
        ten.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                showOptions(view);
                return true;
            }
        });
        cent = (Button) findViewById(R.id.plusCent);
        cent.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                showOptions(view);
                return true;
            }
        });
    }

    public void showOptions(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Compteur.this);
        View v = getLayoutInflater().inflate(R.layout.compteur_custom_context_menu, null);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        Button reset = v.findViewById(R.id.resetButton);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultat = 0;
                r.setText(resultat + "");
                alertDialog.hide();
            }
        });
        Button quit = v.findViewById(R.id.quitButton);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        alertDialog.show();
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
