package packages.problems.modularStudentManageSystem.app;

import packages.problems.modularStudentManageSystem.data.Student;
import packages.problems.modularStudentManageSystem.logic.Calculator;

public class MainApp {
    public static void main(String[] args) {
        int[] marks = {75, 65, 80, 90, 85};
        Student student = new Student("Alice", marks);

        Calculator calc = new Calculator();
        boolean passed = calc.isPassed(student);

        System.out.println(student.name + (passed ? " has passed." : " has failed."));
    }
}
