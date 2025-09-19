package controlStructures.problems;

class CircleUtility {
    // Constant for PI
    static final double PI = 3.14;

    // Static method to calculate area
    static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    // Static method to calculate and return circumference
    static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
}

public class CalculateCircleAreaAndCircumference {
    public static void main(String[] args) {
        double r1 = 5.0;
        double r2 = 10.0;

        System.out.println("Area of Circle 1: " +  CircleUtility.calculateArea(r1) );
        System.out.println("Circumference of Circle 1: " + CircleUtility.calculateCircumference(r1));

        System.out.println("Area of Circle 2: " +  CircleUtility.calculateArea(r2) );
        System.out.println("Circumference of Circle 2: " + CircleUtility.calculateCircumference(r2));


    }
}
