package com.shan.model;

public class Product {
	
	private int prodcode;
	private String description;
	private int price;
	
	//default constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterised constructor
	public Product(int prodcode, String description, int price) {
		super();
		this.prodcode = prodcode;
		this.description = description;
		this.price = price;
	}

	//getters and setters
	public int getProdcode() {
		return prodcode;
	}

	public void setProdcode(int prodcode) {
		this.prodcode = prodcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prodcode=" + prodcode + ", description=" + description + ", price=" + price + "]";
	}
	
	
	
	
	
	
	

}
