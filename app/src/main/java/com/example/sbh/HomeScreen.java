package com.example.sbh;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        TabItem home = findViewById(R.id.home);
        TabItem favs = findViewById(R.id.favs);
        TabItem profile = findViewById(R.id.profile);
        TabItem maps = findViewById(R.id.map);
        TabLayout tabs = findViewById(R.id.tabLayout);
        int pos = tabs.getSelectedTabPosition();
        switch (pos){
            case 0: goHome();
            break;

            case 1: goFavorites();
            break;

            case 2: goMap();
            break;

            case 3: goProfile();
            break;
        }
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

    private void goHome() {
        Intent startIntent = new Intent(getApplicationContext(), HomeScreen.class);
        startActivity(startIntent);
    }
}