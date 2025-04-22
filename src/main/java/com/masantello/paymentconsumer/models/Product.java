package com.masantello.paymentconsumer.models;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String productName;
	private String description;
	private String brand;
	private Float price;
	private Integer quantity;

	public Product() {

	}

	public Product(Integer id, String productName, String description, String category, Float price, Integer quantity) {
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.brand = category;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float calculateTotalPrice() {
		return this.price * this.quantity;
	}

}
