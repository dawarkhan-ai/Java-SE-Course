package inheritance.problems;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {

     private final double PI = 3.14;

     double radius;

     Circle(double radius) {
         this.radius = radius;
     }


    double area() {
       return PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double l;
    double b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double area() {
        return l * b;
    }
}


public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("The Area of Circle named c1 is: " + c1.area());

        Rectangle r1 = new Rectangle(5, 3);
        System.out.println("The Area of r1 named rectangle is: " + r1.area());
    }
}
