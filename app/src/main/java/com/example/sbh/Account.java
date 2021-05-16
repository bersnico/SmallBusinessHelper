package com.example.sbh;

import java.util.ArrayList;

public class Account {
	

	protected String userName, password, location;
	protected int priceRange;
	
	public Account(String userName, String password, String location) {
		this.userName=userName;
		this.password=password;
		this.location=location;
	}

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public String getLocation() {
		return location;
	}


}
