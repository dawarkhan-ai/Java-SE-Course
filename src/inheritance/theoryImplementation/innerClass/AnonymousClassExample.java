package inheritance.theoryImplementation.innerClass;

abstract class Person {
    abstract void greet();
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Person p = new Person() {
            void greet() {
                System.out.println("Hello from anonymous class");
            }
        };
        p.greet(); // Output: Hello from anonymous class
    }
}
