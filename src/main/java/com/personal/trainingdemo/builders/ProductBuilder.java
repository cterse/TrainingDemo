package com.personal.trainingdemo.builders;

import com.personal.trainingdemo.beans.ProductDTO;

public interface ProductBuilder {
	ProductDTO build();

	ProductBuilder setBrand(String value);

	ProductBuilder setCategory(String value);

	ProductBuilder setCode(String value);

	ProductBuilder setColor(String value);

	ProductBuilder setDescription(String value);

	ProductBuilder setGender(String value);

	ProductBuilder setId(String value);

	ProductBuilder setImage(String value);

	ProductBuilder setName(String value);

	ProductBuilder setPrice(double value);

	ProductBuilder setSize(String value);

	ProductBuilder setType(String value);

}
