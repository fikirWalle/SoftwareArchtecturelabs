package com.miu.edu.shopserver.model;

import org.springframework.data.annotation.Id;

public class Supplier {
    @Id
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
