package inheritance.theoryImplementation;

class Employee {
    Employee() {
        System.out.println("Employee constructor");
    }
}

class Manager extends Employee {
    Manager() {
        super(); // explicitly calling super class construtor if not called then java automatic called it
        System.out.println("Manager constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Manager mg = new Manager();
    }
}
