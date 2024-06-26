package com.walmart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductNotFoundException{

	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorResponse> handleProductNotFoundException(ProductException e) {
		ErrorResponse err = new ErrorResponse(e.getMessage());
		return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
	}

}
