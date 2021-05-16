package com.example.sbh;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {
    private static int checkCount = 0;
    private ArrayList<Account> accounts = new ArrayList<Account>();
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
        Button signUpButton = findViewById(R.id.signUpButton);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText emailText = findViewById(R.id.editTextTextEmailAddress);
                String email = emailText.getText().toString();
                EditText origPword = findViewById(R.id.editTextTextPassword);
                String initPword = origPword.getText().toString();
                EditText doubleCheck = findViewById(R.id.editTextTextPassword2);
                String reentered = doubleCheck.getText().toString();
                EditText loc = findViewById(R.id.editTextTextPostalAddress);
                String address = loc.getText().toString();
                if(initPword.equals(reentered) && initPword.length()>7) {
                    if (checkBox.isChecked()) {
                        EditText phone = findViewById(R.id.editTextPhone);
                        String phoneNum = phone.getText().toString();
                        EditText business = findViewById(R.id.editTextBusinessName);
                        String nameOfBusi = business.getText().toString();
                        accounts.add(new BusinessAccount(email, initPword, address, phoneNum, nameOfBusi));
                        Intent startIntent = new Intent(getApplicationContext(), HomeScreen.class);
                        startActivity(startIntent);
                    }
                    else {
                        accounts.add(new ConsumerAccount(email, initPword, address));
                        Intent startIntent = new Intent(getApplicationContext(), HomeScreen.class);
                        startActivity(startIntent);
                    }
                }
                else{
                    doubleCheck.setText("");
                    if(initPword.length()<8){
                        doubleCheck.setHint(R.string.minChars);
                    }
                    else {
                        doubleCheck.setHint(R.string.noMatch);
                    }
                }
            }
        });
    }
}