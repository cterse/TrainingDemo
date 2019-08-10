package com.personal.trainingdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.modelmapper.ModelMapper;

import com.personal.trainingdemo.beans.ProductDTO;
import com.personal.trainingdemo.beans.UserDTO;
import com.personal.trainingdemo.builders.ProductDTOBuilderImpl;
import com.personal.trainingdemo.entities.Product;
import com.personal.trainingdemo.entities.User;
import com.personal.trainingdemo.utils.DTOEntityMappings;

public class DTOEntityMappingsTest {
	
	@Test
	public void getModelMapperTest() {
		ModelMapper modelMapper = new DTOEntityMappings().getModelMapper();
		
		assertNotNull(modelMapper);
	}
	
	@Test
	public void productDTOToEntityMappingTest() {
		getModelMapperTest();
		
		ProductDTO productDTO = ProductDTO.builder()
											.withId("1")
											.withName("Shirt")
											.withDescription("Random Cool Shirt")
											.withBrand("testBrand")
											.withCategory("testCategory")
											.withCode("testCode")
											.withColor("testColor")
											.withGender("testGender")
											.withImage("testImagePath")
											.withPrice(200)
											.withSize("testSize")
											.withType("testType")
											.build();
		
		Product mappedProduct = new DTOEntityMappings().getModelMapper().map(productDTO, Product.class);
		
		assertNotNull(mappedProduct);
		assertEquals(mappedProduct.getBrand(), productDTO.getBrand());
		assertEquals(mappedProduct.getCategory(), productDTO.getCategory());
		assertEquals(mappedProduct.getCode(), productDTO.getCode());
		assertEquals(mappedProduct.getColor(), productDTO.getColor());
		assertEquals(mappedProduct.getDescription(), productDTO.getDescription());
		assertEquals(mappedProduct.getGender(), productDTO.getGender());
		assertEquals(mappedProduct.getId(), productDTO.getId());
		assertEquals(mappedProduct.getImage(), productDTO.getImage());
		assertEquals(mappedProduct.getName(), productDTO.getName());
		assertEquals(mappedProduct.getPrice(), new Double(productDTO.getPrice()));
		assertEquals(mappedProduct.getProductType(), productDTO.getType());
		assertEquals(mappedProduct.getSize(), productDTO.getSize());
		
	}
	
	@Test
	public void productEntityToDTOMappingTest() {
		getModelMapperTest();
		
		Product product = Product.builder()
									.withId("1")
									.withName("Shirt")
									.withDescription("Random Cool Shirt")
									.withBrand("testBrand")
									.withCategory("testCategory")
									.withCode("testCode")
									.withColor("testColor")
									.withGender("testGender")
									.withImage("testImagePath")
									.withPrice(new Double(200))
									.withSize("testSize")
									.withProductType("testType")
									.withLastUpdateDate(new Date())
									.withCreateDate(new Date())
									.withCreatedBy("Chinmay Terse")
									.build();
		
		ProductDTO mappedProduct = new DTOEntityMappings().getModelMapper().map(product, ProductDTO.class);
		
		assertNotNull(mappedProduct);
		assertEquals(mappedProduct.getBrand(), product.getBrand());
		assertEquals(mappedProduct.getCategory(), product.getCategory());
		assertEquals(mappedProduct.getCode(), product.getCode());
		assertEquals(mappedProduct.getColor(), product.getColor());
		assertEquals(mappedProduct.getDescription(), product.getDescription());
		assertEquals(mappedProduct.getGender(), product.getGender());
		assertEquals(mappedProduct.getId(), product.getId());
		assertEquals(mappedProduct.getImage(), product.getImage());
		assertEquals(mappedProduct.getName(), product.getName());
		assertEquals(new Double(mappedProduct.getPrice()), product.getPrice());
		assertEquals(mappedProduct.getType(), product.getProductType());
		assertEquals(mappedProduct.getSize(), product.getSize());
	}

	@Test
	public void userDTOToEntityMappingTest() {
		getModelMapperTest();
		
		UserDTO userDTO = UserDTO.builder()
							.withAddress("testAddress")
							.withEmail("testEmail")
							.withFirstName("testFName")
							.withId("testId")
							.withLastName("testLName")
							.withPassword("testPassword")
							.withPhone("testPhone")
							.withRegistrationDate(new Date())
							.build();
		
		User mappedUser = new DTOEntityMappings().getModelMapper().map(userDTO, User.class);
		
		assertNotNull(mappedUser);
		assertEquals(userDTO.getAddress(), mappedUser.getAddress());
		assertEquals(userDTO.getEmail(), mappedUser.getEmail());
		assertEquals(userDTO.getFirstName(), mappedUser.getFirstName());
		assertEquals(userDTO.getId(), mappedUser.getId());
		assertEquals(userDTO.getLastName(), mappedUser.getLastName());
		assertEquals(userDTO.getPassword(), mappedUser.getPassword());
		assertEquals(userDTO.getPhone(), mappedUser.getPhone());
		assertEquals(userDTO.getRegistrationDate(), mappedUser.getRegistrationdate());
		
	}
	
	@Test
	public void userEntityToDTOMappingTest() {
		getModelMapperTest();
		
		User user = User.builder()
							.withAddress("testAddress")
							.withEmail("testEmail")
							.withFirstName("testFName")
							.withId("testId")
							.withLastName("testLName")
							.withPassword("testPassword")
							.withPhone("testPhone")
							.withRegistrationdate(new Date())
							.withCreatedBy("Chinmay")
							.withCreatedDate(new Date())
							.withLastUpdateDate(new Date())
							.build();
		
		UserDTO mappedUser = new DTOEntityMappings().getModelMapper().map(user, UserDTO.class);
		
		assertNotNull(mappedUser);
		assertEquals(user.getAddress(), mappedUser.getAddress());
		assertEquals(user.getEmail(), mappedUser.getEmail());
		assertEquals(user.getFirstName(), mappedUser.getFirstName());
		assertEquals(user.getId(), mappedUser.getId());
		assertEquals(user.getLastName(), mappedUser.getLastName());
		assertEquals(user.getPassword(), mappedUser.getPassword());
		assertEquals(user.getPhone(), mappedUser.getPhone());
		assertEquals(user.getRegistrationdate(), mappedUser.getRegistrationDate());
	}
}
