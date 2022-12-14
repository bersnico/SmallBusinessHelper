package com.example.sbh;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.media.Rating;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.*;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class BusinessAccountEditActivity extends AppCompatActivity {
    public static final int GET_FROM_GALLERY = 3;
    public static ArrayList<ImageView> images = new ArrayList<ImageView>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_account_edit);

        TextView cBName = findViewById(R.id.editBName);
        String currBName = LoginActivity.currentBAcc.getName();
        cBName.setText(currBName);

        TextView cPhone = findViewById(R.id.editCntct);
        String currPhone = LoginActivity.currentBAcc.getNumber();
        cPhone.setText(currPhone);

        TextView cPrice = findViewById(R.id.editprice);
        String currPrice = LoginActivity.currentBAcc.getPriceRange() + "";
        cPrice.setText(currPrice);

        TextView cCat = findViewById(R.id.editCat);
        String currCat = LoginActivity.currentBAcc.getCategory();
        cCat.setText(currCat);

        TextView cLoc = findViewById(R.id.editLoc);
        String currLoc = LoginActivity.currentBAcc.getLocation();
        cLoc.setText(currLoc);
        ImageView pfp = findViewById(R.id.imageView3);
        pfp.setImageDrawable(LoginActivity.currentBAcc.getPFPIMG());

        Button addImg = findViewById(R.id.addImagesBtn);
        addImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI), GET_FROM_GALLERY);
            }
        });

        Button apply = findViewById(R.id.ApplyBtn);
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String checkFill = "Enter Value";
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
                ImageView newPFP = findViewById(R.id.imageView3);
                Drawable newPFPDr = newPFP.getDrawable();
                if(checkFilled(newB, newNum, newLoc, newP, newCate)){
                    LoginActivity.currentBAcc.setBusinessName(newB);
                    LoginActivity.currentBAcc.setPhoneNumber(newNum);
                    LoginActivity.currentBAcc.setLocation(newLoc);
                    int nP = Integer.parseInt(newP);
                    LoginActivity.currentBAcc.setPriceRange(nP);
                    LoginActivity.currentBAcc.setCategory(newCate);
                    LoginActivity.currentBAcc.setPFP(newPFPDr);
                    Intent startIntent = new Intent(getApplicationContext(), BusinessAccountActivity.class);
                    startActivity(startIntent);
                }
                else{
                    if(newB.equals("")){
                        newBName.setText("");
                        newBName.setHint(checkFill);
                    }
                    if(newNum.equals("")){
                        newPhone.setText("");
                        newPhone.setHint(checkFill);
                    }
                    if(newLoc.equals("")){
                        newAddress.setText("");
                        newAddress.setHint(checkFill);
                    }
                    if(newP.equals("")){
                        newPrice.setText("");
                        newPrice.setHint(checkFill);
                    }
                    if(newCate.equals("")){
                        newCat.setText("");
                        newCat.setHint(checkFill);
                    }
                }
            }

        });
        Button cancel = findViewById(R.id.backBtn);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), BusinessAccountActivity.class);
                startActivity(startIntent);
            }
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        //Detects request codes
        if(requestCode==GET_FROM_GALLERY && resultCode == Activity.RESULT_OK) {
            Uri selectedImage = data.getData();
            Bitmap bitmap = null;
            try {
                Drawable draw = ImageDecoder.decodeDrawable(ImageDecoder.createSource(this.getContentResolver(), selectedImage));
                ImageView getImage = findViewById(R.id.imageView3);
                getImage.setImageDrawable(draw);
                LoginActivity.currentBAcc.setPFP(draw);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    public static boolean checkFilled(String newB, String newNum, String newLoc, String newP, String newCate) {
        return !newB.equals("") && !newNum.equals("") && !newLoc.equals("") && !newP.equals("") && !newCate.equals("");
    }

}