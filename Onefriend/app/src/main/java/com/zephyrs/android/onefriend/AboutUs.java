package com.zephyrs.android.onefriend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

/**
 * Created by Barry on 20/9/17.
 */

public class AboutUs extends AppCompatActivity {
    Button back;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    Button send;
    EditText subject1;
    EditText comment;
    TextView t1;
    TextView t2;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        t1 = (TextView)findViewById(R.id.textView1);
        back = (Button)findViewById(R.id.back_button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });

//        String htmlText = "<html><body style=\"text-align:justify\"> %s </body></Html>";
//        String p1 = "At Zephyrs,we marry technology with innovation and we do so by using our advanced development team to design and implement turnkey projects. At the core of our team, is the desire to transform our clients' business with pioneering solutions that are a class apart.\n" +
//                "Our solution is designed to reduce stress levels in university going students. Many changes are experienced during studies at school or college and it can be overwhelming and stressful for example Homesickness, final exam stress, dealing with common illness and depression etc.It is critical that students deal with these issues,recognize their emotional imbalances and not allow them to interfere with their ability to perform all the academic functions in their day-to- day life. Practicing healthy activities daily will improve students well-being and using university resources can help facilitate a happy, successful experience.As such our application revolves around:\n";
//        String p2 = "Our solution is designed to reduce stress levels in university going students. Many changes are experienced during studies at school or college and it can be overwhelming and stressful for example Homesickness, final exam stress, dealing with common illness and depression etc. It is critical that students deal with these issues, recognize their emotional imbalances and not allow them to interfere with their ability to perform all the academic functions in their day-to- day life. Practicing healthy activities daily will improve students well-being and using university resources can help facilitate a happy, successful experience. As such our application revolves around:\n";
//        String p3 = "1.Allow students to track and identify the stress levels they face each day.";
//        String p4 ="2.Provide facts about stress effects in students and its impact.";
//        String p5 ="3.Allow students to log their daily healthy habits that will reduce the stress level for the day.";
//        String p6 = "4.Generate a weekly report that showcases the positive impact of using the application in your lives.";
//        WebView webView1 = (WebView) findViewById(R.id.webView1);
//        WebView webView2 = (WebView) findViewById(R.id.webView2);
//        WebView webView3 = (WebView) findViewById(R.id.webView3);
//        WebView webView4 = (WebView) findViewById(R.id.webView4);
//        WebView webView5 = (WebView) findViewById(R.id.webView5);
//        WebView webView6 = (WebView) findViewById(R.id.webView6);
//
//        webView1.loadData(String.format(htmlText, p1), "text/html", "utf-8");
//        webView2.loadData(String.format(htmlText, p2), "text/html", "utf-8");
//        webView3.loadData(String.format(htmlText, p3), "text/html", "utf-8");
//        webView4.loadData(String.format(htmlText, p4), "text/html", "utf-8");
//        webView5.loadData(String.format(htmlText, p5), "text/html", "utf-8");
//        webView6.loadData(String.format(htmlText, p6), "text/html", "utf-8");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
