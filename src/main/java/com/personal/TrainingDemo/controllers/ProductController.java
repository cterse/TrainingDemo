package com.personal.TrainingDemo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.TrainingDemo.beans.Product;
import com.personal.TrainingDemo.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@GetMapping("/products")
	public List<Product> findAllProducts() {
		logger.trace("Inside findAllProducts()");
		return productService.getAllProducts();
	}

	@GetMapping("products/{id}")
	public Product findProduct(@PathVariable String id) {
		logger.trace("Inside findProduct()");
		return productService.getProduct(id);
	}

	@PostMapping("/products")
	public int addProduct(@RequestBody Product product) {
		logger.trace("Inside addProduct()");
		return productService.addProduct(product);
	}

}
