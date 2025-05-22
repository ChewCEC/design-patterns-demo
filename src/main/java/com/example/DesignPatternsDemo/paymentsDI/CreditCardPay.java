package com.example.DesignPatternsDemo.paymentsDI;

import org.springframework.stereotype.Component;

@Component("creditCardPay")
public class CreditCardPay implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
