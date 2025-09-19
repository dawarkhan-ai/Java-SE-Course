package controlStructures.jumpingStatements;

public class ReturnVoidExample {
    public static void main(String[] args) {
        System.out.println("Start of main method");
        testMethod();
        System.out.println("End of main method");
    }

    static void testMethod() {
        System.out.println("Inside testMethod");
        if (true) {
            return;  // Exit method
        }
        System.out.println("This won't be printed.");
    }
}

