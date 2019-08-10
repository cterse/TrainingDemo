package com.personal.trainingdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.modelmapper.ModelMapper;

import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.beans.ProductDTO;
import com.personal.trainingdemo.beans.UserDTO;
import com.personal.trainingdemo.builders.ProductDTOBuilderImpl;
import com.personal.trainingdemo.entities.Order;
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
		assertEquals(productDTO.getBrand(), mappedProduct.getBrand());
		assertEquals(productDTO.getCategory(), mappedProduct.getCategory());
		assertEquals(productDTO.getCode(), mappedProduct.getCode());
		assertEquals(productDTO.getColor(), mappedProduct.getColor());
		assertEquals(productDTO.getDescription(), mappedProduct.getDescription());
		assertEquals(productDTO.getGender(), mappedProduct.getGender());
		assertEquals(productDTO.getId(), mappedProduct.getId());
		assertEquals(productDTO.getImage(), mappedProduct.getImage());
		assertEquals(productDTO.getName(), mappedProduct.getName());
		assertEquals(BigDecimal.valueOf(productDTO.getPrice()), mappedProduct.getPrice());
		assertEquals(productDTO.getType(), mappedProduct.getProductType());
		assertEquals(productDTO.getSize(), mappedProduct.getSize());
		
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
									.withPrice(BigDecimal.valueOf(200.0))
									.withSize("testSize")
									.withProductType("testType")
									.withLastUpdateDate(new Date())
									.withCreateDate(new Date())
									.withCreatedBy("Chinmay Terse")
									.build();
		
		ProductDTO mappedProduct = new DTOEntityMappings().getModelMapper().map(product, ProductDTO.class);
		
		assertNotNull(mappedProduct);
		assertEquals(product.getBrand(), mappedProduct.getBrand());
		assertEquals(product.getCategory(), mappedProduct.getCategory());
		assertEquals(product.getCode(), mappedProduct.getCode());
		assertEquals(product.getColor(), mappedProduct.getColor());
		assertEquals(product.getDescription(), mappedProduct.getDescription());
		assertEquals(product.getGender(), mappedProduct.getGender());
		assertEquals(product.getId(), mappedProduct.getId());
		assertEquals(product.getImage(), mappedProduct.getImage());
		assertEquals(product.getName(), mappedProduct.getName());
		assertEquals(product.getPrice(), BigDecimal.valueOf(mappedProduct.getPrice()));
		assertEquals(product.getProductType(), mappedProduct.getType());
		assertEquals(product.getSize(), mappedProduct.getSize());

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
	
	@Test
	public void orderDTOToEntityMappingTest() {
		getModelMapperTest();
		
		OrderDTO orderDTO = OrderDTO.builder()
									.withCurrency("testCurrency")
									.withDate(new Date())
									.withId("testId")
									.withOrderedProducts(null)
									.withStatus("testStatus")
									.withTotalAmount(500)
									.build();
		
		Order mappedOrder = new DTOEntityMappings().getModelMapper().map(orderDTO, Order.class);
		
		assertNotNull(mappedOrder);
		assertEquals(orderDTO.getCurrency(), mappedOrder.getCurrency());
		assertEquals(orderDTO.getDate(), mappedOrder.getOrderDate());
		assertEquals(orderDTO.getId(), mappedOrder.getId());
		assertEquals(orderDTO.getStatus(), mappedOrder.getStatus());
		assertEquals(BigDecimal.valueOf(orderDTO.getTotalAmount()), mappedOrder.getTotalAmount());
		
	}

	@Test
	public void orderEntityToDTOMappingTest() {
		getModelMapperTest();
		
		Order order = Order.builder()
							.withCreateDate(new Date())
							.withCreatedBy("Chinmay Terse")
							.withCurrency("INR")
							.withId("testId")
							.withLastUpdateDate(new Date())
							.withOrderDate(new Date())
							.withStatus("testStatus")
							.withTotalAmount(BigDecimal.valueOf(200.0))
							.build();
		
		OrderDTO mappedOrder = new DTOEntityMappings().getModelMapper().map(order, OrderDTO.class);
		
		assertNotNull(mappedOrder);
		assertEquals(order.getOrderDate(), mappedOrder.getDate());
		assertEquals(order.getCurrency(), mappedOrder.getCurrency());
		assertEquals(order.getId(), mappedOrder.getId());
		assertEquals(order.getStatus(), mappedOrder.getStatus());
		assertEquals(order.getTotalAmount(), BigDecimal.valueOf(mappedOrder.getTotalAmount()));
	}
}
