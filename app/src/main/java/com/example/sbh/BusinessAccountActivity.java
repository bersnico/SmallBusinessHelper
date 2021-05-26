package com.example.sbh;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class BusinessAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_account);

        TextView cBName = findViewById(R.id.textView6);
        String currBName = LoginActivity.currentBAcc.getName();
        cBName.setText(currBName);

        TextView cEmail = findViewById(R.id.textView7);
        String currEmail = LoginActivity.currentBAcc.getEmail();
        cEmail.setText(currEmail);

        //no favorite variable yet
//        TextView cFavorites = findViewById(R.id.textView6);
//        String currFav = LoginActivity.currentBAcc.get();
//        cFavorites.setText(currFav);

        TextView cPrice = findViewById(R.id.textView11);
        String currPrice = LoginActivity.currentBAcc.getPriceRange() + "";
        cBName.setText(currBName);

        TextView cCat = findViewById(R.id.textView12);
        String currCat = LoginActivity.currentBAcc.getCategory();
        cCat.setText(currCat);

        TextView cLoc = findViewById(R.id.textView15);
        String currLoc = LoginActivity.currentBAcc.getLocation();
        cLoc.setText(currLoc);

        Button edit = findViewById(R.id.edit);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), BusinessAccountEditActivity.class);
                startActivity(startIntent);
            }
        });
        Button logOut = findViewById(R.id.button2);
        logOut.setOnClickListener(new View.OnClickListener() {
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
                Intent startIntent = new Intent(getApplicationContext(), BusinessAccountEditActivity.class);
                startActivity(startIntent);
            }
        });
    }
}