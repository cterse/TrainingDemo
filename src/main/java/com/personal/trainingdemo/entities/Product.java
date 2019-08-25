package com.personal.trainingdemo.entities;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the PRODUCT database table.
 * 
 */
@Entity
@Table(name="PRODUCT")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCT_ID_GENERATOR", sequenceName="HIBERNATE_PRODUCT_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_ID_GENERATOR")
	@Column(unique=true, nullable=false, length=30)
	private BigInteger id;

	@Column(length=100)
	private String brand;

	@Column(length=100)
	private String category;

	@Column(length=100)
	private String code;

	@Column(length=50)
	private String color;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATED_BY", length=100)
	private String createdBy;

	@Column(length=200)
	private String description;

	@Column(length=5)
	private String gender;

	@Column(length=200)
	private String image;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(length=100)
	private String name;

	@Column(precision=65535, scale=32767)
	private BigDecimal price;

	@Column(name="PRODUCT_TYPE", length=100)
	private String productType;

	@Column(length=50)
	private String size;

	@Generated("SparkTools")
	private Product(Builder builder) {
		this.id = builder.id;
		this.brand = builder.brand;
		this.category = builder.category;
		this.code = builder.code;
		this.color = builder.color;
		this.createDate = builder.createDate;
		this.createdBy = builder.createdBy;
		this.description = builder.description;
		this.gender = builder.gender;
		this.image = builder.image;
		this.lastUpdateDate = builder.lastUpdateDate;
		this.name = builder.name;
		this.price = builder.price;
		this.productType = builder.productType;
		this.size = builder.size;
	}

	public Product() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * Creates builder to build {@link Product}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link Product}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private BigInteger id;
		private String brand;
		private String category;
		private String code;
		private String color;
		private Date createDate;
		private String createdBy;
		private String description;
		private String gender;
		private String image;
		private Date lastUpdateDate;
		private String name;
		private BigDecimal price;
		private String productType;
		private String size;

		private Builder() {
		}

		public Builder withId(BigInteger id) {
			this.id = id;
			return this;
		}

		public Builder withBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public Builder withCategory(String category) {
			this.category = category;
			return this;
		}

		public Builder withCode(String code) {
			this.code = code;
			return this;
		}

		public Builder withColor(String color) {
			this.color = color;
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

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder withGender(String gender) {
			this.gender = gender;
			return this;
		}

		public Builder withImage(String image) {
			this.image = image;
			return this;
		}

		public Builder withLastUpdateDate(Date lastUpdateDate) {
			this.lastUpdateDate = lastUpdateDate;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withPrice(BigDecimal price) {
			this.price = price;
			return this;
		}

		public Builder withProductType(String productType) {
			this.productType = productType;
			return this;
		}

		public Builder withSize(String size) {
			this.size = size;
			return this;
		}

		public Product build() {
			return new Product(this);
		}
	}

}