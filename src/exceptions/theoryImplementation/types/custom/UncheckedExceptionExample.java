package exceptions.theoryImplementation.types.custom;

class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}

public class UncheckedExceptionExample {
    public static void divide(int a, int b) {
        if(b==0) {
            throw new MyUncheckedException("Cannot divide by zero!");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        divide(10,0);
    }
}
