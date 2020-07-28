package com.miu.edu.shopserver.model;

import org.springframework.data.annotation.Id;

public class Order {
    @Id
    private Integer orderId;
    private ShoppingCart shoppingCart;
    private Address billing;
    private Address shipping;
    private CreditCard creditCard;
	public Order(Integer orderId, ShoppingCart shoppingCart, Address billing, Address shipping, CreditCard creditCard) {
		
		this.orderId = orderId;
		this.shoppingCart = shoppingCart;
		this.billing = billing;
		this.shipping = shipping;
		this.creditCard = creditCard;
	}
	public Order() {
	
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public Address getBilling() {
		return billing;
	}
	public void setBilling(Address billing) {
		this.billing = billing;
	}
	public Address getShipping() {
		return shipping;
	}
	public void setShipping(Address shipping) {
		this.shipping = shipping;
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", shoppingCart=" + shoppingCart + ", billing=" + billing + ", shipping="
				+ shipping + ", creditCard=" + creditCard + "]";
	}
    
    
    

}
