package com.example.sbh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        /*Uncomment when search works
        //result 1
        ImageView pfp = findViewById(R.id.toolbarProfile);
        pfp.setImageDrawable(LoginActivity.currentBAcc.getPFPIMG());
        TextView businessName = findViewById(R.id.BusinessName);
        businessName.setText(LoginActivity.currentBAcc.getName());
        TextView addressDisp = findViewById(R.id.addressDisp);
        addressDisp.setText(LoginActivity.currentBAcc.getLocation());
        TextView stars = findViewById(R.id.stars);
        stars.setText(R.string.numStars);
        TextView categoryDisp = findViewById(R.id.categoryDisp);
        categoryDisp.setText(LoginActivity.currentBAcc.getCategory());

        //result 2
        ImageView pfp2 = findViewById(R.id.toolbarProfile2);
        pfp2.setImageDrawable(LoginActivity.currentBAcc.getPFPIMG());
        TextView businessName2 = findViewById(R.id.BusinessName2);
        businessName2.setText(LoginActivity.currentBAcc.getName());
        TextView addressDisp2 = findViewById(R.id.addressDisp2);
        addressDisp2.setText(LoginActivity.currentBAcc.getLocation());
        TextView stars2 = findViewById(R.id.stars2);
        stars2.setText(R.string.numStars);
        TextView categoryDisp2 = findViewById(R.id.categoryDisp2);
        categoryDisp2.setText(LoginActivity.currentBAcc.getCategory());

        //result 3
        ImageView pfp3 = findViewById(R.id.toolbarProfile3);
        pfp3.setImageDrawable(LoginActivity.currentBAcc.getPFPIMG());
        TextView businessName3 = findViewById(R.id.BusinessName3);
        businessName3.setText(LoginActivity.currentBAcc.getName());
        TextView addressDisp3 = findViewById(R.id.addressDisp3);
        addressDisp3.setText(LoginActivity.currentBAcc.getLocation());
        TextView stars3 = findViewById(R.id.stars3);
        stars3.setText(R.string.numStars);
        TextView categoryDisp3 = findViewById(R.id.categoryDisp3);
        categoryDisp3.setText(LoginActivity.currentBAcc.getCategory());

        //result 4
        ImageView pfp4 = findViewById(R.id.toolbarProfile4);
        pfp4.setImageDrawable(LoginActivity.currentBAcc.getPFPIMG());
        TextView businessName4 = findViewById(R.id.BusinessName4);
        businessName4.setText(LoginActivity.currentBAcc.getName());
        TextView addressDisp4 = findViewById(R.id.addressDisp4);
        addressDisp4.setText(LoginActivity.currentBAcc.getLocation());
        TextView stars4 = findViewById(R.id.stars4);
        stars4.setText(R.string.numStars);
        TextView categoryDisp4 = findViewById(R.id.categoryDisp4);
        categoryDisp4.setText(LoginActivity.currentBAcc.getCategory());

        //result 5
        ImageView pfp5 = findViewById(R.id.toolbarProfile5);
        pfp5.setImageDrawable(LoginActivity.currentBAcc.getPFPIMG());
        TextView businessName5 = findViewById(R.id.BusinessName5);
        businessName5.setText(LoginActivity.currentBAcc.getName());
        TextView addressDisp5 = findViewById(R.id.addressDisp5);
        addressDisp5.setText(LoginActivity.currentBAcc.getLocation());
        TextView stars5 = findViewById(R.id.stars5);
        stars5.setText(R.string.numStars);
        TextView categoryDisp5 = findViewById(R.id.categoryDisp5);
        categoryDisp5.setText(LoginActivity.currentBAcc.getCategory());
        */
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