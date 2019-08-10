package com.personal.trainingdemo.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.beans.ProductDTO;
import com.personal.trainingdemo.beans.UserDTO;
import com.personal.trainingdemo.entities.Order;
import com.personal.trainingdemo.entities.Product;
import com.personal.trainingdemo.entities.User;

public class DTOEntityMappings {

	private static final Logger logger = LoggerFactory.getLogger(DTOEntityMappings.class);
	
	private List<PropertyMap<?, ?>> getPropertyMaps() {
		List<PropertyMap<?, ?>> propertyMapsList = new ArrayList<>();
		
		propertyMapsList.add(new PropertyMap<ProductDTO, Product>() {
		
			@Override
			protected void configure() {
				map().setProductType(source.getType());
				map().setPrice(BigDecimal.valueOf(source.getPrice()));
				
				skip().setCreateDate(null);
				skip().setCreatedBy(null);
				skip().setLastUpdateDate(null);
			}
		});
		logger.trace("Added PropertyMap<ProductDTO, Product>");
		
		propertyMapsList.add(new PropertyMap<Product, ProductDTO>() {

			@Override
			protected void configure() {
				map().setType(source.getProductType());
			}
		});
		logger.trace("Added PropertyMap<Product, ProductDTO>");
		
		propertyMapsList.add(new PropertyMap<UserDTO, User>() {
			@Override
			protected void configure() {
				map().setRegistrationdate(source.getRegistrationDate());
				
				skip().setLastUpdateDate(null);
				skip().setCreatedBy(null);
				skip().setCreatedDate(null);
			}
		});
		
		propertyMapsList.add(new PropertyMap<User, UserDTO>() {
			@Override
			protected void configure() {
				map().setRegistrationDate(source.getRegistrationdate());
			}
		});
		
		propertyMapsList.add(new PropertyMap<OrderDTO, Order>() {
			@Override
			protected void configure() {
				map().setOrderDate(source.getDate());
				map().setTotalAmount(BigDecimal.valueOf(source.getTotalAmount()));
				
				skip().setLastUpdateDate(null);
				skip().setCreateDate(null);
				skip().setCreatedBy(null);
			}
		});
		
		propertyMapsList.add(new PropertyMap<Order, OrderDTO>() {
			@Override
			protected void configure() {
				map().setDate(source.getOrderDate());
				
				skip().setOrderedProducts(null);
			}
		});
		
		return propertyMapsList;
	}
	
	public ModelMapper getModelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		for(PropertyMap<?, ?> map : getPropertyMaps()) {
			modelMapper.addMappings(map);
		}
		
		modelMapper.validate();
		
		return modelMapper;
	}
}
