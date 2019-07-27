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

import com.personal.TrainingDemo.beans.Order;
import com.personal.TrainingDemo.services.OrderService;

@RestController
public class OrderController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orders")
	public List<Order> findAllOrders() {
		logger.trace("Inside findAllOrders()");
		return orderService.getAllOrders();
	}
	
	@GetMapping("/orders/{id}")
	public Order findOrder(@PathVariable(name="id") String orderId) {
		logger.trace("Inside findOrder()");
		return orderService.getOrder(orderId);
	}
	
	@PostMapping("/orders")
	public int addOrder(@RequestBody Order order) {
		logger.trace("Inside addOrder()");
		return orderService.addOrder(order);
	}
}
