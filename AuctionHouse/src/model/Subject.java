package model;

import java.util.LinkedList;

public abstract class Subject {

    private LinkedList<Observer> observers = new LinkedList<>();

    public void addObserver(Observer b){
        observers.add(b);
    }

    public void notifyObservers(Subject observable, double bid){
        for(Observer o: observers){
            o.update(observable,bid);
        }
    }
}
