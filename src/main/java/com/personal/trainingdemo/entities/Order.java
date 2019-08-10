package com.personal.trainingdemo.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.personal.trainingdemo.utils.CommonConstants;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;


/**
 * The persistent class for the ORDERS database table.
 * 
 */
@Entity
@Table(name="ORDERS")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ORDERS_ID_GENERATOR", sequenceName="HIBERNATE_ORDER_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORDERS_ID_GENERATOR")
	@Column(unique=true, nullable=false, length=30)
	private String id;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATED_BY", length=100)
	private String createdBy;

	@Column(length=5)
	private String currency;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Temporal(TemporalType.DATE)
	@Column(name="ORDER_DATE")
	private Date orderDate;

	@Column(length=50)
	private String status;

	@Column(precision=65535, scale=32767)
	private BigDecimal totalamount;

	@Generated("SparkTools")
	private Order(Builder builder) {
		this.id = builder.id;
		this.createDate = builder.createDate;
		this.createdBy = builder.createdBy;
		this.currency = builder.currency;
		this.lastUpdateDate = builder.lastUpdateDate;
		this.orderDate = builder.orderDate;
		this.status = builder.status;
		this.totalamount = builder.totalamount;
	}
	
	public Order() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
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

	public BigDecimal getTotalamount() {
		return this.totalamount;
	}

	public void setTotalamount(BigDecimal totalamount) {
		this.totalamount = totalamount;
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
		private String id;
		private Date createDate;
		private String createdBy;
		private String currency;
		private Date lastUpdateDate;
		private Date orderDate;
		private String status;
		private BigDecimal totalamount;

		private Builder() {
		}

		public Builder withId(String id) {
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

		public Builder withTotalamount(BigDecimal totalamount) {
			this.totalamount = totalamount;
			return this;
		}

		public Order build() {
			return new Order(this);
		}
	}

}