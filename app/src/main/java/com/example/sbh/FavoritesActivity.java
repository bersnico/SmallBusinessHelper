package com.example.sbh;

import android.os.Bundle;
import android.widget.ImageView;
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
    }

    public void updateDisplayResults() {

        if(1<= sortedFavorites.size()) {
            Account currentResult = sortedFavorites.get(0);
            ImageView pfp = findViewById(R.id.toolbarProfile);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp);
            addressDisp.setText(currentResult.getLocation());
//        TextView stars = findViewById(R.id.stars);
//        stars.setText(currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp);
            categoryDisp.setText(currentResult.getCategory());
        }

        if(2<= sortedFavorites.size()) {
            Account currentResult = sortedFavorites.get(1);
            ImageView pfp = findViewById(R.id.toolbarProfile3);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName3);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp3);
            addressDisp.setText(currentResult.getLocation());
//        TextView stars = findViewById(R.id.stars);
//        stars.setText(currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp3);
            categoryDisp.setText(currentResult.getCategory());
        }

        if(3<= sortedFavorites.size()) {
            Account currentResult = sortedFavorites.get(2);
            ImageView pfp = findViewById(R.id.toolbarProfile4);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName4);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp4);
            addressDisp.setText(currentResult.getLocation());
//        TextView stars = findViewById(R.id.stars);
//        stars.setText(currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp4);
            categoryDisp.setText(currentResult.getCategory());
        }

        if(4<= sortedFavorites.size()) {
            Account currentResult = sortedFavorites.get(3);
            ImageView pfp = findViewById(R.id.toolbarProfile2);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName2);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp2);
            addressDisp.setText(currentResult.getLocation());
//        TextView stars = findViewById(R.id.stars);
//        stars.setText(currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp2);
            categoryDisp.setText(currentResult.getCategory());
        }

        if(5<= sortedFavorites.size()) {
            Account currentResult = sortedFavorites.get(4);
            ImageView pfp = findViewById(R.id.toolbarProfile5);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName5);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp5);
            addressDisp.setText(currentResult.getLocation());
//        TextView stars = findViewById(R.id.stars);
//        stars.setText(currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp5);
            categoryDisp.setText(currentResult.getCategory());
        }


    }

}