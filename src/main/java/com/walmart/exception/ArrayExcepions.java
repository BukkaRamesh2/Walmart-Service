package com.walmart.exception;

import java.time.LocalDateTime;

import org.apache.catalina.valves.ErrorReportValve;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ArrayExcepions{
	
	 @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> handleResourceNotFoundException(Exception ex) {
	      
	        return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
	    }
	
	

}
