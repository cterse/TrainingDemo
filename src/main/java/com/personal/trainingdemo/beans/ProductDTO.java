package com.personal.trainingdemo.beans;

import javax.annotation.Generated;
import java.io.Serializable;
import java.math.BigInteger;

public class ProductDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5678042485276937973L;
	private BigInteger id;
	private String code;
	private String name;
	private double price;
	private String category;
	private String type;
	private String gender;
	private String size;
	private String color;
	private String description;
	private String brand;
	private String image;

	@Generated("SparkTools")
	private ProductDTO(Builder builder) {
		this.id = builder.id;
		this.code = builder.code;
		this.name = builder.name;
		this.price = builder.price;
		this.category = builder.category;
		this.type = builder.type;
		this.gender = builder.gender;
		this.size = builder.size;
		this.color = builder.color;
		this.description = builder.description;
		this.brand = builder.brand;
		this.image = builder.image;
	}

	public ProductDTO() {
		super();
	}

	public ProductDTO(BigInteger id) {
		super();
		this.id = id;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * Creates builder to build {@link ProductDTO}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link ProductDTO}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private BigInteger id;
		private String code;
		private String name;
		private double price;
		private String category;
		private String type;
		private String gender;
		private String size;
		private String color;
		private String description;
		private String brand;
		private String image;

		private Builder() {
		}

		public Builder withId(BigInteger id) {
			this.id = id;
			return this;
		}

		public Builder withCode(String code) {
			this.code = code;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withPrice(double price) {
			this.price = price;
			return this;
		}

		public Builder withCategory(String category) {
			this.category = category;
			return this;
		}

		public Builder withType(String type) {
			this.type = type;
			return this;
		}

		public Builder withGender(String gender) {
			this.gender = gender;
			return this;
		}

		public Builder withSize(String size) {
			this.size = size;
			return this;
		}

		public Builder withColor(String color) {
			this.color = color;
			return this;
		}

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder withBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public Builder withImage(String image) {
			this.image = image;
			return this;
		}

		public ProductDTO build() {
			return new ProductDTO(this);
		}
	}
	
	
}
