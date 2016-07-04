package io.indrek.designpatterns.specializedobserver;

import java.util.ArrayList;
import java.util.List;

public class DataSource implements Subject{

    private int peopleInSpace;
    private List<Observer> observers;

    public DataSource() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(peopleInSpace));
    }

    public void setPeopleInSpace(int n) {
        peopleInSpace = n;
        notifyObservers();
    }
}
