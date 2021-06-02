package com.example.sbh;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class ConsumerAccount extends Account {

	private ArrayList<BusinessAccount> favs = new ArrayList<BusinessAccount>();

	public ConsumerAccount(String email, String password, String location) {
		super(email, password, location);
		isBusiness = false;
	}

	public void setFav(BusinessAccount b) {
		favs.add(b);
	}

	public Drawable getPFPIMG() {
		return null;
	}

	@Override
	public double getRating() {
		return -1;
	}

	public String getCategory() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	public ArrayList<BusinessAccount> getFavs(){return favs;}
}
