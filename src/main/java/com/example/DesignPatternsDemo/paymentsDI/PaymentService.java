package com.example.DesignPatternsDemo.paymentsDI;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final Map<String, PaymentStrategy> strategies;

    @Autowired
    public PaymentService(Map<String, PaymentStrategy> strategies){
        this.strategies = strategies;
    }

    public void processPayment(double amount, String method){
        PaymentStrategy strategy = strategies.get(method);
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            throw new IllegalArgumentException("No payment method found: " + method);
        }
    }
}
