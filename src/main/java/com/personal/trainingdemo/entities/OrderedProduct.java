package com.personal.trainingdemo.entities;

import java.io.Serializable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;


/**
 * The persistent class for the ORDERED_PRODUCTS database table.
 * 
 */
@Entity
@Table(name="ORDERED_PRODUCTS")
@NamedQuery(name="OrderedProduct.findAll", query="SELECT o FROM OrderedProduct o")
public class OrderedProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATED_BY", length=100)
	private String createdBy;

	@Id
	@Column(length=30)
	@SequenceGenerator(sequenceName="HIBERNATE_ORDEREDPRODUCTS_SEQ", name = "ORDEREDPRODUCTS_ID_GENERATOR")
	@GeneratedValue(generator="ORDEREDPRODUCTS_ID_GENERATOR", strategy = GenerationType.SEQUENCE)
	private String id; 

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="ORDER_ID", length=30)
	private String orderId;

	@Column(name="PRODUCT_ID", length=30)
	private String productId;

	@Column(name="PRODUCT_QUANTITY", precision=65535, scale=32767)
	private BigDecimal productQuantity;

	@Generated("SparkTools")
	private OrderedProduct(Builder builder) {
		this.createDate = builder.createDate;
		this.createdBy = builder.createdBy;
		this.id = builder.id;
		this.lastUpdateDate = builder.lastUpdateDate;
		this.orderId = builder.orderId;
		this.productId = builder.productId;
		this.productQuantity = builder.productQuantity;
	}

	public OrderedProduct() {
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public BigDecimal getProductQuantity() {
		return this.productQuantity;
	}

	public void setProductQuantity(BigDecimal productQuantity) {
		this.productQuantity = productQuantity;
	}

	/**
	 * Creates builder to build {@link OrderedProduct}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link OrderedProduct}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private Date createDate;
		private String createdBy;
		private String id;
		private Date lastUpdateDate;
		private String orderId;
		private String productId;
		private BigDecimal productQuantity;

		private Builder() {
		}

		public Builder withCreateDate(Date createDate) {
			this.createDate = createDate;
			return this;
		}

		public Builder withCreatedBy(String createdBy) {
			this.createdBy = createdBy;
			return this;
		}

		public Builder withId(String id) {
			this.id = id;
			return this;
		}

		public Builder withLastUpdateDate(Date lastUpdateDate) {
			this.lastUpdateDate = lastUpdateDate;
			return this;
		}

		public Builder withOrderId(String orderId) {
			this.orderId = orderId;
			return this;
		}

		public Builder withProductId(String productId) {
			this.productId = productId;
			return this;
		}

		public Builder withProductQuantity(BigDecimal productQuantity) {
			this.productQuantity = productQuantity;
			return this;
		}

		public OrderedProduct build() {
			return new OrderedProduct(this);
		}
	}

}