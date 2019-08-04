package com.personal.trainingdemo.builders;

import java.sql.Date;
import java.util.List;

import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.beans.ProductDTO;

public interface OrderBuilder {
	OrderDTO build();

	OrderBuilder setCurrency(String value);

	OrderBuilder setDate(Date value);

	OrderBuilder setId(String value);

	OrderBuilder setOrderedProducts(List<ProductDTO> value);

	OrderBuilder setStatus(String value);

	OrderBuilder setTotalAmount(double value);
}
