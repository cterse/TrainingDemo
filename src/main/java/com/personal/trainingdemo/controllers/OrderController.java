package com.personal.trainingdemo.controllers;

import java.util.List;

import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.entities.Order;
import com.personal.trainingdemo.services.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orders")
	public List<OrderDTO> findAllOrders() {
		logger.trace("Inside findAllOrders()");
		return orderService.getAllOrders();
	}
	
	@GetMapping("/orders/{id}")
	public OrderDTO findOrder(@PathVariable(name="id") String orderId) {
		logger.trace("Inside findOrder()");
		return orderService.getOrder(orderId);
	}
	
	@PostMapping("/orders")
	public int addOrder(@RequestBody OrderDTO order) {
		logger.trace("Inside addOrder()");
		return orderService.addOrder(order);
	}
}
