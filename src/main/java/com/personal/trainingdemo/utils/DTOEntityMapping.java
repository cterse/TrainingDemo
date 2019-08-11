package com.personal.trainingdemo.utils;

import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.beans.ProductDTO;
import com.personal.trainingdemo.beans.UserDTO;
import com.personal.trainingdemo.entities.Order;
import com.personal.trainingdemo.entities.Product;
import com.personal.trainingdemo.entities.User;

public interface DTOEntityMapping {
	public Product getProductEntityFromDTO(ProductDTO productDTO);

	public ProductDTO getProductDTOFromEntity(Product product);

	public Order getOrderEntityFromDTO(OrderDTO orderDTO);

	public OrderDTO getOrderDTOFromEntity(Order order);

	public User getUserEntityFromDTO(UserDTO userDTO);

	public UserDTO getUserDTOFromEntity(User user);
}
