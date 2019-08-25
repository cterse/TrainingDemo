package com.personal.trainingdemo.repositories;

import com.personal.trainingdemo.entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String> {
}
