package com.example.sbh;


public class BusinessAccount extends Account{

	private String category, email, phoneNumber, businessName;
	private int priceRange;

	public BusinessAccount(String nameOfBusiness, String email, String password, String address, String phoneNumber, String category, int priceRange, int iD) {
		super(nameOfBusiness, password, address, iD);
		this.priceRange=priceRange;
		isBusiness = true;
		this.category=category;
		this.email=email;
		businessName=nameOfBusiness;
		this.phoneNumber=phoneNumber;

		String temp = phoneNumber.substring(0, 3);
		this.phoneNumber = "(" + temp + ")";
		temp = phoneNumber.substring(3, 6);
		this.phoneNumber = this.phoneNumber + " " + temp;
		temp = phoneNumber.substring(6);
		this.phoneNumber = this.phoneNumber + "-" + temp;
	}

	public String getName() {
		return businessName;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public void setBusinessName(String B){
		this.businessName=B;
	}

	public void setPhoneNumber(String nNumber){ phoneNumber = nNumber; }

	public void setPriceRange(int nPrice){ priceRange = nPrice; }

	public String getCategory() {
		return category;
	}

	public int getPriceRange() {
		return priceRange;
	}

	public String getNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}
}
