package com.example.DesignPatternsDemo.paymentsDI;

import org.springframework.stereotype.Component;

@Component("payPalPay")
public class PayPalPay implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + String.format("%.2f", amount) + " using PayPal.");
    }
    
}
