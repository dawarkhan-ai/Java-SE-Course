package exceptions.theoryImplementation.types.builtIn.unchecked;

public class IllegalArgumentExceptionExample {
    public static void printSquareRoot(int num) {
        if (num < 0)
            throw new IllegalArgumentException("Negative number not allowed");
        System.out.println(Math.sqrt(num));
    }

    public static void main(String[] args) {
        printSquareRoot(-25);  // Illegal argument
    }
}
