package com.walmart.exception;


public class NoSuchCustomerExistsException extends RuntimeException {
	
    private static final long serialVersionUID = -179578408631221988L;
    
	private String message;

    public NoSuchCustomerExistsException() {}

    public NoSuchCustomerExistsException(String msg) {
        super(msg);
        this.message = msg;
    }
}