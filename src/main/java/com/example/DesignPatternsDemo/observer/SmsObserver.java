package com.example.DesignPatternsDemo.observer;

public class SmsObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Sms sent for the event: " + message);
    }
}
