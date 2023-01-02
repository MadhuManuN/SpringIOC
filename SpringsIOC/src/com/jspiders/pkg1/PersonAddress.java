package com.jspiders.pkg1;

public class PersonAddress {
	private String city;
	private int pincode;
	public PersonAddress(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "PersonAddress is: city:"+city+" and pincode : "+pincode;
	}
	
	
}
