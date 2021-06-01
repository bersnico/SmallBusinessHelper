package com.example.sbh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class HomeScreen extends AppCompatActivity {
    public static ArrayList<Account> sortedBySearch = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        SearchView currSearch = findViewById(R.id.searchView);
        currSearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                updateSearches(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                updateSearches(newText);
                return false;
            }
        });

        updateDisplayResults();



    }

    public void updateDisplayResults(){
        //result 1
        Account currentResult = sortedBySearch.get(0);
        ImageView pfp = findViewById(R.id.toolbarProfile);
        pfp.setImageDrawable(currentResult.getPFPIMG());
        TextView businessName = findViewById(R.id.BusinessName);
        businessName.setText(currentResult.getName());
        TextView addressDisp = findViewById(R.id.addressDisp);
        addressDisp.setText(currentResult.getLocation());
        TextView stars = findViewById(R.id.stars);
        stars.setText(String.valueOf(currentResult.getRating()));
        TextView categoryDisp = findViewById(R.id.categoryDisp);
        categoryDisp.setText(currentResult.getCategory());


        //result 2
        currentResult = sortedBySearch.get(1);
        ImageView pfp2 = findViewById(R.id.toolbarProfile2);
        pfp2.setImageDrawable(currentResult.getPFPIMG());
        TextView businessName2 = findViewById(R.id.BusinessName2);
        businessName2.setText(currentResult.getName());
        TextView addressDisp2 = findViewById(R.id.addressDisp2);
        addressDisp2.setText(currentResult.getLocation());
        TextView stars2 = findViewById(R.id.stars2);
        stars2.setText(String.valueOf(currentResult.getRating()));
        TextView categoryDisp2 = findViewById(R.id.categoryDisp2);
        categoryDisp2.setText(currentResult.getCategory());

        //result 3
        currentResult = sortedBySearch.get(2);
        ImageView pfp3 = findViewById(R.id.toolbarProfile3);
        pfp3.setImageDrawable(currentResult.getPFPIMG());
        TextView businessName3 = findViewById(R.id.BusinessName3);
        businessName3.setText(currentResult.getName());
        TextView addressDisp3 = findViewById(R.id.addressDisp3);
        addressDisp3.setText(currentResult.getLocation());
        TextView stars3 = findViewById(R.id.stars3);
        stars3.setText(String.valueOf(currentResult.getRating()));
        TextView categoryDisp3 = findViewById(R.id.categoryDisp3);
        categoryDisp3.setText(currentResult.getCategory());

        //result 4
        currentResult = sortedBySearch.get(3);
        ImageView pfp4 = findViewById(R.id.toolbarProfile4);
        pfp4.setImageDrawable(currentResult.getPFPIMG());
        TextView businessName4 = findViewById(R.id.BusinessName4);
        businessName4.setText(currentResult.getName());
        TextView addressDisp4 = findViewById(R.id.addressDisp4);
        addressDisp4.setText(currentResult.getLocation());
        TextView stars4 = findViewById(R.id.stars4);
        stars4.setText(String.valueOf(currentResult.getRating()));
        TextView categoryDisp4 = findViewById(R.id.categoryDisp4);
        categoryDisp4.setText(currentResult.getCategory());

        //result 5
        currentResult = sortedBySearch.get(5);
        ImageView pfp5 = findViewById(R.id.toolbarProfile5);
        pfp5.setImageDrawable(currentResult.getPFPIMG());
        TextView businessName5 = findViewById(R.id.BusinessName5);
        businessName5.setText(currentResult.getName());
        TextView addressDisp5 = findViewById(R.id.addressDisp5);
        addressDisp5.setText(currentResult.getLocation());
        TextView stars5 = findViewById(R.id.stars5);
        stars5.setText(String.valueOf(currentResult.getRating()));
        TextView categoryDisp5 = findViewById(R.id.categoryDisp5);
        categoryDisp5.setText(currentResult.getCategory());
    }

    private static ArrayList<Account> updateSearches(String search){

        Account current;
        Account prev = Account.accounts.get(0);

        for(int i = 0; i<Account.accounts.size(); i++) {
            current = Account.accounts.get(i);

            if(distance(search, current.getName())<distance(search, prev.getName())) {
                sortedBySearch.add(i-1, current);
            }
            else if(distance(search, current.getName())>=distance(search, prev.getName())){
                sortedBySearch.add(current);
            }

            prev=current;
        }

        return sortedBySearch;
    }

    public static int distance(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        // i == 0
        int [] costs = new int [b.length() + 1];
        for (int j = 0; j < costs.length; j++)
            costs[j] = j;
        for (int i = 1; i <= a.length(); i++) {
            // j == 0; nw = lev(i - 1, j)
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= b.length(); j++) {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }
        return costs[b.length()];
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