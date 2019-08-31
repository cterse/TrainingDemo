package com.personal.trainingdemo.entities;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the ORDERS database table.
 * 
 */
@Entity
@Table(name="ORDERS")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=5)
	private String currency;

	@Temporal(TemporalType.DATE)
	@Column(name="ORDER_DATE")
	private Date orderDate;

	@Column(length=50)
	private String status;

	@Column(precision=65535, scale=32767)
	private BigDecimal totalAmount;

	@Generated("SparkTools")
	private Order(Builder builder) {
		/*this.id = builder.id;
		this.createDate = builder.createDate;
		this.createdBy = builder.createdBy;*/
		this.currency = builder.currency;
		/*this.lastUpdateDate = builder.lastUpdateDate;*/
		this.orderDate = builder.orderDate;
		this.status = builder.status;
		this.totalAmount = builder.totalAmount;

		this.setId(builder.id);
		this.setLastUpdateDate(builder.lastUpdateDate);
		this.setCreateDate(builder.createDate);
		this.setCreatedBy(builder.createdBy);
	}
	
	public Order() {
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * Creates builder to build {@link Order}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link Order}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private BigInteger id;
		private Date createDate;
		private String createdBy;
		private String currency;
		private Date lastUpdateDate;
		private Date orderDate;
		private String status;
		private BigDecimal totalAmount;

		private Builder() {
		}

		public Builder withId(BigInteger id) {
			this.id = id;
			return this;
		}

		public Builder withCreateDate(Date createDate) {
			this.createDate = createDate;
			return this;
		}

		public Builder withCreatedBy(String createdBy) {
			this.createdBy = createdBy;
			return this;
		}

		public Builder withCurrency(String currency) {
			this.currency = currency;
			return this;
		}

		public Builder withLastUpdateDate(Date lastUpdateDate) {
			this.lastUpdateDate = lastUpdateDate;
			return this;
		}

		public Builder withOrderDate(Date orderDate) {
			this.orderDate = orderDate;
			return this;
		}

		public Builder withStatus(String status) {
			this.status = status;
			return this;
		}

		public Builder withTotalAmount(BigDecimal totalAmount) {
			this.totalAmount = totalAmount;
			return this;
		}

		public Order build() {
			return new Order(this);
		}
	}

}