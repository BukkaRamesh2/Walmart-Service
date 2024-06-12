package com.walmart.service;

import com.walmart.model.Order;

public interface OrderService {

    public double calculateTotal(Order order);

    public int getDiscount(Order order);
}
