package com.example.sbh;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class BusinessAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_account);

        RatingBar ratingBar2 = findViewById(R.id.ratingBar2);
//        ratingBar2.setRating((float) LoginActivity.currentBAcc.getRating());
//        ratingBar2.setIsIndicator(true);

        TextView cBName = findViewById(R.id.textView6);
        String currBName = LoginActivity.currentBAcc.getName();
        cBName.setText(currBName);

        TextView cPhone = findViewById(R.id.textView7);
        String currPhone = LoginActivity.currentBAcc.getNumber();
        cPhone.setText(currPhone);

        TextView cFavorites = findViewById(R.id.textView13);
        int currFav = LoginActivity.currentBAcc.getNumFavorites();
        cFavorites.setText(String.valueOf(currFav));

        TextView cPrice = findViewById(R.id.textView16);
        int currPrice = LoginActivity.currentBAcc.getPriceRange();
        String cPriceR ="";
        if(currPrice==1){
            cPriceR="$";
        }
        if(currPrice==2){
            cPriceR="$$";
        }
        if(currPrice==3){
            cPriceR="$$$";
        }
        if(currPrice>3){
            cPriceR="$$$$";
        }
        cPrice.setText(cPriceR);

        TextView cCat = findViewById(R.id.textView12);
        String currCat = LoginActivity.currentBAcc.getCategory();
        cCat.setText(currCat);

        TextView cLoc = findViewById(R.id.textView15);
        String currLoc = LoginActivity.currentBAcc.getLocation();
        cLoc.setText(currLoc);

        ImageView currPFP = findViewById(R.id.imageView);
        Drawable currPFPDr = LoginActivity.currentBAcc.getPFPIMG();
        currPFP.setImageDrawable(currPFPDr);

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
    }
}