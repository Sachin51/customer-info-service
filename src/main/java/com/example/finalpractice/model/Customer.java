package com.example.finalpractice.model;

public class Customer {

	private int userId;
	private String userName;
	private long mobile;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int userId, String userName, long mobile) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.mobile = mobile;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
