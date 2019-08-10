package com.personal.trainingdemo.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.personal.trainingdemo.beans.ProductDTO;
import com.personal.trainingdemo.beans.UserDTO;
import com.personal.trainingdemo.builders.ProductDTOBuilderImpl;
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
