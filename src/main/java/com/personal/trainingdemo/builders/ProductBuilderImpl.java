package com.personal.trainingdemo.builders;

import org.springframework.beans.factory.annotation.Autowired;

import com.personal.trainingdemo.beans.ProductDTO;

public class ProductBuilderImpl implements ProductBuilder {

	@Autowired
	ProductDTO product;

	@Override
	public ProductDTO build() {
		return product;
	}

	@Override
	public ProductBuilder setBrand(String value) {
		product.setBrand(value);
		return this;
	}

	@Override
	public ProductBuilder setCategory(String value) {
		product.setCategory(value);
		return this;
	}

	@Override
	public ProductBuilder setCode(String value) {
		product.setCode(value);
		return this;
	}

	@Override
	public ProductBuilder setColor(String value) {
		product.setColor(value);
		return this;
	}

	@Override
	public ProductBuilder setDescription(String value) {
		product.setDescription(value);
		return this;
	}

	@Override
	public ProductBuilder setGender(String value) {
		product.setGender(value);
		return this;
	}

	@Override
	public ProductBuilder setId(String value) {
		product.setId(value);
		return this;
	}

	@Override
	public ProductBuilder setImage(String value) {
		product.setImage(value);
		return this;
	}

	@Override
	public ProductBuilder setName(String value) {
		product.setName(value);
		return this;
	}

	@Override
	public ProductBuilder setPrice(double value) {
		product.setPrice(value);
		return this;
	}

	@Override
	public ProductBuilder setSize(String value) {
		product.setSize(value);
		return this;
	}

	@Override
	public ProductBuilder setType(String value) {
		product.setType(value);
		return this;
	}

}
