package inheritance.problems;

class Person {
    String name;
    int age;
}

class Student extends Person {
    int roll_no;

    void displayStudentDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student roll no.: " + roll_no);
    }

    Student(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }
}

public class CreateStudentfromPerson {
    public static void main(String[] args) {
        Student s1 = new Student("Dawar", 19, 35);
        s1.displayStudentDetails();
    }
}
