package com.miu.edu.shopserver.model;


public class Address {
    private String state;
    private String street;
    private String zipCode;
	public Address(String state, String street, String zipCode) {
		
		this.state = state;
		this.street = street;
		this.zipCode = zipCode;
	}
	public Address() {
		
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", street=" + street + ", zipCode=" + zipCode + "]";
	}
    
    

}
