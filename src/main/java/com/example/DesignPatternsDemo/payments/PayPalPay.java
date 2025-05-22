package com.example.DesignPatternsDemo.payments;

public class PayPalPay implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + String.format("%.2f", amount) + " using PayPal.");
    }
    
}
