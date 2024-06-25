package com.walmart.exception;
import com.walmart.model.Payments;


public class PaymentNotFoundException extends RuntimeException {
	
    private static final long serialVersionUID = -179578408631221928L;
    
	private String message;

    public PaymentNotFoundException() {}

    public PaymentNotFoundException(String msg) {
        super(msg);
        this.message = msg;
    }
}
