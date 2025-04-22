package com.masantello.paymentconsumer.models;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String userName;
	private String userEmail;
	
	public User() {
		
	}
	
	public User(Integer id, String userName, String userEmail) {
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}
