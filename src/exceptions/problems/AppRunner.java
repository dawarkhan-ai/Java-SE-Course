package exceptions.problems;

// Step 1: AppRunner class with multiple methods that may throw exceptions
public class AppRunner {

    public void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Division Result: " + result);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void parseNumber(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println("Parsed Number: " + num);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void findClass(String className) {
        try {
            Class.forName(className);
            System.out.println("Class found: " + className);
        } catch (Exception e) {
            handleException(e);
        }
    }

    // Step 2: Centralized exception handling method
    public void handleException(Exception e) {
        System.out.println("Handled Exception: " + e.getClass().getSimpleName());
        System.out.println("Message: " + e.getMessage());
    }

    // Step 3: Main method to run scenarios
    public static void main(String[] args) {
        AppRunner app = new AppRunner();

        // Multiple scenarios
        app.divideNumbers(10, 0);              // ArithmeticException
        app.parseNumber("abc");                // NumberFormatException
        app.findClass("non.existing.Class");   // ClassNotFoundException

        System.out.println("All operations attempted.");
    }
}

