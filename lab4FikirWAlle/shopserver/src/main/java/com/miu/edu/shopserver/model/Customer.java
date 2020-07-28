package com.miu.edu.shopserver.model;


public class Customer {
    private int customerNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Address address;
    private CreditCard creditCard;
	public Customer(int customerNumber, String firstName, String lastName, String email, String phoneNumber,
			Address address, CreditCard creditCard) {
		
		this.customerNumber = customerNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.creditCard = creditCard;
	}
	public Customer() {
		
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + ", creditCard="
				+ creditCard + "]";
	}
    
    
    

}
