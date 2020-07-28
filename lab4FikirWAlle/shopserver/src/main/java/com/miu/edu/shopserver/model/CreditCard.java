package com.miu.edu.shopserver.model;

public class CreditCard {
    private int creditCardNumber;
    private String provider;
	public CreditCard(int creditCardNumber, String provider) {
		
		this.creditCardNumber = creditCardNumber;
		this.provider = provider;
	}
	public CreditCard() {
	
	}
	public int getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	@Override
	public String toString() {
		return "CreditCard [creditCardNumber=" + creditCardNumber + ", provider=" + provider + "]";
	}
    
    
    
}
