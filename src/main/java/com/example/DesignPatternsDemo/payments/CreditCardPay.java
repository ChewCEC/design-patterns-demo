package com.example.DesignPatternsDemo.payments;

public class CreditCardPay implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
