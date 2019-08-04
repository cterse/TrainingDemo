package com.personal.trainingdemo.builders;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.beans.ProductDTO;

public class OrderBuilderImpl implements OrderBuilder {
	
	@Autowired
	OrderDTO order;
	
	@Override
	public OrderDTO build() {
		return order;
	}

	@Override
	public OrderBuilder setCurrency(String value) {
		order.setCurrency(value);
		return this;
	}

	@Override
	public OrderBuilder setDate(Date value) {
		order.setDate(value);
		return this;
	}

	@Override
	public OrderBuilder setId(String value) {
		order.setId(value);
		return this;
	}

	@Override
	public OrderBuilder setOrderedProducts(List<ProductDTO> value) {
		order.setOrderedProducts(value);
		return this;
	}

	@Override
	public OrderBuilder setStatus(String value) {
		order.setStatus(value);
		return this;
	}

	@Override
	public OrderBuilder setTotalAmount(double value) {
		order.setTotalAmount(value);
		return this;
	}

}
