package exceptions.theoryImplementation.types.builtIn.unchecked;

import java.util.Scanner;

public class IllegalStateExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        sc.nextLine();  // Scanner is closed, illegal state
    }
}
