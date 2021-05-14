package com.example.sbh;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        CheckBox checkBox = findViewById(R.id.checkBox);
        if(checkBox.isChecked()){
            EditText editTextPhone = findViewById(R.id.editTextPhone);
            EditText editTextPostalAddress = findViewById(R.id.editTextTextPostalAddress);
            EditText editTextBusinessName = findViewById(R.id.editTextBusinessName);
            editTextPhone.setVisibility(View.VISIBLE);
            editTextBusinessName.setVisibility(View.VISIBLE);
            editTextPostalAddress.setVisibility(View.VISIBLE);
        }
    }
}