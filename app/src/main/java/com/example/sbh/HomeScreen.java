package com.example.sbh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button favB = findViewById(R.id.favButton);
        favB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goFavorites();
            }
        });

        Button mapB = findViewById(R.id.mapButton);
        mapB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMap();
            }
        });

        Button acctB = findViewById(R.id.acctButton);
        acctB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goProfile();
            }
        });
    }

    private void goProfile() {
        Intent startIntent = new Intent(getApplicationContext(), ConsumerAccountActivity.class);
        startActivity(startIntent);
    }

    private void goMap() {
        Intent startIntent = new Intent(getApplicationContext(), MapsActivity.class);
        startActivity(startIntent);
    }

    private void goFavorites() {
        Intent startIntent = new Intent(getApplicationContext(), FavoritesActivity.class);
        startActivity(startIntent);
    }
}