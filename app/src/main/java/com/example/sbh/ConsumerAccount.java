package com.example.sbh;

import java.util.ArrayList;

public class ConsumerAccount extends Account{

	private ArrayList<BusinessAccount> favs;
	private boolean isBusiness;

	public ConsumerAccount(String email, String password, String location, int iD) {
		super(email, password, location, iD);

		isBusiness = false;
	}
	public boolean getUserType(){
		return isBusiness;
	}
	public void setFav(BusinessAccount b) {
		favs.add(b);
	}

}
