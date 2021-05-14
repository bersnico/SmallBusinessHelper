package com.example.sbh;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SignUpActivity extends AppCompatActivity {
    private static int checkCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        CheckBox checkBox = findViewById(R.id.checkBox);
        EditText editTextPhone = findViewById(R.id.editTextPhone);
        EditText editTextPostalAddress = findViewById(R.id.editTextTextPostalAddress);
        EditText editTextBusinessName = findViewById(R.id.editTextBusinessName);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkCount++;
                if(checkCount%2==0){
                    editTextPhone.setVisibility(View.GONE);
                    editTextBusinessName.setVisibility(View.GONE);
                    editTextPostalAddress.setVisibility(View.GONE);
                }
                else{
                    editTextPhone.setVisibility(View.VISIBLE);
                    editTextBusinessName.setVisibility(View.VISIBLE);
                    editTextPostalAddress.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}