package com.miu.edu.shopserver.model;

import org.springframework.data.annotation.Id;

public class Item {
    @Id
    private Integer itemId;
    private Product product;
    private int quantity;
	public Item(Integer itemId, Product product, int quantity) {
		
		this.itemId = itemId;
		this.product = product;
		this.quantity = quantity;
	}
	public Item() {
		
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", product=" + product + ", quantity=" + quantity + "]";
	}
    
    
    
    
    
    
}
