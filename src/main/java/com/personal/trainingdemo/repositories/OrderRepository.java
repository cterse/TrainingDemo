package com.personal.trainingdemo.repositories;

import com.personal.trainingdemo.entities.Order;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface OrderRepository extends CrudRepository<Order, BigInteger> {
}
