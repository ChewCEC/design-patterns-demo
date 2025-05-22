package com.example.DesignPatternsDemo.observer;

public class EmailObserver implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Sms sent for the event: " + message);
    }
}
