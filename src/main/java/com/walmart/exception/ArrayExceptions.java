package com.walmart.exception;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ArrayExceptions
{
    @ExceptionHandler (ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<ErrorResponse> handleArrayException(ArrayIndexOutOfBoundsException e)
    {
    	ErrorResponse er = new ErrorResponse
    			{
    		e.getMessage();
    			};
    }
	
	public ArrayExceptions(String message)
    {
    	super();
    }
}
