package com.personal.trainingdemo.controllers;

import com.personal.trainingdemo.beans.ProductDTO;
import com.personal.trainingdemo.services.ProductService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class ProductControllerTest {

    @Rule public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    ProductService productService;

    @InjectMocks private ProductController productController;

    @Test
    public void findAllProducts() {
        List<ProductDTO> toReturn = new ArrayList<>();
        toReturn.add(new ProductDTO());
        when(productService.getAllProducts()).thenReturn(toReturn);

        List<ProductDTO> products = productController.findAllProducts();

        assertNotNull(products);
        assertEquals(1, products.size());
        verify(productService, times(1)).getAllProducts();
    }

    @Test
    public void findProduct() {
        ProductDTO toReturn = ProductDTO.builder().withId(BigInteger.ONE).withName("Shirt").withDescription("Random Cool Shirt")
                .withBrand("testBrand").withCategory("testCategory").withCode("testCode").withColor("testColor")
                .withGender("testGender").withImage("testImagePath").withPrice(200).withSize("testSize")
                .withType("testType").build();
        when(productService.getProduct(any())).thenReturn(toReturn);

        ProductDTO productDTO = productController.findProduct(BigInteger.ONE);

        verify(productService, times(1)).getProduct(any());
        assertNotNull(productDTO);
        assertEquals(BigInteger.ONE, productDTO.getId());
        assertEquals("Shirt", productDTO.getName());
    }

    @Test
    public void addProduct() {
        ProductDTO productToAdd = ProductDTO.builder().withId(BigInteger.ONE).withName("Shirt").withDescription("Random Cool Shirt")
                .withBrand("testBrand").withCategory("testCategory").withCode("testCode").withColor("testColor")
                .withGender("testGender").withImage("testImagePath").withPrice(200).withSize("testSize")
                .withType("testType").build();

        int returnValue = productService.addProduct(productToAdd);

        verify(productController, times(1)).addProduct(productToAdd);
        assertEquals(1, returnValue);
    }
}