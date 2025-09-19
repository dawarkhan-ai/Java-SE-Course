package packages.problems.modularStudentManageSystem.data;

public class Student {
    public String name;
    private int[] marks;

    public Student (String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculatePercentage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (total / (double) marks.length);
    }
}
