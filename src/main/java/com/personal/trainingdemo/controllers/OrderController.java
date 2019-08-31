package com.personal.trainingdemo.controllers;

import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.services.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public List<OrderDTO> findAllOrders() {
        logger.trace("Inside findAllOrders()");
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public OrderDTO findOrder(@PathVariable(name = "id") BigInteger orderId) {
        logger.trace("Inside findOrder()");
        return orderService.getOrder(orderId);
    }

    @PostMapping("/orders")
    public int addOrder(@RequestBody OrderDTO order) {
        logger.trace("Inside addOrder()");
        return orderService.addOrder(order);
    }
}
