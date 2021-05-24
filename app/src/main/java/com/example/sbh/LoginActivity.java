package com.example.sbh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    //haven't figured out what the current account is yet, will know after login so this info can be used to access correct data for other pages that succeed the login.
    public static BusinessAccount currentBAcc = null;
    public static ConsumerAccount currentCAcc = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                //create reference variable for the email at this instance state
                String email = ((EditText) findViewById(R.id.editTextTextEmailAddress)).getText().toString();
                //do the same for the entered password
                String password = ((EditText) findViewById(R.id.editTextTextPassword)).getText().toString();

                if(loginPermitted(email, password)){
                    Intent startIntent = new Intent(getApplicationContext(), HomeScreen.class);
                    startActivity(startIntent);
                }
            }

            public boolean loginPermitted(String email, String password){

                Account currentAcc = Account.accounts.get(binarySearchAccountsString(email, 0, Account.accounts.size()-1));
                if(currentAcc.getUserType()){
                    currentBAcc = (BusinessAccount) currentAcc;
                }
                else{
                    currentCAcc = (ConsumerAccount) currentAcc;
                }
                //if email is found and password is correct, permit login, otherwise do not.
                return binarySearchAccountsString(email, 0, Account.accounts.size() - 1) > -1 && (currentAcc.getPassword().equals(password));
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


        });


    }
}