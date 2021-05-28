package com.example.sbh;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class ConsumerAccount extends Account {

	private ArrayList<BusinessAccount> favs;

	public ConsumerAccount(String email, String password, String location, int iD) {
		super(email, password, location, iD);
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
}
