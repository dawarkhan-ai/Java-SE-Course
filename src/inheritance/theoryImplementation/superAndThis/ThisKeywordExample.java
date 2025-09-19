package inheritance.theoryImplementation.superAndThis;

class Vehicle {
    String type;

    Vehicle() {
        this("Unknown");
    }

    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle type: " + this.type);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
    }
}
