package com.miu.edu.shopserver.model;

import java.util.List;

public class Account {
    private String username;
    private String password;
    private Customer customer;
    private ShoppingCart shoppingCart;
    private List<Order> orderList;
	public Account(String username, String password, Customer customer, ShoppingCart shoppingCart,
			List<Order> orderList) {
		super();
		this.username = username;
		this.password = password;
		this.customer = customer;
		this.shoppingCart = shoppingCart;
		this.orderList = orderList;
	}
	public Account() {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", customer=" + customer + ", shoppingCart="
				+ shoppingCart + ", orderList=" + orderList + "]";
	}

    
    

}
