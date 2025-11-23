package org.openjfx.EECS_3311_Project.model;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String eventType) {
        for (Observer obs : new ArrayList<>(observers)) {
            obs.update(this, eventType);
        }
    }

    public void enter() {
        System.out.println("Scanner: detected ENTER");
        notifyObservers("enter");
    }

    public void exit() {
        System.out.println("Scanner: detected EXIT");
        notifyObservers("exit");
    }
}
