package com.masantello.paymentconsumer.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private User user;
	private List<Product> products;
	private Float finalPrice;
	private String cardNumber;
	private LocalDateTime paymentDate;

	public Payment() {

	}

	public Payment(Long id, User user, Float finalPrice, String cardNumber, LocalDateTime paymentDate) {
		this.id = id;
		this.user = user;
		this.finalPrice = finalPrice;
		this.cardNumber = cardNumber;
		this.paymentDate = paymentDate;
	}

	public Long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public Float getFinalPrice() {
		return finalPrice;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
}
