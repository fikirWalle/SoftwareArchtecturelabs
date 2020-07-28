package com.miu.edu.shopclient.model;


public class Stock {

    private Integer stockId;
    private Integer amount;
    private String location;
	public Stock(Integer stockId, Integer amount, String location) {
	
		this.stockId = stockId;
		this.amount = amount;
		this.location = location;
	}
	public Stock() {
	
	}
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", amount=" + amount + ", location=" + location + "]";
	}
    
    
    

}
