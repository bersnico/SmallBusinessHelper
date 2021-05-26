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