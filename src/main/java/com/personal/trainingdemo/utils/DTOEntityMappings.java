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
import com.personal.trainingdemo.builders.ProductBuilderImpl;
import com.personal.trainingdemo.entities.Product;

public class DTOEntityMappings {

	private static final Logger logger = LoggerFactory.getLogger(DTOEntityMappings.class);
	
	private List<PropertyMap<?, ?>> getPropertyMaps() {
		List<PropertyMap<?, ?>> mapsList = new ArrayList<>();
		
		mapsList.add(new PropertyMap<ProductDTO, Product>() {
		
			@Override
			protected void configure() {
				map().setProductType(source.getType());
				
				skip().setCreateDate(null);
				skip().setCreatedBy(null);
				skip().setLastUpdateDate(null);
			}
		});
		logger.trace("Added PropertyMap<ProductDTO, Product>");
		
		return mapsList;
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
	
	public static void main(String[] args) {
		ModelMapper modelMapper = new DTOEntityMappings().getModelMapper();
		
		
		ProductDTO productDto = new ProductBuilderImpl()
									.setId("1")
									.setCode("001")
									.setName("Shirt")
									.setDescription("Random Cool Shirt")
									.build();
		Product product = modelMapper.map(productDto, Product.class);
		System.out.println(productDto);
		System.out.println(product.getId() + ":" + product.getName() + ":" + product.getCreatedBy());
		
		productDto = new ModelMapper().map(product, ProductDTO.class);
		System.out.println(productDto.getId() + ":" + productDto.getName() + ":" );
		
		System.out.println("Fin.");
	}

}
