package com.personal.trainingdemo.entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the ORDERED_PRODUCTS database table.
 * 
 */
@Entity
@Table(name="ORDERED_PRODUCTS")
@NamedQuery(name="OrderedProduct.findAll", query="SELECT o FROM OrderedProduct o")
public class OrderedProduct extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", length=30)
	private String orderId;

	@Column(name="PRODUCT_ID", length=30)
	private String productId;

	@Column(name="PRODUCT_QUANTITY", precision=65535, scale=32767)
	private BigDecimal productQuantity;

	@Generated("SparkTools")
	private OrderedProduct(Builder builder) {
		this.orderId = builder.orderId;
		this.productId = builder.productId;
		this.productQuantity = builder.productQuantity;

		this.setId(builder.id);
		this.setCreateDate(builder.createDate);
		this.setCreatedBy(builder.createdBy);
		this.setLastUpdateDate(builder.lastUpdateDate);
	}

	public OrderedProduct() {
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
		private BigInteger id;
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

		public Builder withId(BigInteger id) {
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