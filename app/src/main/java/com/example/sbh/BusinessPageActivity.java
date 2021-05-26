package com.example.sbh;

import android.widget.RatingBar;
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
    }
}