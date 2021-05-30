package com.example.sbh;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button logInBtn = findViewById(R.id.login2);
        Account acct1 = new BusinessAccount("Test", "psegovia04@gmail.com", "hello123", "225 Washington", "6179991108", "Tiles", 2, 0);
        Account acct2 = new ConsumerAccount("psegovia@bbns.org", "hello1234", "Mass", 1);

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