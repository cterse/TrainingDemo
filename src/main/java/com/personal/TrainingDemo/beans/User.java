package com.personal.TrainingDemo.beans;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private String customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	private int customerPhone;
	private String customerAddress;
	private String customerPassword;
	private Date customerRegDate;
	
	public User(String customerId) {
		super();
		this.customerId = customerId;
	}
	public User(String customerId, String customerFirstName, String customerLastName, String customerEmail,
			int customerPhone, String customerAddress, String customerPassword, Date customerRegDate) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
		this.customerPassword = customerPassword;
		this.customerRegDate = customerRegDate;
	}
	public User() {
		super();
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public Date getCustomerRegDate() {
		return customerRegDate;
	}
	public void setCustomerRegDate(Date customerRegDate) {
		this.customerRegDate = customerRegDate;
	}
}
