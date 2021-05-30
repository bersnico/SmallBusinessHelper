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

}