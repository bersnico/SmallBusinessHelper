package com.example.sbh;

import java.util.ArrayList;

public class Account {

	protected static ArrayList<Account> accounts;
	protected String userName, password, address;
	protected boolean isBusiness;

	public Account(String userName, String password, String address) {
		this.userName=userName;
		this.password=password;
		this.address=address;

		accounts = new ArrayList<Account>();
		accounts.add(this);
	}

	public boolean getUserType () {
		return isBusiness;
	}

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public String getLocation() {
		return address;

	}

}
