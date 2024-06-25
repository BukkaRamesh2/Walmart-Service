package com.walmart.service;


import java.util.List;

import com.walmart.model.Customer;
import com.walmart.model.Payments;

public interface PaymentsService {
    Payments savePayment(Payments payment);
    Payments getPaymentById(Long paymentId);
    List<Payments> getAllPayments();
    Payments updatePayment(Payments payment, Long paymentId);
    void deletePayment(Long paymentId);
}