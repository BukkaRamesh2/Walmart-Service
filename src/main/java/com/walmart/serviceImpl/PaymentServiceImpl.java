package com.walmart.serviceImpl;


import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.exception.PaymentNotFoundException;
import com.walmart.model.Payments;
import com.walmart.repository.PaymentsRepository;
import com.walmart.service.PaymentsService;

@Service
public class PaymentServiceImpl implements PaymentsService {

    @Autowired
    private PaymentsRepository paymentsRepository;

    private HashMap<Long, Payments> paymentsMap = new HashMap<>();

    @Override
    public Payments savePayment(Payments payment) {
       
        paymentsMap.put(payment.getId(), payment);
        return paymentsRepository.save(payment);
    }

    @Override
    public Payments getPaymentById(Long paymentId) {
        
        Payments payment = paymentsMap.get(paymentId);
        if (payment == null) {
         
            payment = paymentsRepository.findById(paymentId).orElse(null);
        }
        return payment;
    }

    @Override
    public List<Payments> getAllPayments() {
        
        List<Payments> paymentsList = paymentsRepository.findAll();
        
        
        paymentsList.forEach(payment -> paymentsMap.put(payment.getId(), payment));
        return paymentsList;
    }

    @Override
    public Payments updatePayment(Payments payment, Long paymentId) {
        Payments existingPayment = paymentsMap.get(paymentId);
        if (existingPayment == null) {
            existingPayment = paymentsRepository.findById(paymentId).orElse(null);
        }
        if (existingPayment != null) {
            existingPayment.setCustomerId(payment.getCustomerId());
            existingPayment.setAmount(payment.getAmount());
            existingPayment.setPaymentDate(payment.getPaymentDate());
            existingPayment.setPaymentMethod(payment.getPaymentMethod());
            existingPayment.setStatus(payment.getStatus());
            
            paymentsMap.put(paymentId, existingPayment); 
            return paymentsRepository.save(existingPayment); 
        } else {
            throw new PaymentNotFoundException("There is no payment with id " + paymentId);
        }
    }

    @Override
    public void deletePayment(Long paymentId) {
        paymentsMap.remove(paymentId);
        paymentsRepository.deleteById(paymentId); 
    }

    @Override
    public Payments saveOrUpdatePayment(Payments payment) {
        if (paymentsMap.containsKey(payment.getId())) {
            return updatePayment(payment, payment.getId());
        } else {
            return savePayment(payment);
        }
    }

    public Set<Payments> getUniquePayments() {
        return new HashSet<>(paymentsMap.values());
    }
}
