package com.example.sbh;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {
    private static int checkCount = 0;
    public static int idCounter = 0;
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
                TextView error = findViewById(R.id.checkAll);
                error.setVisibility(View.GONE);

                EditText emailText = findViewById(R.id.editTextTextEmailAddress);
                String email = emailText.getText().toString();
                EditText origPword = findViewById(R.id.editTextTextPassword);
                String initPword = origPword.getText().toString();
                EditText doubleCheck = findViewById(R.id.editTextTextPassword2);
                String reentered = doubleCheck.getText().toString();
                EditText loc = findViewById(R.id.editTextTextPostalAddress);
                String town = loc.getText().toString();

                if(email.equals("") || initPword.equals("") || reentered.equals("") || town.equals("")){

                    error = findViewById(R.id.checkAll);
                    error.setVisibility(View.VISIBLE);

                }

                boolean emailExists = false;
                if (binarySearchAccountsString(email, 0, Account.accounts.size() - 1) > -1)
                    emailExists = true;

                if(initPword.equals(reentered) && initPword.length()>7 && !email.equals("") && !town.equals("") && !emailExists) {
                    if (checkBox.isChecked()) {
                        EditText phone = findViewById(R.id.editTextPhone);
                        String phoneNum = phone.getText().toString();
                        EditText business = findViewById(R.id.editTextBusinessName2);
                        String nameOfBusi = business.getText().toString();
                        EditText cat = findViewById(R.id.editTextCategory);
                        String category = cat.getText().toString();
                        EditText price = findViewById(R.id.editTextPriceRange);
                        String priceRange = price.getText().toString();

                        if(!nameOfBusi.equals("") && !category.equals("") && !priceRange.equals("") && !phoneNum.equals("") && phoneNum.length() == 9){

                            int priceRangeInt = Integer.parseInt(price.getText().toString());

                            if (priceRangeInt > 0 && priceRangeInt < 5) {
                                LoginActivity.currentBAcc = new BusinessAccount(nameOfBusi, email, initPword, town, phoneNum, category, priceRangeInt, idCounter);
                                idCounter++;

                                Intent startIntent = new Intent(getApplicationContext(), BusinessAccountActivity.class);
                                startActivity(startIntent);
                            } else {
                                price.setText("");
                                price.setHint("Enter number between 1-4 (inclusive)");
                            }
                        } else {

                            if (!(phoneNum.length() == 9)){
                                phone.setText("");
                                phone.setHint("Enter valid phone number (9 numbers)");
                            }

                            if (!nameOfBusi.equals("") || !category.equals("") || !priceRange.equals("") || !phoneNum.equals("")) {
                                error = findViewById(R.id.checkAll);
                                error.setVisibility(View.VISIBLE);
                            }
                        }

                    }
                    else {
                        LoginActivity.currentCAcc = new ConsumerAccount(email, initPword, town, idCounter);
                        idCounter++;
                        Intent startIntent = new Intent(getApplicationContext(), HomeScreen.class);
                        startActivity(startIntent);
                    }
                }
                else{

                    if(emailExists){
                        emailText.setText("");
                        emailText.setHint("This email is already in use.");
                    }

                    if(initPword.length()<8){
                        doubleCheck.setText("");
                        doubleCheck.setHint(R.string.minChars);
                    }
                    else if (!initPword.equals(reentered)){
                        doubleCheck.setText("");
                        doubleCheck.setHint(R.string.noMatch);
                    }
                }
            }
        });


    }

    public int binarySearchAccountsString(String email, int l, int r){

        if (r >= l)
        {
            int mid = l + (r - l) / 2;

            if (Account.accounts.get(mid).getEmail().compareTo(email) == 0)
                return mid;

            if (Account.accounts.get(mid).getEmail().compareTo(email) > 0)
                return binarySearchAccountsString(email, l, mid - 1);

            return binarySearchAccountsString(email, mid + 1, r);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

}
//    public static boolean isValidEmail(CharSequence target) {
//        boolean isValid = target != null && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
//        return isValid;
//    }
