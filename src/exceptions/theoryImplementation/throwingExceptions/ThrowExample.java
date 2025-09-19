package exceptions.theoryImplementation.throwingExceptions;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);  // Attempting division by zero
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero error");  // Throwing exception manually
        }
        return a / b;
    }
}
