package com.walmart.exception;

public class ErrorResponse {
    private String message;

    private int StatusCode;

    
    public ErrorResponse(String message) {
      
        this.message = message;
    }
    
    public ErrorResponse(int StatusCode, String message) {
        this.StatusCode = StatusCode;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
