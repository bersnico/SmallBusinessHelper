package com.example.sbh;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public abstract class Account {

	public static ArrayList<Account> accounts = new ArrayList<Account>();
	public static int idNum = 0;
	protected String email, password, address;
	protected boolean isBusiness;

	public Account(String email, String password, String address) {
		this.email=email;
		this.password=password;
		this.address=address;
		idNum ++;
		accounts.add(this);
		if(accounts.size()>1){
			insertionSort();
		}
	}

	public void insertionSort(){
		// Java program for implementation of Insertion Sort
		for (int j = 1; j < accounts.size(); j++) {
			Account current = accounts.get(j);
			int i = j-1;
			while ((i > -1) && ((accounts.get(i).getEmail().compareTo(current.getEmail())) > 0)) {
				accounts.set(i+1, accounts.get(i));
				i--;
			}
			accounts.set(i+1, current);
		}
	}

	public boolean getUserType(){
		return isBusiness;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getLocation() {
		return address;
	}

	public void setLocation(String nAddress){ address = nAddress; }

	public abstract Drawable getPFPIMG();

	public abstract double getRating();

	public abstract String getCategory ();

	public void setPassword(String nPassword){ password = nPassword; }

	public abstract String getName();

	public int getId() {
		return idNum;
	}
}
