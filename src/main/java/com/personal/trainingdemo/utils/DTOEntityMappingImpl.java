package com.personal.trainingdemo.utils;

import java.math.BigDecimal;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.beans.ProductDTO;
import com.personal.trainingdemo.beans.UserDTO;
import com.personal.trainingdemo.entities.Order;
import com.personal.trainingdemo.entities.Product;
import com.personal.trainingdemo.entities.User;

public class DTOEntityMappingImpl implements DTOEntityMapping {

	private static final Logger logger = LoggerFactory.getLogger(DTOEntityMappingImpl.class);

	@Override
	public Product getProductEntityFromDTO(ProductDTO productDTO) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(getProductDTOToEntityMappings());
		return modelMapper.map(productDTO, Product.class);
	}

	private PropertyMap<ProductDTO, Product> getProductDTOToEntityMappings() {

		return new PropertyMap<ProductDTO, Product>() {

			@Override
			protected void configure() {
				map().setProductType(source.getType());
				map().setPrice(BigDecimal.valueOf(source.getPrice()));

				skip().setCreateDate(null);
				skip().setCreatedBy(null);
				skip().setLastUpdateDate(null);
			}
		};
	}

	@Override
	public ProductDTO getProductDTOFromEntity(Product product) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(getProductEntityToDTOMappings());
		return modelMapper.map(product, ProductDTO.class);
	}

	private PropertyMap<Product, ProductDTO> getProductEntityToDTOMappings() {

		return new PropertyMap<Product, ProductDTO>() {

			@Override
			protected void configure() {
				map().setType(source.getProductType());
			}
		};
	}

	@Override
	public Order getOrderEntityFromDTO(OrderDTO orderDTO) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(getOrderDTOToEntityMappings());
		return modelMapper.map(orderDTO, Order.class);
	}

	private PropertyMap<OrderDTO, Order> getOrderDTOToEntityMappings() {

		return new PropertyMap<OrderDTO, Order>() {
			@Override
			protected void configure() {
				map().setOrderDate(source.getDate());
				map().setTotalAmount(BigDecimal.valueOf(source.getTotalAmount()));

				skip().setLastUpdateDate(null);
				skip().setCreateDate(null);
				skip().setCreatedBy(null);
			}
		};
	}

	@Override
	public OrderDTO getOrderDTOFromEntity(Order order) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(getOrderEntityToDTOMappings());
		return modelMapper.map(order, OrderDTO.class);
	}

	private PropertyMap<Order, OrderDTO> getOrderEntityToDTOMappings() {

		return new PropertyMap<Order, OrderDTO>() {
			@Override
			protected void configure() {
				map().setDate(source.getOrderDate());

				skip().setOrderedProducts(null);
			}
		};
	}

	@Override
	public User getUserEntityFromDTO(UserDTO userDTO) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(getUserDTOToEntityMappings());
		return modelMapper.map(userDTO, User.class);
	}

	private PropertyMap<UserDTO, User> getUserDTOToEntityMappings() {

		return new PropertyMap<UserDTO, User>() {
			@Override
			protected void configure() {
				map().setRegistrationdate(source.getRegistrationDate());

				skip().setLastUpdateDate(null);
				skip().setCreatedBy(null);
				skip().setCreatedDate(null);
			}
		};
	}

	@Override
	public UserDTO getUserDTOFromEntity(User user) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(getUserEntityToDTOMappings());
		return modelMapper.map(user, UserDTO.class);
	}

	private PropertyMap<User, UserDTO> getUserEntityToDTOMappings() {

		return new PropertyMap<User, UserDTO>() {
			@Override
			protected void configure() {
				map().setRegistrationDate(source.getRegistrationdate());
			}
		};
	}
}
