package com.example.sbh;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ConsumerAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_account);

        TextView cEmail = findViewById(R.id.textView7);
        String currEmail = LoginActivity.currentCAcc.getEmail();
        cEmail.setText(currEmail);

        TextView cLocal = findViewById(R.id.textView15);
        String currLocal = LoginActivity.currentCAcc.getLocation();
        cLocal.setText(currLocal);

        Button logOutBtn = findViewById(R.id.logout);
        logOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        });

        Button editBtn = findViewById(R.id.edit);
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ConsumerAccountEditActivity.class);
                startActivity(startIntent);
            }
        });

    }
}