package com.example.sbh;

import java.util.ArrayList;

public class ConsumerAccount extends Account{

	private ArrayList<BusinessAccount> favs;

	public ConsumerAccount(String userName, String password, String location) {
		super(userName, password, location);
		isBusiness = false;
	}

	public void setFav(BusinessAccount b) {
		favs.add(b);
	}

}
