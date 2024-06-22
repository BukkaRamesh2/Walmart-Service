package com.walmart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductNotFoundException extends Exception{
	
	 public ProductNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}

	@ExceptionHandler(ProductNotFoundException.class)
	    public ResponseEntity<ErrorResponse> handleProductNotFoundException(ProductNotFoundException e) {
	        ErrorResponse err = new ErrorResponse(e.getMessage());
	        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
	    }


}
