
package com.walmart.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class TransactionNotFoundException extends Exception {
    
	
	private static final long serialVersionUID = 9039305056770118457L;

	public TransactionNotFoundException(String message) {
        super(message);
    }
	
	//@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(TransactionNotFoundException.class)
    public Map<String, String> handleUserNotFoundException(TransactionNotFoundException exception) {
        Map<String, String> map =  new HashMap<>();
        map.put("errorMessage", exception.getMessage());
        return map;
    }

}