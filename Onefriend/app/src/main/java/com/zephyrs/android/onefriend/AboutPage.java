package com.zephyrs.android.onefriend;

import android.content.Intent;
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

public class AboutPage extends AppCompatActivity {
    Button back;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    Button send;
    EditText subject1;
    EditText comment;
    TextView t1;
    TextView t2;
    TextView t3;
    Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_page);
        t1 = (TextView) findViewById(R.id.textView1);
        back = (Button)findViewById(R.id.back_button);
        about = (Button)findViewById(R.id.about);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                overridePendingTransition(R.anim.fade, R.anim.hold);
//                Intent testintent = new Intent(getBaseContext(),BottomBar.class);
//                startActivity(testintent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.fade, R.anim.hold);
                Intent testintent = new Intent(getBaseContext(),AboutUs.class);
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
