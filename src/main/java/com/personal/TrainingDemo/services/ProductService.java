package com.personal.TrainingDemo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.personal.TrainingDemo.beans.Product;

@Service
public class ProductService {
	
	Product[] pl = {new Product("1"), 
			new Product("2"), 
			new Product("3")
			};
	private List<Product> productsList = new ArrayList(Arrays.asList(pl));
	
	public List<Product> getAllProducts() {
		return productsList;
	}
	
	public Product getProduct(String id) {
		if(productsList != null) {
			Optional<Product> optional = productsList.stream()
													.filter(product -> product.getId().equals(id))
													.findFirst();
			return optional.isPresent() ? optional.get() : null;
		}
		return null;
	}
	
	public int addProduct(Product product) {
		boolean productPresent = productsList.stream()
											.anyMatch(prod -> prod.getId().equals(product.getId()));
		if(productPresent) {
			return 1;
		} else {
			productsList.add(product);
			return 0;
		}
	}
	
}
