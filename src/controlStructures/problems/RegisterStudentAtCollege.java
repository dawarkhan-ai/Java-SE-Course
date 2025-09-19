package controlStructures.problems;

class Student {
    int rollNumber;
    String name;
    String course;

    static final String COLLEGE_NAME = "Shri Shankaracharya Technical Campus";
    static int studentCount = 0;

    Student(int rollNumber, String name, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        studentCount++;
    }

    // Instance method to display student info
    void displayStudentInfo(){
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("College: " + COLLEGE_NAME);
        System.out.println("-----------------------------");
    }

    // Static method to return student count
    static int getStudentCount() {
        return studentCount;
    }
}

public class RegisterStudentAtCollege {
    public static void main(String[] args){
        Student s1 = new Student(35, "Dawar", "B-Tech");
        Student s2 = new Student(46, "Sabaj", "B-Tech");

        s1.displayStudentInfo();
        s2.displayStudentInfo();

        System.out.println(Student.getStudentCount() + " students registered in " + Student.COLLEGE_NAME);
    }
}
