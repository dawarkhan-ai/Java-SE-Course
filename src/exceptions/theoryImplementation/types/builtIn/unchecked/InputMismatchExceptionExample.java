package exceptions.theoryImplementation.types.builtIn.unchecked;

import java.util.*;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();  // If user enters non-integer (e.g., "abc"), exception occurs
    }
}
