package com.personal.TrainingDemo.repositories;


import org.springframework.data.repository.CrudRepository;

import com.personal.TrainingDemo.beans.Product;

public interface ProductRepository extends CrudRepository<Product, String> {}
