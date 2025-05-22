package com.example.DesignPatternsDemo.observer;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void registerUser(String username){
        System.out.println("username: "+username);
        notifyObservers(username);
    }

}
