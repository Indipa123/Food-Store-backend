package com.example.Payment.service;

import com.example.Payment.data.Payment;
import com.example.Payment.data.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Service

public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment initiatePayment(Double amount) {
        // Simulate payment processing with a mock payment gateway
        // Replace this with actual integration with a payment gateway
        String transactionId = generateTransactionId();
        String status = "PENDING"; // Initial status

        // Simulate a successful payment with a random chance of failure
        boolean paymentSuccess = (Math.random() < 0.9); // 90% chance of success

        if (paymentSuccess) {
            status = "SUCCESS";
        } else {
            status = "FAILED";
        }

        // Create a new Payment entity and save it to the database
        Payment payment = new Payment();
        payment.setAmount(amount);
        payment.setTransactionId(transactionId);
        payment.setStatus(status);
        return paymentRepository.save(payment);
    }
    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id)
                .orElseThrow(() -> new  RuntimeException("Payment not found"));
    }
    // Helper method to generate a random transaction ID
    private String generateTransactionId() {
        // Generate timestamp in the format "yyyyMMddHHmmss"
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        // Generate a random 4-digit number
        String randomNumber = String.format("%04d", new Random().nextInt(10000));

        // Concatenate timestamp and random number to create the transaction ID
        return timestamp + randomNumber;
    }

}
