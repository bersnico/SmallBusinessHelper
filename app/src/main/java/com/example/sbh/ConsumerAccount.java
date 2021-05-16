package com.example.sbh;


public class ConsumerAccount extends Account {


	public ConsumerAccount(String userName, String password, String location) {
		super(userName, password, location);
	}

	public String getUserType () {
		return "consumer";
	}
}
