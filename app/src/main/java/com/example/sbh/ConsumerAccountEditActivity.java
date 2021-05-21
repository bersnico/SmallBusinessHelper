package com.example.sbh;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

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
                Intent startIntent = new Intent(getApplicationContext(), ConsumerAccountActivity.class);
                startActivity(startIntent);
            }
        });

        EditText changeName = findViewById(R.id.changeName);
        String newName = changeName.getText().toString();
        EditText changePassword = findViewById(R.id.changePassword);
        String newPassword = changePassword.getText().toString();
        EditText changeLocation = findViewById(R.id.changeLocation);
        String newLocation = changeLocation.getText().toString();








    }
}