package com.example.sbh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(count == 0){
            Account acct1 = new BusinessAccount("Test", "psegovia04@gmail.com", "hello123", "225 Washington", "6179991108", "Tiles", 2, 0);
            Account acct2 = new ConsumerAccount("psegovia@bbns.org", "hello1234", "24 randolph road, MI", 1);
            Account acct3 = new ConsumerAccount("daniellercbrennan@gmail.com", "12345678", "1 Isaac Sprague Dr, Hingham, MA", 2 );
            Account acct4 = new BusinessAccount("business23456", "nbers@gmail.com", "passingpassword", "34 Butler Dr, Hingham, MA", "4567890", "NotSure", 3,2);
            Account acct5 = new BusinessAccount("business1", "daniblobfish9@gmail.com", "passingpassword", "3 Isaac Sprague Dr, Hingham, MA", "7817498290", "Titles", 2,1);
            Account acct6 = new BusinessAccount("business45667", "echin@gmail.com", "wert12345678", "10 Butler Dr, Hingham, MA", "4567890", "NotSure", 3,2);

        }
        count++;
        Button logInBtn = findViewById(R.id.login2);
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(startIntent);
            }
        });
        Button signUpBtn = findViewById(R.id.signup);
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(startIntent);
            }
        });
    }
}