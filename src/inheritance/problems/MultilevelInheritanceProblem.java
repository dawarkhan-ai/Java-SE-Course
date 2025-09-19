/*package inheritance.problems;

class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void showDetails() {
        System.out.println("The max. speed of Vehicle is: " + speed + "km/hr");
    }

}

class Car extends Vehicle {
    String carModel;

    Car(int speed, String carModel) {
        super(speed);
        this.carModel = carModel;
    }

    void showDetails() {
        super.showDetails();

        System.out.println("The carModel named is: " + carModel);

    }
}

class ElectricCar extends Car {
    int batteryLife;

    ElectricCar(int speed, String carModel, int batteryLife) {
        super(speed, carModel);
        this.batteryLife = batteryLife;
    }

    void showDetails() {
        super.showDetails();

        System.out.println("Battery Life of EV car is " + batteryLife + "hr");
    }
}

public class MultilevelInheritanceProblem {
    public static void main(String[] args) {
        ElectricCar c1 = new ElectricCar(100, "OLA", 10);

        c1.showDetails();
    }
}
*/