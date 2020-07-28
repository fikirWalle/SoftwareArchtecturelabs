package com.miu.edu.shopclient.model;





import java.util.List;


public class ShoppingCart {

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
