package com.example.sbh;


public class BusinessAccount extends Account {

	protected String category, email, phoneNumber, businessName, priceRange;
	public BusinessAccount(String userName, String password, String location, String phoneNumber, String nameOfBusiness) {
		super(userName, password, location);
		this.businessName=nameOfBusiness;
		this.phoneNumber=phoneNumber;

	}

	public String getUserType () {
		return "business";
	}
	public String getCategory() {
		return category;
	}
	public void setPriceRange(String priceRange){
		this.priceRange=priceRange;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public String getEmail() {
		return email ;
	}
	public String getPhoneNumber(){return phoneNumber; }

}
