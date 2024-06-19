package com.walmart.service;

import java.util.List;

import com.walmart.model.Customer;
import com.walmart.model.Order;

public interface OrderService {

    public double calculateTotal(Order order);

    public int getDiscount(Order order);

    String saveOrder(Order order);

    Customer getCustomerById(Long orderId);

    Order getOrderById(Long orderId);

    List<Order> getAllOrders();
}
