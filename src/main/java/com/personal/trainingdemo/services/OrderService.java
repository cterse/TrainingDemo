package com.personal.trainingdemo.services;

import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.entities.Order;
import com.personal.trainingdemo.repositories.OrderRepository;
import com.personal.trainingdemo.utils.DTOEntityMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    private final OrderRepository orderRepository;
    private final DTOEntityMapping mapper;

    @Autowired
    public OrderService(OrderRepository orderRepository, DTOEntityMapping mapper) {
        this.orderRepository = orderRepository;
        this.mapper = mapper;
    }

    public List<OrderDTO> getAllOrders() {
        logger.trace("Inside getOrdersList()");

        List<OrderDTO> orderDTOS = new ArrayList<>();
        orderRepository.findAll().forEach(order -> orderDTOS.add(mapper.getOrderDTOFromEntity(order)));

        return orderDTOS;
    }

    /**
     * Get order by order id
     *
     * @param id ID of the required order.
     * @return Order
     */
    public OrderDTO getOrder(BigInteger id) {
        logger.trace("Inside getOrder()");

        try {
            if (id == null) {
                throw new NullPointerException("input ID null");
            }

            Optional<Order> orderOptional = orderRepository.findById(id);
            if (orderOptional.isPresent()) {
                return mapper.getOrderDTOFromEntity(orderOptional.get());
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    /**
     * Add order if not already present
     *
     * @param orderDTO The order to be added to database.
     * @return int
     */
    public int addOrder(OrderDTO orderDTO) {
        logger.trace("Inside addOrder()");
        try {
            if (orderDTO == null) {
                throw new NullPointerException("Input order null");
            }

            orderRepository.save(mapper.getOrderEntityFromDTO(orderDTO));

            return 0;

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return 1;
    }

}
