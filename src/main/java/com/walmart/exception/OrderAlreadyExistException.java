package com.walmart.exception;

public class OrderAlreadyExistException extends RuntimeException{

    private String message;

    public OrderAlreadyExistException(String message){
        super(message);
        this.message = message;
    }
}
