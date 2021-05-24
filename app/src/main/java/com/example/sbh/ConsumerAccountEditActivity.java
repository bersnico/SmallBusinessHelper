package com.example.sbh;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.sbh.BusinessAccountEditActivity.checkFilled;

public class ConsumerAccountEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_account_edit);

        Button cancel = findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ConsumerAccountActivity.class);
                startActivity(startIntent);
            }
        });

        Button apply = findViewById(R.id.apply);
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText nPassword = findViewById(R.id.changePassword);
                String newPassword = nPassword.getText().toString();
                EditText nLocation = findViewById(R.id.changeLocation);
                String newLocation = nLocation.getText().toString();

                if(checkFilled(newPassword, newLocation)) {
                    LoginActivity.currentCAcc.setPassword(newPassword);
                    LoginActivity.currentCAcc.setLocation(newLocation);

                }
            }
        });


    }
    public static boolean checkFilled(String newP, String newL) {
        return !newP.equals("") && !newL.equals("");
    }
}