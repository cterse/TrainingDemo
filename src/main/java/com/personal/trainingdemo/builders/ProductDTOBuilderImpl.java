package com.personal.trainingdemo.builders;

import org.springframework.beans.factory.annotation.Autowired;

import com.personal.trainingdemo.beans.ProductDTO;

public class ProductDTOBuilderImpl implements ProductDTOBuilder {

	//@Autowired
	ProductDTO product = new ProductDTO();

	@Override
	public ProductDTO build() {
		return product;
	}

	@Override
	public ProductDTOBuilder setBrand(String value) {
		product.setBrand(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setCategory(String value) {
		product.setCategory(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setCode(String value) {
		product.setCode(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setColor(String value) {
		product.setColor(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setDescription(String value) {
		product.setDescription(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setGender(String value) {
		product.setGender(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setId(String value) {
		product.setId(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setImage(String value) {
		product.setImage(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setName(String value) {
		product.setName(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setPrice(double value) {
		product.setPrice(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setSize(String value) {
		product.setSize(value);
		return this;
	}

	@Override
	public ProductDTOBuilder setType(String value) {
		product.setType(value);
		return this;
	}

}
