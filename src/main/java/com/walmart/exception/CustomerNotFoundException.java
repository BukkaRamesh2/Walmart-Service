package com.walmart.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class CustomerNotFoundException extends Exception {
    
	
	private static final long serialVersionUID = 9039305056770118457L;

	public CustomerNotFoundException(String message) {
        super(message);
    }
	
	//@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(CustomerNotFoundException.class)
    public Map<String, String> handleUserNotFoundException(CustomerNotFoundException exception) {
        Map<String, String> map =  new HashMap<>();
        map.put("errorMessage", exception.getMessage());
        return map;
    }

}