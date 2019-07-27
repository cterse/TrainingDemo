package com.personal.TrainingDemo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.personal.TrainingDemo.beans.Order;

@Service
public class OrderService {

	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

	private List<Order> ordersList = new ArrayList<>(Arrays.asList(new Order("1"), new Order("2")));

	public List<Order> getAllOrders() {
		logger.trace("Inside getOrdersList()");
		return this.ordersList;
	}
	
	/**
	 * Get order by order id
	 * @param id
	 * @return Order
	 */
	public Order getOrder(String id) {
		logger.trace("Inside getOrder()");

		try {
			if (id == null) {
				throw new NullPointerException("input ID null");
			}

			if (ordersList == null) {
				throw new NullPointerException("ordersList null");
			}

			Optional<Order> optionalOrder = ordersList.stream().filter(order -> order.getId().equals(id)).findFirst();
			if (optionalOrder.isPresent())
				return optionalOrder.get();

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return null;
	}
	
	/**
	 * Add order if not already present
	 * @param order
	 * @return int
	 */
	public int addOrder(Order order) {
		logger.trace("Inside addOrder()");
		try {
			if (order == null) {
				throw new NullPointerException("Input order null");
			}

			if (ordersList == null) {
				throw new NullPointerException("ordersList null");
			}

			if (getOrder(order.getId()) == null) {
				ordersList.add(order);
				return 0;
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return 1;
	}

}
