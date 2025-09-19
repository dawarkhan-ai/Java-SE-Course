package inheritance.problems;

class Engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}

class Car {
    Engine e;

    Car(Engine e) {
        this.e = e;
    }

    void start() {
        e.start();
        System.out.println("Car is starting...");
    }
}

public class AvI {
    public static void main(String[] args) {
        Engine e = new Engine();

        Car Toyota = new Car(e);

        Toyota.start();
    }
}
