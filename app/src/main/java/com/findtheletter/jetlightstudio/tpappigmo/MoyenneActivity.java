package com.findtheletter.jetlightstudio.tpappigmo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MoyenneActivity extends AppCompatActivity {

    EditText one, two, three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moyenne);
        one = (EditText) findViewById(R.id.textField1);
        two = (EditText) findViewById(R.id.textField2);
        three = (EditText) findViewById(R.id.textField3);
    }

    public void calculer(View view) {
        int v1 = Integer.valueOf(one.getText().toString());
        int v2 = Integer.valueOf(two.getText().toString());
        int v3 = Integer.valueOf(three.getText().toString());

        float s = (v1 + v2 + v3) / 3;

    }
}
