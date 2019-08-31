package com.personal.trainingdemo.controllers;

import com.personal.trainingdemo.beans.OrderDTO;
import com.personal.trainingdemo.services.OrderService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.math.BigInteger;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class OrderControllerTest {

    @Rule public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    private OrderService orderService;

    @InjectMocks private OrderController orderController;

    @Test
    public void findAllOrders() {
        OrderDTO orderDTO = OrderDTO.builder().withCurrency("testCurrency").withDate(new Date()).withId(BigInteger.ONE)
                .withOrderedProducts(null).withStatus("testStatus").withTotalAmount(500).build();
        when(orderService.getAllOrders()).thenReturn(Collections.singletonList(orderDTO));

        List<OrderDTO> allOrders = orderController.findAllOrders();

        verify(orderService, times(1)).getAllOrders();
        assertNotNull(allOrders);
        assertEquals(1, allOrders.size());
        assertEquals("testStatus", allOrders.get(0).getStatus());
    }

    @Test
    public void findOrder() {
        OrderDTO orderDTO = OrderDTO.builder().withCurrency("testCurrency").withDate(new Date()).withId(BigInteger.ONE)
                .withOrderedProducts(null).withStatus("testStatus").withTotalAmount(500).build();
        when(orderService.getOrder(any())).thenReturn(orderDTO);

        OrderDTO order = orderController.findOrder(BigInteger.ONE);

        verify(orderService, times(1)).getOrder(BigInteger.ONE);
        assertNotNull(order);
        assertEquals(orderDTO, order);
    }

    @Test
    public void addOrder() {
        OrderDTO orderDTO = OrderDTO.builder().withCurrency("testCurrency").withDate(new Date()).withId(BigInteger.ONE)
                .withOrderedProducts(null).withStatus("testStatus").withTotalAmount(500).build();
        when(orderService.addOrder(any())).thenReturn(0);

        int returnStatus = orderController.addOrder(orderDTO);

        verify(orderService, times(1)).addOrder(orderDTO);
        assertEquals(0, returnStatus);
    }
}