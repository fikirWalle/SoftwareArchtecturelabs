package com.miu.edu.shopclient.model;


public class Supplier {

    private Integer supplierId;
    private String name;
	public Supplier(Integer supplierId, String name) {
	
		this.supplierId = supplierId;
		this.name = name;
	}
	public Supplier() {
		
	}
	public Integer getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", name=" + name + "]";
	}
    
    
}
