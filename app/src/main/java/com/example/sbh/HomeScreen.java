package com.example.sbh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import android.widget.SearchView;
import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {
    public static ArrayList<BusinessAccount> sortedBySearch = new ArrayList<>();

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

        SearchView currSearch = findViewById(R.id.searchView);
        currSearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                updateSearches(query);
                updateDisplayResults();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                updateSearches(newText);
                updateDisplayResults();
                return false;
            }
        });





    }

    public void updateDisplayResults(){
        BusinessAccount currentResult;
        //result 1
        if(1<=sortedBySearch.size()) {
            currentResult = sortedBySearch.get(0);
            ImageView pfp = findViewById(R.id.toolbarProfile);
            pfp.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName = findViewById(R.id.BusinessName);
            businessName.setText(currentResult.getName());
            TextView addressDisp = findViewById(R.id.addressDisp);
            addressDisp.setText(currentResult.getLocation());
            RatingBar stars = findViewById(R.id.ratingBar);
            stars.setRating((float) currentResult.getRating());
            TextView categoryDisp = findViewById(R.id.categoryDisp);
            categoryDisp.setText(currentResult.getCategory());
            Button goToProfile1 = findViewById(R.id.pageBtn1);
            goToProfile1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoginActivity.currentBAcc=sortedBySearch.get(0);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessPageActivity.class);
                    startActivity(startIntent);
                }
            });
        }


        //result 2
        if(2<=sortedBySearch.size()) {
            currentResult = sortedBySearch.get(1);
            ImageView pfp2 = findViewById(R.id.toolbarProfile2);
            pfp2.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName2 = findViewById(R.id.BusinessName2);
            businessName2.setText(currentResult.getName());
            TextView addressDisp2 = findViewById(R.id.addressDisp2);
            addressDisp2.setText(currentResult.getLocation());
            RatingBar stars2 = findViewById(R.id.ratingBar2);
            stars2.setRating((float) currentResult.getRating());
            TextView categoryDisp2 = findViewById(R.id.categoryDisp2);
            categoryDisp2.setText(currentResult.getCategory());
            Button goToProfile2 = findViewById(R.id.pageBtn2);
            goToProfile2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoginActivity.currentBAcc=sortedBySearch.get(1);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessPageActivity.class);
                    startActivity(startIntent);
                }
            });
        }

        //result 3
        if(3<=sortedBySearch.size()) {
            currentResult = sortedBySearch.get(2);
            ImageView pfp3 = findViewById(R.id.toolbarProfile3);
            pfp3.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName3 = findViewById(R.id.BusinessName3);
            businessName3.setText(currentResult.getName());
            TextView addressDisp3 = findViewById(R.id.addressDisp3);
            addressDisp3.setText(currentResult.getLocation());
            RatingBar stars3 = findViewById(R.id.ratingBar3);
            stars3.setRating((float) currentResult.getRating());
            TextView categoryDisp3 = findViewById(R.id.categoryDisp3);
            categoryDisp3.setText(currentResult.getCategory());
            Button goToProfile3 = findViewById(R.id.pageBtn3);
            goToProfile3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoginActivity.currentBAcc=sortedBySearch.get(2);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessPageActivity.class);
                    startActivity(startIntent);
                }
            });
        }

        //result 4
        if(4<=sortedBySearch.size()) {
            currentResult = sortedBySearch.get(3);
            ImageView pfp4 = findViewById(R.id.toolbarProfile4);
            pfp4.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName4 = findViewById(R.id.BusinessName4);
            businessName4.setText(currentResult.getName());
            TextView addressDisp4 = findViewById(R.id.addressDisp4);
            addressDisp4.setText(currentResult.getLocation());
            RatingBar stars4 = findViewById(R.id.ratingBar4);
            stars4.setRating((float) currentResult.getRating());
            TextView categoryDisp4 = findViewById(R.id.categoryDisp4);
            categoryDisp4.setText(currentResult.getCategory());
            Button goToProfile4 = findViewById(R.id.pageBtn4);
            goToProfile4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoginActivity.currentBAcc=sortedBySearch.get(3);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessPageActivity.class);
                    startActivity(startIntent);
                }
            });
        }

        //result 5
        if(5<=sortedBySearch.size()) {

            currentResult = sortedBySearch.get(4);
            ImageView pfp5 = findViewById(R.id.toolbarProfile5);
            pfp5.setImageDrawable(currentResult.getPFPIMG());
            TextView businessName5 = findViewById(R.id.BusinessName5);
            businessName5.setText(currentResult.getName());
            TextView addressDisp5 = findViewById(R.id.addressDisp5);
            addressDisp5.setText(currentResult.getLocation());
            RatingBar stars5 = findViewById(R.id.ratingBar5);
            stars5.setRating((float) currentResult.getRating());
            TextView categoryDisp5 = findViewById(R.id.categoryDisp5);
            categoryDisp5.setText(currentResult.getCategory());
            Button goToProfile5 = findViewById(R.id.pageBtn5);
            goToProfile5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoginActivity.currentBAcc=sortedBySearch.get(4);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessPageActivity.class);
                    startActivity(startIntent);
                }
            });
        }
    }

    private static void updateSearches(String search){



        BusinessAccount current;
        BusinessAccount prev = BusinessAccount.businessAccounts.get(0);

        if(BusinessAccount.businessAccounts.size()!=1 || BusinessAccount.businessAccounts.size()!=0) {
            for (int i = 0; i < BusinessAccount.businessAccounts.size(); i++) {
                current = BusinessAccount.businessAccounts.get(i);

                if (distance(search, current.getName()) < distance(search, prev.getName())) {
                    sortedBySearch.add(i - 1, current);
                } else if (distance(search, current.getName()) >= distance(search, prev.getName())) {
                    sortedBySearch.add(current);
                }

                prev = current;
            }
        }

    }

    public static int distance(String a, String b) {
        if(a.length()==1){
            if(a.equalsIgnoreCase(b)) {
                return 0;
            }
            return Integer.MAX_VALUE;
        }
        else {
            if (a != null) {
                a = a.toLowerCase();
            }
            if (b != null) {
                b = b.toLowerCase();
            }
            // i == 0
            int[] costs = new int[b.length() + 1];
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