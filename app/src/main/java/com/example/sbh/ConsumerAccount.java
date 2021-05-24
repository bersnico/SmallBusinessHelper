package com.example.sbh;

import java.util.ArrayList;

public class ConsumerAccount extends Account{

	private ArrayList<BusinessAccount> favs;


	public ConsumerAccount(String email, String password, String location, int iD) {
		super(email, password, location, iD);

		isBusiness = false;
	}

	public void setFav(BusinessAccount b) {
		favs.add(b);
	}

}
