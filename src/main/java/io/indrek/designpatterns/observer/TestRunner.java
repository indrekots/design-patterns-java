package io.indrek.designpatterns.observer;

public class TestRunner {

    public static void main(String[] args) {
        DataSource source = new DataSource();
        source.register(new HallwayDisplay(source));
        source.setPeopleInSpace(5);
    }
}
