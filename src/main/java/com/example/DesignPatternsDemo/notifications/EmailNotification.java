package com.example.DesignPatternsDemo.notifications;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL]: "+ message);
    }
}
