package com.personal.TrainingDemo.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6663916013156545068L;
	private String orderId;
	private Date orderDate;
	private double orderTotalAmount;
	private String orderStatus;
	private List<Product> orderedProducts;
	
	public Order(String orderId) {
		super();
		this.orderId = orderId;
	}
	public Order(String orderId, Date orderDate, double orderTotalAmount, String orderStatus,
			List<Product> orderedProducts) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderTotalAmount = orderTotalAmount;
		this.orderStatus = orderStatus;
		this.orderedProducts = orderedProducts;
	}
	public Order() {
		super();
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderTotalAmount() {
		return orderTotalAmount;
	}
	public void setOrderTotalAmount(double orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public List<Product> getOrderedProducts() {
		return orderedProducts;
	}
	public void setOrderedProducts(List<Product> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}
	
	
}
