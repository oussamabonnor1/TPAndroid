package com.findtheletter.jetlightstudio.tpappigmo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    {/*
    public void Calculate(View view) {

        try {
            int v1 = Integer.valueOf(textFieldOne.getText().toString());
            int v2 = Integer.valueOf(textFieldTwo.getText().toString());
            int s = 0;
            String info = "";
            switch (view.getId()) {
                case R.id.add:
                    s = v1 + v2;
                    info = "Resultat\n" + s;
                    break;
                case R.id.minus:
                    s = v1 - v2;
                    info = "Resultat\n" + s;
                    break;
                case R.id.mult:
                    s = v1 * v2;
                    info = "Resultat\n" + s;
                    break;
                case R.id.div:
                    if (v2 != 0) {
                        s = v1 / v2;
                        info = "Resultat\n" + s;
                    } else {
                        Toast.makeText(getApplicationContext(), "Division par zero", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }

            resultat.setText(info);

        } catch (Exception e) {
            if (textFieldOne.getText().toString().isEmpty() || textFieldTwo.getText().toString().isEmpty()) {
                resultat.setText("Veillez remplir tout les champs");
            } else resultat.setText("Entrer des chiffres seulement!");
        }
    }

    public void addFunction(View view) {
        int v1 = Integer.valueOf(textFieldOne.getText().toString());
        int v2 = Integer.valueOf(textFieldTwo.getText().toString());
        int s = 0;
        String info = "";

        s = v1 + v2;
        info = "Resultat\n" + s;

        resultat.setText(info);
    }

    public void minusFunction(View view) {
        int v1 = Integer.valueOf(textFieldOne.getText().toString());
        int v2 = Integer.valueOf(textFieldTwo.getText().toString());
        int s = 0;
        String info = "";

        s = v1 - v2;
        info = "Resultat\n" + s;

        resultat.setText(info);
    }

    public void multFunction(View view) {
        int v1 = Integer.valueOf(textFieldOne.getText().toString());
        int v2 = Integer.valueOf(textFieldTwo.getText().toString());
        int s = 0;
        String info = "";

        s = v1 * v2;
        info = "Resultat\n" + s;

        resultat.setText(info);
    }

    public void divFunction(View view) {
        int v1 = Integer.valueOf(textFieldOne.getText().toString());
        int v2 = Integer.valueOf(textFieldTwo.getText().toString());
        float s = 0;
        String info = "";
        if (v2 != 0) {
            s = (float) v1 / v2;
            info = "Resultat\n" + s;
        } else {
            Toast.makeText(getApplicationContext(), "Division par zero", Toast.LENGTH_SHORT).show();
        }
        resultat.setText(info);
    }
    */}

    public void compter(View view) {
        Intent intent = new Intent(CalculatorActivity.this, Calculator2Activity.class);
        intent.putExtra("key1", Integer.valueOf(textFieldOne.getText().toString()));
        intent.putExtra("key2", Integer.valueOf(textFieldTwo.getText().toString()));
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String info = data.getStringExtra("info");
        if (info != null) {
            Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();
        }
        resultat.setText("Resultat\n" + resultCode);
    }
}
