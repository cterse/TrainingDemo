package com.personal.trainingdemo.controllers;

import com.personal.trainingdemo.beans.ProductDTO;
import com.personal.trainingdemo.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@GetMapping("/products")
	public List<ProductDTO> findAllProducts() {
		logger.trace("Inside findAllProducts()");
		return productService.getAllProducts();
	}

	@GetMapping("products/{id}")
	public ProductDTO findProduct(@PathVariable BigInteger id) {
		logger.trace("Inside findProduct()");
		return productService.getProduct(id);
	}

	@PostMapping("/products")
	public int addProduct(@RequestBody ProductDTO product) {
		logger.trace("Inside addProduct()");
		return productService.addProduct(product);
	}

}
