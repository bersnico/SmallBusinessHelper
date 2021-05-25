package com.example.sbh;

import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class BusinessAccountEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_account_edit);


        Button apply = findViewById(R.id.ApplyBtn);
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText newBName =findViewById(R.id.editBName);
                String newB = newBName.getText().toString();
                EditText newPhone = findViewById(R.id.editCntct);
                String newNum = newPhone.getText().toString();
                EditText newAddress = findViewById(R.id.editLoc);
                String newLoc = newAddress.getText().toString();
                EditText newPrice = findViewById(R.id.editprice);
                String newP = newPrice.getText().toString();
                EditText newCat = findViewById(R.id.editCat);
                String newCate =newCat.getText().toString();
                if(checkFilled(newB, newNum, newLoc, newP, newCate)){
//                    LoginActivity.currentBAcc.setBusinessName(newB);
//                    LoginActivity.currentBAcc.setPhoneNumber(newNum);
//                    LoginActivity.currentBAcc.setLocation(newLoc);
//                    int nP = Integer.parseInt(newP);
//                    LoginActivity.currentBAcc.setPriceRange(nP);
//                    LoginActivity.currentBAcc.setCategory(newCate);
                }
            }
        });
    }

    public static boolean checkFilled(String newB, String newNum, String newLoc, String newP, String newCate) {
        return !newB.equals("") && !newNum.equals("") && !newLoc.equals("") && !newP.equals("") && !newCate.equals("");
    }
}