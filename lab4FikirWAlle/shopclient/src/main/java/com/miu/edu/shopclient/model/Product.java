package com.miu.edu.shopclient.model;





import java.util.List;


public class Product {

    private Integer productNumber;
    private String name;
    private double price;
    private String description;
    private List<Review> reviews;
    private Supplier supplier;
    private Stock stock;
	public Product(Integer productNumber, String name, double price, String description, List<Review> reviews,
			Supplier supplier, Stock stock) {
		super();
		this.productNumber = productNumber;
		this.name = name;
		this.price = price;
		this.description = description;
		this.reviews = reviews;
		this.supplier = supplier;
		this.stock = stock;
	}
	public Product() {
	
	}
	public Integer getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", name=" + name + ", price=" + price + ", description="
				+ description + ", reviews=" + reviews + ", supplier=" + supplier + ", stock=" + stock + "]";
	}
    
    
    
}
