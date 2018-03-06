package com.findtheletter.jetlightstudio.tpappigmo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Calculator2Activity extends AppCompatActivity implements View.OnClickListener {

    Button add, minus, mult, div;
    int v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);
        add = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.minus);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);

        add.setOnClickListener(this);
        minus.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);

        v1 = getIntent().getIntExtra("key1", 0);
        v2 = getIntent().getIntExtra("key2", 0);
    }

    @Override
    public void onClick(View view) {

        int s = 0;
        String info = "";
        switch (view.getId()) {
            case R.id.add:
                s = v1 + v2;
                info = "addition clicked";
                break;
            case R.id.minus:
                s = v1 - v2;
                info = "subtraction clicked";
                break;
            case R.id.mult:
                s = v1 * v2;
                info = "multiplication clicked";
                break;
            case R.id.div:
                try {
                    s = v1 / v2;
                    info = "division clicked";
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Division par zero", Toast.LENGTH_SHORT).show();
                }
                break;
        }

        Intent i = new Intent(Calculator2Activity.this, CalculatorActivity.class);
        i.putExtra("info", info);
        setResult(s, i);
        finish();
    }
}
