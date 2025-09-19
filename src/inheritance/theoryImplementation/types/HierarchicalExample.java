package inheritance.theoryImplementation.types;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving...");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving...");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is moving...");
    }
}


public class HierarchicalExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        Bike bike = new Bike();
        bike.move();
    }
}
