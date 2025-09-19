package inheritance.problems.specialProblems;

abstract class Employee {
    Employee() {
        System.out.println("Employee created");
    }

    abstract void calculateSalary();

}

interface Printable {
    void printDetails();
}

class Manager extends Employee implements Printable {
    Manager() {
        super();
    }

    void calculateSalary() {
        System.out.println("Manager salary is: 50000 Rs");
    }

    public void printDetails() {
        System.out.println("this is manager");
    }
}

class Developer  extends Employee implements Printable {
    Developer() {
        super();
    }

    void calculateSalary() {
        System.out.println("Developer salary is: 30000 Rs");
    }

    public void printDetails() {
        System.out.println("This is the Developer");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp;
        Printable p;

        emp = new Manager();
        p = (Printable)emp;
        p.printDetails();
        emp.calculateSalary();


        emp = new Developer();
        p = (Printable)emp;
        p.printDetails();
        emp.calculateSalary();
    }
}
