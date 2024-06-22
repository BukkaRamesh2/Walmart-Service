package com.walmart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HandleOrderAlreadyExistsException {

    @ExceptionHandler(value = OrderAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErrorResponse handleException(OrderAlreadyExistException ex) {
        return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
    }

}
