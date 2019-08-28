package com.personal.trainingdemo.utils;

import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.beans.ProductDTO;
import com.personal.trainingdemo.beans.UserDTO;
import com.personal.trainingdemo.entities.Order;
import com.personal.trainingdemo.entities.Product;
import com.personal.trainingdemo.entities.User;

public interface DTOEntityMapping {
    Product getProductEntityFromDTO(ProductDTO productDTO);

    ProductDTO getProductDTOFromEntity(Product product);

    Order getOrderEntityFromDTO(OrderDTO orderDTO);

    OrderDTO getOrderDTOFromEntity(Order order);

    User getUserEntityFromDTO(UserDTO userDTO);

    UserDTO getUserDTOFromEntity(User user);
}
