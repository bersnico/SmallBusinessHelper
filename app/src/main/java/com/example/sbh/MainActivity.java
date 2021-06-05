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
            BusinessAccount acct7 = new BusinessAccount("Metro", "ajinglejangle@gmail.com", "hello123", "35 JFK Drive, Sherborn", "6178773419", "Subs", 2);
            BusinessAccount acct5 = new BusinessAccount("SqueezeShack", "daniblobfish9@gmail.com", "hello123", "3 Isaac Sprague Dr, Hingham, MA", "7817498290", "Burgers", 2);
            ConsumerAccount acct3 = new ConsumerAccount("daniellercbrennan@gmail.com", "hello123", "1 Isaac Sprague Dr, Hingham, MA");
            BusinessAccount acct6 = new BusinessAccount("Checkers", "echin@bbns.org", "hello123", "10 Butler Dr, Hingham, MA", "4563747890", "Pizza", 3);
            BusinessAccount acct4 = new BusinessAccount("Filling Chicken", "nbers@bbns.org", "hello123", "34 Butler Dr, Hingham, MA", "4567987890", "Chicken", 3);
            BusinessAccount acct1 = new BusinessAccount("Bob's Burgers", "psegovia04@gmail.com", "hello123", "225 Washington st. ", "6179991108", "Burgers", 1);
            ConsumerAccount acct2 = new ConsumerAccount("psegovia@bbns.org", "hello123", "24 randolph road, MI");
//            acct2.setFav(acct5);
//            acct2.setFav(acct6);
//            acct2.setFav(acct4);
//            acct2.setFav(acct1);
//            acct2.setFav(acct7);

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