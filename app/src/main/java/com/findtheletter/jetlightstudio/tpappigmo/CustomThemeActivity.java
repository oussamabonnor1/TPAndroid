package com.findtheletter.jetlightstudio.tpappigmo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class CustomThemeActivity extends AppCompatActivity {

    Button btn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_theme);
        btn = (Button) findViewById(R.id.button);
        img = (ImageView) findViewById(R.id.img);
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.tween);
        btn.startAnimation(anim);

        img.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) img.getBackground()).start();
            }
        });
    }
}
