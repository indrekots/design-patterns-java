package io.indrek.designpatterns.specializedobserver;

public class HallwayDisplay implements Observer {

    private int peopleInSpace;
    private Subject subject;

    public HallwayDisplay(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(int state) {
        peopleInSpace = state;
        display();
    }

    public void display() {
        System.out.println("People in space right now: " + peopleInSpace);
    }
}

