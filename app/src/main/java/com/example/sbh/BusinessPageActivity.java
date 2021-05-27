package com.example.sbh;

import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class BusinessPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_page);
        RatingBar ratingBar = findViewById(R.id.ratingBar2);
        ratingBar.setStepSize(.25F);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                double newRate =  ratingBar.getRating();
                LoginActivity.currentBAcc.addRating(newRate);
            }
        });

        TextView cBName = findViewById(R.id.textView5);
        String currBName = LoginActivity.currentBAcc.getName();
        cBName.setText(currBName);

        TextView cPhone = findViewById(R.id.textView8);
        String currPhone = LoginActivity.currentBAcc.getNumber();
        cPhone.setText(currPhone);

        TextView cEmail = findViewById(R.id.textView7);
        String currEmail = LoginActivity.currentBAcc.getEmail();
        cEmail.setText(currEmail);

        TextView cFavorites = findViewById(R.id.textView14);
        int currFav = LoginActivity.currentBAcc.getNumFavorites();
        cFavorites.setText(currFav);

        TextView cPrice = findViewById(R.id.textView11);
        String currPrice = LoginActivity.currentBAcc.getPriceRange() + "";
        cBName.setText(currBName);

        TextView cCat = findViewById(R.id.textView12);
        String currCat = LoginActivity.currentBAcc.getCategory();
        cCat.setText(currCat);

        TextView cLoc = findViewById(R.id.textView15);
        String currLoc = LoginActivity.currentBAcc.getLocation();
        cLoc.setText(currLoc);

        CheckBox checkBox = findViewById(R.id.checkFavorite);
        if(checkBox.isChecked()){
            LoginActivity.currentBAcc.incrementNumFavorites(1);
        }
    }
}