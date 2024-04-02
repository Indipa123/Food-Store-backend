package com.example.Payment.service;

import com.example.Payment.data.Payment;

public interface PaymentService {
    Payment initiatePayment(Double amount);
    Payment getPaymentById(Long id);
}
