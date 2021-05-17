package com.example.sbh;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {
    private static int checkCount = 0;
    public static int idCounter = 0;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        CheckBox checkBox = findViewById(R.id.checkBox);
        EditText editTextPhone = findViewById(R.id.editTextPhone);
        EditText editTextPostalAddress = findViewById(R.id.editTextTextPostalAddress);
        EditText editTextBusinessName = findViewById(R.id.editTextBusinessName2);
        EditText cat = findViewById(R.id.editTextCategory);
        EditText price = findViewById(R.id.editTextPriceRange);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkCount++;
                if(checkCount%2==0){
                    editTextPhone.setVisibility(View.GONE);
                    editTextBusinessName.setVisibility(View.GONE);
                    editTextPostalAddress.setVisibility(View.GONE);
                    cat.setVisibility(View.GONE);
                    price.setVisibility(View.GONE);
                }
                else{
                    editTextPhone.setVisibility(View.VISIBLE);
                    editTextBusinessName.setVisibility(View.VISIBLE);
                    editTextPostalAddress.setVisibility(View.VISIBLE);
                    cat.setVisibility(View.VISIBLE);
                    price.setVisibility(View.VISIBLE);
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
                for (int i=0; i<accounts.size(); i++){
                    if (accounts.get(i).getEmail().equals(email))
                        emailText.setHint("This email is already registered.");
                }
                if(initPword.equals(reentered) && initPword.length()>7) {
                    if (checkBox.isChecked()) {
                        EditText phone = findViewById(R.id.editTextPhone);
                        String phoneNum = phone.getText().toString();
                        EditText business = findViewById(R.id.editTextCategory);
                        String nameOfBusi = business.getText().toString();
                        EditText cat = findViewById(R.id.editTextCategory);
                        String category = cat.getText().toString();
                        EditText price = findViewById(R.id.editTextPriceRange);
                        int priceRange = Integer.parseInt(price.getText().toString());
                        accounts.add(new BusinessAccount(nameOfBusi, email, initPword, address, phoneNum, category, priceRange, idCounter));
                        idCounter++;
                        Intent startIntent = new Intent(getApplicationContext(), HomeScreen.class);
                        startActivity(startIntent);
                    }
                    else {
                        accounts.add(new ConsumerAccount(email, initPword, address, idCounter));
                        idCounter++;
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