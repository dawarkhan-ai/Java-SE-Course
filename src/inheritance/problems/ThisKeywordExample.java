package inheritance.problems;

class Employees {
    String name;
    int id;
    double salary;

    Employees(String name, int id, double salary) {
        this.name = name;
        this.id = id;

        if(salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    void showEmployeeDetails() {
        System.out.println("Name of employee is: " + name);
        System.out.println("Id of employee is: " + id);
        System.out.println("Salary of employee is: " + salary);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Employees e1 = new Employees("Anushk", 1, 30000);
        e1.showEmployeeDetails();
    }
}
