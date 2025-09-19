package inheritance.problems;

class Employee {
    String name;
    int id;
    float salary;

    public Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {
    float bonus;

    public Manager(String name, int id, float salary, float bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    float calculateBonus() {
        return (bonus / 100) * salary;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Manager Bonus Percentage: " + bonus + "%");
        System.out.println("Calculated Bonus: " + calculateBonus());
    }

}

public class CalculateManagerBonus {
    public static void main(String[] args) {
        Manager manager = new Manager("Dawar Khann", 101, 50000.00f, 10.00f);

        manager.displayManagerDetails();
    }
}
