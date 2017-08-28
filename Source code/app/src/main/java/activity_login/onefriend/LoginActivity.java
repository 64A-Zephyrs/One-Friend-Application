package activity_login.onefriend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Barry on 17/8/17.
 */

public class LoginActivity extends AppCompatActivity {

    Button stresstest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        stresstest = (Button) findViewById(R.id.stresstest);

        stresstest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testintent = new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(testintent);
            }
        });
    }

}
