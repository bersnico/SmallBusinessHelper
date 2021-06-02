package com.example.sbh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    public static ArrayList<BusinessAccount> sortedFavorites = LoginActivity.currentCAcc.getFavs();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        updateDisplayResults();

        Button returnHome = findViewById(R.id.button5);
        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), HomeScreen.class);
                startActivity(startIntent);
            }
        });
    }

    public void updateDisplayResults() {

        if(1<= sortedFavorites.size()){
            Account currentResult = sortedFavorites.get(0);
            ImageView pfp = findViewById(R.id.toolbarProfile1);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName1);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp1);
            addressDisp.setText(currentResult.getLocation());
            RatingBar stars = findViewById(R.id.ratingBar1);
            stars.setRating((float) currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp1);
            categoryDisp.setText(currentResult.getCategory());
            Button goToProfile1 = findViewById(R.id.pageBtn1);
            goToProfile1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoginActivity.currentBAcc=sortedFavorites.get(0);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessPageActivity.class);
                    startActivity(startIntent);
                }
            });
        }

        if(2<= sortedFavorites.size()){
            Account currentResult = sortedFavorites.get(1);
            ImageView pfp = findViewById(R.id.toolbarProfile2);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName2);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp2);
            addressDisp.setText(currentResult.getLocation());
            RatingBar stars = findViewById(R.id.ratingBar2);
            stars.setRating((float) currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp2);
            categoryDisp.setText(currentResult.getCategory());
            Button goToProfile1 = findViewById(R.id.pageBtn2);
            goToProfile1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoginActivity.currentBAcc=sortedFavorites.get(1);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessPageActivity.class);
                    startActivity(startIntent);
                }
            });
        }

        if(3<= sortedFavorites.size()){
            Account currentResult = sortedFavorites.get(2);
            ImageView pfp = findViewById(R.id.toolbarProfile3);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName3);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp3);
            addressDisp.setText(currentResult.getLocation());
            RatingBar stars = findViewById(R.id.ratingBar3);
            stars.setRating((float) currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp3);
            categoryDisp.setText(currentResult.getCategory());
            Button goToProfile1 = findViewById(R.id.pageBtn3);
            goToProfile1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoginActivity.currentBAcc=sortedFavorites.get(2);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessPageActivity.class);
                    startActivity(startIntent);
                }
            });
        }

        if(4<= sortedFavorites.size()){
            Account currentResult = sortedFavorites.get(3);
            ImageView pfp = findViewById(R.id.toolbarProfile4);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName4);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp4);
            addressDisp.setText(currentResult.getLocation());
            RatingBar stars = findViewById(R.id.ratingBar4);
            stars.setRating((float) currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp4);
            categoryDisp.setText(currentResult.getCategory());
            Button goToProfile1 = findViewById(R.id.pageBtn4);
            goToProfile1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoginActivity.currentBAcc=sortedFavorites.get(3);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessPageActivity.class);
                    startActivity(startIntent);
                }
            });
        }

        if(5<= sortedFavorites.size()){
            Account currentResult = sortedFavorites.get(4);
            ImageView pfp = findViewById(R.id.toolbarProfile5);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName5);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp5);
            addressDisp.setText(currentResult.getLocation());
            RatingBar stars = findViewById(R.id.ratingBar5);
            stars.setRating((float) currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp5);
            categoryDisp.setText(currentResult.getCategory());
            Button goToProfile1 = findViewById(R.id.pageBtn5);
            goToProfile1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoginActivity.currentBAcc=sortedFavorites.get(4);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessPageActivity.class);
                    startActivity(startIntent);
                }
            });
        }

    }

}