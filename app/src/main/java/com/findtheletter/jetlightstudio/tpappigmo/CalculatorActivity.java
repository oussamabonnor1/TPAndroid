package com.findtheletter.jetlightstudio.tpappigmo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    EditText textFieldOne, textFieldTwo;
    TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        textFieldOne = (EditText) findViewById(R.id.textFieldOne);
        textFieldTwo = (EditText) findViewById(R.id.textFieldTwo);
        resultat = (TextView) findViewById(R.id.resultat);
    }


    public void Calculate(View view) {

        try {
            int  v1 = Integer.valueOf(textFieldOne.getText().toString());
            int v2 = Integer.valueOf(textFieldTwo.getText().toString());
            int s = 0;
            switch (view.getId()) {
                case R.id.plus:
                    s = v1 + v2;
                    break;
                case R.id.minus:
                    s = v1 - v2;
                    break;
                case R.id.mult:
                    s = v1 * v2;
                    break;
                case R.id.div:
                    if (v2 != 0) {
                        s = v1 / v2;
                    } else {
                        resultat.setText("Division par zero!!");
                    }
                    break;
            }

            resultat.setText("Resultat\n" + s);

        } catch (Exception e) {
            if (textFieldOne.getText().toString().isEmpty() || textFieldTwo.getText().toString().isEmpty()) {
                resultat.setText("Veillez remplir tout les champs");
            } else resultat.setText("Entrer des chiffres seulement!");
        }
    }
}
