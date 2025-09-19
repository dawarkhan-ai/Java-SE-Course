package controlStructures.impKeywords;

class Person {
    String name;

    // Constructor using 'this' to reference instance variable
    public Person(String name) {
        this.name = name;  // 'this' helps to refer to the instance variable
    }

    // Method displaying instance variable using 'this'
    public void display() {
        System.out.println("Name: " + this.name);  // 'this' is optional but makes it clear
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Person person = new Person("John");
        person.display();  // Output: Name: John
    }
}

