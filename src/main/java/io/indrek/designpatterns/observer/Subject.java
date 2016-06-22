package io.indrek.designpatterns.observer;

public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    int getState();
}
