package com.personal.trainingdemo.repositories;

import com.personal.trainingdemo.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface ProductRepository extends CrudRepository<Product, BigInteger> {
}
