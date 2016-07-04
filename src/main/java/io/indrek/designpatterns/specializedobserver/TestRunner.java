package io.indrek.designpatterns.specializedobserver;

public class TestRunner {

    public static void main(String[] args) {
        DataSource source = new DataSource();
        source.register(new HallwayDisplay(source));
        source.setPeopleInSpace(5);

        source.register(state -> System.out.println("New observer: people in space right now: " + state));
        source.setPeopleInSpace(10);
    }
}
