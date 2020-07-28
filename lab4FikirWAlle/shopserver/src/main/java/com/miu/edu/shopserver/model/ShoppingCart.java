package com.miu.edu.shopserver.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ShoppingCart {
    @Id
    private Integer shoppingCartId;
    private List<Item> items;
	public ShoppingCart(Integer shoppingCartId, List<Item> items) {
		
		this.shoppingCartId = shoppingCartId;
		this.items = items;
	}
	public ShoppingCart() {
		
	}
	public Integer getShoppingCartId() {
		return shoppingCartId;
	}
	public void setShoppingCartId(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "ShoppingCart [shoppingCartId=" + shoppingCartId + ", items=" + items + "]";
	}
    
    
}
