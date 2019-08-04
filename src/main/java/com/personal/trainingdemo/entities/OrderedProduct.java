package com.personal.trainingdemo.entities;

import java.io.Serializable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


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

}