package com.zephyrs.android.onefriend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;

import java.util.ArrayList;

/**
 * Created by Barry on 3/9/17.
 */

public class FactPage extends AppCompatActivity {
    protected String[] mMonths = new String[] {
            "Population", "Stress", "Depression","Substance"
    };
    Integer score;
    private View vbarchart;
    float Frequency1;
    float Frequency2;
    float Frequency3;
    float Frequency4;
    float Frequency5;
    ScrollView scroll;
    ViewGroup appear;
    Button readmore;
    ScrollView scrollview;
    BarChart barChart;
    BarData theData;
    ArrayList<String> unitname = new ArrayList<>();
    RadioButton male;
    RadioButton female;
    RadioButton person;
    RadioButton age16;
    RadioButton age25;
    Button back;
    TextView bartext;
    LinearLayout root;
    Button stressinstudy;
    Button causeofstress;
    Button quickfix;
    Button didyouknow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fact_page);
//        readmore = (Button) findViewById(R.id.read_more);
        back = (Button) findViewById(R.id.back_button);
        stressinstudy = (Button) findViewById(R.id.studyinstress);
        causeofstress = (Button) findViewById(R.id.causeofstress);
        quickfix = (Button) findViewById(R.id.quickfixes);
        didyouknow = (Button) findViewById(R.id.didyouknow);

//        readmore.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                readmore.setText(" ");
//                appear.setVisibility(View.VISIBLE);
//                scrollview.post(new Runnable() {
//                    public void run() {
//                        scrollview.fullScroll(ScrollView.FOCUS_DOWN);
//                    }
//                });
//                AlphaAnimation animationview = new AlphaAnimation(0f, 1f);
//                animationview.setDuration(500);
//                appear.setAnimation(animationview);
//            }
//        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onBackPressed();
                overridePendingTransition(R.anim.fade, R.anim.hold);
//                Intent testintent = new Intent(getBaseContext(),BottomBar.class);
//                startActivity(testintent);
            }
        });


        causeofstress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overridePendingTransition(R.anim.fade, R.anim.hold);
                Intent testintent = new Intent(getBaseContext(),FactCauseofstress.class);
                startActivity(testintent);

            }
        });

        didyouknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overridePendingTransition(R.anim.fade, R.anim.hold);
                Intent testintent = new Intent(getBaseContext(),FactDidyouknow.class);
                startActivity(testintent);

            }
        });

        quickfix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overridePendingTransition(R.anim.fade, R.anim.hold);
                Intent testintent = new Intent(getBaseContext(),FactQuickFix.class);
                startActivity(testintent);

            }
        });

        stressinstudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overridePendingTransition(R.anim.fade, R.anim.hold);
                Intent testintent = new Intent(getBaseContext(),FactStressInStudent.class);
                startActivity(testintent);

            }
        });

    }

    @Override
    public void onBackPressed() {
        // 判断是否能够回退
        super.onBackPressed();
    }

}