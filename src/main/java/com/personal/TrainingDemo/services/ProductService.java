package com.personal.TrainingDemo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.personal.TrainingDemo.beans.Product;

@Service
public class ProductService {

	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

	private List<Product> productsList = new ArrayList<>(
			Arrays.asList(new Product("3"), new Product("2"), new Product("1")));

	public List<Product> getAllProducts() {
		logger.trace("Inside getAllProducts()");

		return productsList;
	}

	/**
	 * Get product by product ID.
	 * 
	 * @param id
	 * @return Product
	 */
	public Product getProduct(String id) {
		logger.trace("Inside getProduct(String id)");

		try {
			if (id == null) {
				throw new NullPointerException("input ID null");
			}

			if (productsList == null) {
				throw new NullPointerException("productsList null");
			}

			Optional<Product> optional = productsList.stream().filter(product -> product.getId().equals(id))
					.findFirst();
			if (optional.isPresent())
				return optional.get();

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return null;
	}

	public int addProduct(Product product) {
		logger.trace("Inside addProduct(Product product)");

		try {
			if (product == null) {
				throw new NullPointerException("input product null");
			}
			
			if(productsList == null) {
				throw new NullPointerException("productsList null");
			}
			
			if (getProduct(product.getId()) == null) {
				productsList.add(product);
				return 0;
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return 1;
	}

}
