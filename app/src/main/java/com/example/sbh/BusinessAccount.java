package com.example.sbh;


import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class BusinessAccount extends Account{
	public static ArrayList<BusinessAccount> businessAccounts = new ArrayList<BusinessAccount>();
	private String category;
	private final String email;
	private String phoneNumber;
	private String businessName;
	private int priceRange, numFavorites;
	private ArrayList<Double> ratings;
	private double rating;
	private Drawable pFPIMG;

	public BusinessAccount(String nameOfBusiness, String email, String password, String address, String phoneNumber, String category, int priceRange) {
		super(email, password, address);
		this.priceRange=priceRange;
		isBusiness = true;
		this.category=category;
		this.email=email;
		businessName=nameOfBusiness;
		this.phoneNumber=phoneNumber;

		String temp = phoneNumber.substring(0, 3);
		this.phoneNumber = "(" + temp + ")";
		temp = phoneNumber.substring(3, 6);
		this.phoneNumber = this.phoneNumber + " " + temp;
		temp = phoneNumber.substring(6);
		this.phoneNumber = this.phoneNumber + "-" + temp;
		rating = 0;
		ratings = new ArrayList<Double>();
		numFavorites=0;
		businessAccounts.add(this);
	}

	public String getName() {
		return businessName;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public void setBusinessName(String B){
		this.businessName=B;
	}

	public void setPhoneNumber(String nNumber){ phoneNumber = nNumber; }

	public void setPriceRange(int nPrice){ priceRange = nPrice; }

	public String getCategory() {
		return category;
	}

	public int getPriceRange() {
		return priceRange;
	}

	public String getNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setPFP(Drawable pFPImg){
		this.pFPIMG = pFPImg;
	}

	public Drawable getPFPIMG(){
		return pFPIMG;
	}

	public double getRating() {
		rating = 0;
		for (double rate:ratings) {
			rating+=rate;
		}
		rating/=ratings.size();
		return rating;
	}

	public void addRating(double num){
		ratings.add(num);
	}

	public int getNumFavorites() {
		return numFavorites;
	}

	public void incrementNumFavorites(int num){
		numFavorites++;
	}
}
