package packages.problems.modularStudentManageSystem.logic;

import packages.problems.modularStudentManageSystem.data.Student;

public class Calculator  {
    public boolean isPassed(Student s) {
        double percent = s.calculatePercentage();
        return percent >= 40.0;
    }
}
