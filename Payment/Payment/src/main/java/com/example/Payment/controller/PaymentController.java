package com.example.Payment.controller;

import com.example.Payment.data.Payment;
import com.example.Payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")

public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public Payment initiatePayment(@RequestParam Double amount) {
        return paymentService.initiatePayment(amount);
    }
    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }



}
