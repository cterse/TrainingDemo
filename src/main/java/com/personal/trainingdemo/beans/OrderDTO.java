package com.personal.trainingdemo.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.personal.trainingdemo.entities.Order;

public class OrderDTO extends Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6663916013156545068L;
	private String id;
	private Date date;
	private double totalAmount;
	private String currency;
	private String status;
	private List<ProductDTO> orderedProducts;
	
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
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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
	public List<ProductDTO> getOrderedProducts() {
		return orderedProducts;
	}
	public void setOrderedProducts(List<ProductDTO> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}

	public OrderDTO(String orderId) {
		super();
		this.id = orderId;
	}
	public OrderDTO(String orderId, Date orderDate, double orderTotalAmount, String orderStatus,
			List<ProductDTO> orderedProducts) {
		super();
		this.id = orderId;
		this.date = orderDate;
		this.totalAmount = orderTotalAmount;
		this.status = orderStatus;
		this.orderedProducts = orderedProducts;
	}
	public OrderDTO() {
		super();
	}
		
	
}
