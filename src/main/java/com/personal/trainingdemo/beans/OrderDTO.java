package com.personal.trainingdemo.beans;

import javax.annotation.Generated;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class OrderDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6663916013156545068L;
	private BigInteger id;
	private Date date;
	private double totalAmount;
	private String currency;
	private String status;
	private List<ProductDTO> orderedProducts;

	@Generated("SparkTools")
	private OrderDTO(Builder builder) {
		this.id = builder.id;
		this.date = builder.date;
		this.totalAmount = builder.totalAmount;
		this.currency = builder.currency;
		this.status = builder.status;
		this.orderedProducts = builder.orderedProducts;
	}
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
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

	public OrderDTO(BigInteger orderId) {
		super();
		this.id = orderId;
	}
	public OrderDTO(BigInteger orderId, Date orderDate, double orderTotalAmount, String orderStatus,
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
	/**
	 * Creates builder to build {@link OrderDTO}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}
	/**
	 * Builder to build {@link OrderDTO}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private BigInteger id;
		private Date date;
		private double totalAmount;
		private String currency;
		private String status;
		private List<ProductDTO> orderedProducts = Collections.emptyList();

		private Builder() {
		}

		public Builder withId(BigInteger id) {
			this.id = id;
			return this;
		}

		public Builder withDate(Date date) {
			this.date = date;
			return this;
		}

		public Builder withTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
			return this;
		}

		public Builder withCurrency(String currency) {
			this.currency = currency;
			return this;
		}

		public Builder withStatus(String status) {
			this.status = status;
			return this;
		}

		public Builder withOrderedProducts(List<ProductDTO> orderedProducts) {
			this.orderedProducts = orderedProducts;
			return this;
		}

		public OrderDTO build() {
			return new OrderDTO(this);
		}
	}
		
	
}
