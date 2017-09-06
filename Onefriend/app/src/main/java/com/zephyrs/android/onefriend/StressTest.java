package com.zephyrs.android.onefriend;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by Barry on 2/9/17.
 */

public class StressTest extends AppCompatActivity {
    Button done;
    CheckBox b1;
    CheckBox b2;
    CheckBox b3;
    CheckBox b4;
    CheckBox b5;
    CheckBox b6;
    CheckBox b7;
    CheckBox b8;
    CheckBox b9;
    CheckBox b10;
    CheckBox b11;
    CheckBox b12;
    Integer score;
    Button back;
    Button question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stress_test);
        score = 0;
        done = (Button) findViewById(R.id.done);
        back = (Button) findViewById(R.id.back_button);
        question = (Button) findViewById(R.id.buttonquestion);
        b1 = (CheckBox) findViewById(R.id.button1);
        b2 = (CheckBox) findViewById(R.id.button2);
        b3 = (CheckBox) findViewById(R.id.button3);
        b4 = (CheckBox) findViewById(R.id.button4);
        b5 = (CheckBox) findViewById(R.id.button5);
        b6 = (CheckBox) findViewById(R.id.button6);
        b7 = (CheckBox) findViewById(R.id.button7);
        b8 = (CheckBox) findViewById(R.id.button8);
        b9 = (CheckBox) findViewById(R.id.button9);
        b10 = (CheckBox) findViewById(R.id.button10);
        b11 = (CheckBox) findViewById(R.id.button11);
        b12 = (CheckBox) findViewById(R.id.button12);

        ScaleAnimation scaleAnimation1 = new ScaleAnimation(0f, 1, 1f, 1f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 1f);
        scaleAnimation1.setDuration(1000);


        AlphaAnimation animationview2 = new AlphaAnimation(0f, 1f);
        animationview2.setDuration(200);
        b1.setAnimation(animationview2);
        b2.setAnimation(animationview2);
        b3.setAnimation(animationview2);
        AlphaAnimation animationview3 = new AlphaAnimation(0f, 1f);
        animationview3.setDuration(500);
        b4.setAnimation(animationview3);
        b5.setAnimation(animationview3);
        b6.setAnimation(animationview3);
        AlphaAnimation animationview4 = new AlphaAnimation(0f, 1f);
        animationview4.setDuration(1000);
        b7.setAnimation(animationview4);
        b8.setAnimation(animationview4);
        b9.setAnimation(animationview4);
        AlphaAnimation animationview5 = new AlphaAnimation(0f, 1f);
        animationview5.setDuration(1200);
        b10.setAnimation(animationview5);
        b11.setAnimation(animationview5);
        b12.setAnimation(animationview5);


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                if(b1.isChecked()){
                    score = score + 1;
                }
                if(b2.isChecked()){
                    score = score + 1;
                }
                if(b3.isChecked()){
                    score = score + 2;
                }
                if(b4.isChecked()){
                    score = score + 2;
                }
                if(b5.isChecked()){
                    score = score + 1;
                }
                if(b6.isChecked()){
                    score = score + 1;
                }
                if(b7.isChecked()){
                    score = score + 3;
                }
                if(b8.isChecked()){
                    score = score + 3;
                }
                if(b9.isChecked()){
                    score = score + 1;
                }
                if(b10.isChecked()){
                    score = score + 3;
                }
                if(b11.isChecked()){
                    score = score + 1;
                }
                if(b12.isChecked()){
                    score = score + 1;
                }

                SharedPreferences settings = getBaseContext().getSharedPreferences("score", 0);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("stress_score", score.toString());
                editor.putString("stress_today", score.toString());
                editor.commit();
                Intent testintent = new Intent(StressTest.this,StressLevel.class);
                startActivity(testintent);
                overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testintent = new Intent(StressTest.this,BottomBar.class);
                startActivity(testintent);
                overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testintent = new Intent(StressTest.this,FactPage.class);
                startActivity(testintent);
                overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });
    }
}
