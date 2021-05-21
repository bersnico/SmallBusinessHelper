package com.example.sbh;

import java.util.ArrayList;

public class Account {

	protected static ArrayList<Account> accounts;
	protected int idNum;
	protected String email, password, address;
	protected boolean isBusiness;

	public Account(String email, String password, String address, int idNum) {
		this.email=email;
		this.password=password;
		this.address=address;
		this.idNum = idNum;
		accounts = new ArrayList<>();
		accounts.add(this);
		insertionSort();
	}

	public void insertionSort(){
		// Java program for implementation of Insertion Sort
		for (int j = 1; j < accounts.size(); j++) {
			Account current = accounts.get(j);
			int i = j-1;
			while ((i > -1) && ((accounts.get(i).getEmail().compareTo(current.getEmail())) == 1)) {
				accounts.set(i+1, accounts.get(i));
				i--;
			}
			accounts.set(i+1, current);
		}
	}



	public boolean getUserType () {
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

}
