package com.walmart.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.exception.PaymentNotFoundException;
import com.walmart.model.Customer;
import com.walmart.model.Payments;
import com.walmart.repository.PaymentsRepository;
import com.walmart.service.CustomerService;
import com.walmart.service.PaymentsService;
//hi there
@Service
public class PaymentServiceImpl implements PaymentsService {

	@Autowired
	private PaymentsRepository paymentsRepository;

	@Autowired
     CustomerService custservice;
	@Override
	public Payments savePayment(Payments payment)

	{
	
		
	return paymentsRepository.save(payment);
	}

	@Override
	public Customer getPaymentById(Long paymentId) {
		
		return paymentsRepository.findById(paymentId).orElse(null);
	}

	@Override
	public List<Customer> getAllPayments() {
		return paymentsRepository.findAll();
	}

	@Override
	public Payments updatePayment(Payments payment, Long paymentId) {
	    Payments existingPayment = paymentsRepository.findById(paymentId).orElse(null);
	    if (existingPayment != null) {
	        existingPayment.setCustomerId(payment.getCustomerId());
	        existingPayment.setAmount(payment.getAmount());
	        existingPayment.setPaymentDate(payment.getPaymentDate());
	        existingPayment.setPaymentMethod(payment.getPaymentMethod());
	        existingPayment.setStatus(payment.getStatus());
	        
	        paymentsRepository.save(existingPayment); // Save the updated payment back to the repository
	        return existingPayment; // Return the updated payment
	    } else {
	        throw new PaymentNotFoundException("There is no payment with id " + paymentId);
	    }
	}


	@Override
	public void deletePayment(Long paymentId) {
		paymentsRepository.deleteById(paymentId);
	}
}
