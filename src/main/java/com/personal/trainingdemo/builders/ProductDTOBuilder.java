package com.personal.trainingdemo.builders;

import com.personal.trainingdemo.beans.ProductDTO;

public interface ProductDTOBuilder {
	ProductDTO build();

	ProductDTOBuilder setBrand(String value);

	ProductDTOBuilder setCategory(String value);

	ProductDTOBuilder setCode(String value);

	ProductDTOBuilder setColor(String value);

	ProductDTOBuilder setDescription(String value);

	ProductDTOBuilder setGender(String value);

	ProductDTOBuilder setId(String value);

	ProductDTOBuilder setImage(String value);

	ProductDTOBuilder setName(String value);

	ProductDTOBuilder setPrice(double value);

	ProductDTOBuilder setSize(String value);

	ProductDTOBuilder setType(String value);

}
