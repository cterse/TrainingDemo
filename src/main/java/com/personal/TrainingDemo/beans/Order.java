package com.personal.TrainingDemo.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6663916013156545068L;
	private String id;
	private Date date;
	private double totalAmount;
	private String status;
	private List<Product> orderedProducts;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<Product> getOrderedProducts() {
		return orderedProducts;
	}
	public void setOrderedProducts(List<Product> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}

	public Order(String orderId) {
		super();
		this.id = orderId;
	}
	public Order(String orderId, Date orderDate, double orderTotalAmount, String orderStatus,
			List<Product> orderedProducts) {
		super();
		this.id = orderId;
		this.date = orderDate;
		this.totalAmount = orderTotalAmount;
		this.status = orderStatus;
		this.orderedProducts = orderedProducts;
	}
	public Order() {
		super();
	}
		
	
}
