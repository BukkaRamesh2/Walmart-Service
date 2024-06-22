package com.walmart.exception;

import com.walmart.model.Order;


public class OrderNotFoundException extends RuntimeException{

    private String message;

    public OrderNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
