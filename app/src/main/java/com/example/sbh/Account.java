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
		accounts = new ArrayList<Account>();
		accounts.add(this);
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
