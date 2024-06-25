
package com.walmart.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.walmart.exception.NoSuchCustomerExistsException;
import com.walmart.model.ErrorResponse;
import com.walmart.model.Payments;
import com.walmart.service.CustomerService;
import com.walmart.service.PaymentsService;

@RestController
@RequestMapping("/payments")
public class PaymentsController {
	
	

	@Autowired
	private PaymentsService paymentsService;

	// Payment Endpoints
	@PostMapping("/payment/save")
	public ResponseEntity<Payments> savePayment(@RequestBody Payments payment) {
		payment.message(); // The output will be: this message is from Payments class
		return new ResponseEntity<>(paymentsService.savePayment(payment), HttpStatus.CREATED);
	}

	@GetMapping("/payment/getById/{paymentId}")
	public ResponseEntity<Payments> getPaymentById(@PathVariable("paymentId") Long paymentId) {
		return new ResponseEntity<>(paymentsService.getPaymentById(paymentId), HttpStatus.OK);
	}

	@GetMapping("/payment/getAllPayments")
	public List<Payments> getAllPayments() {
		return paymentsService.getAllPayments();
	}

	@PutMapping("/payment/update/{paymentId}")
	public ResponseEntity<Payments> updatePayment(@RequestBody Payments payment,
			@PathVariable("paymentId") long paymentId) {
		return new ResponseEntity<>(paymentsService.updatePayment(payment, paymentId), HttpStatus.OK);
	}

	@DeleteMapping("/payment/delete/{paymentId}")
	public ResponseEntity<String> deletePayment(@PathVariable("paymentId") Long paymentId) {
		paymentsService.deletePayment(paymentId);
		return new ResponseEntity<>("Payment deleted Successfully.", HttpStatus.OK);
	}

	@ExceptionHandler(value = NoSuchCustomerExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorResponse handleCustomerAlreadyExistsException(NoSuchCustomerExistsException ex) {
		return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
	}
}


