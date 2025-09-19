package exceptions.problems;

import java.util.Scanner;

class InvalidEmailException extends RuntimeException {
    InvalidEmailException(String message) {
        super(message);
    }
}

public class ValidateEmailFormat {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your email id: ");
            String email = sc.nextLine();

            try{
                validateEmail(email);
            } catch(InvalidEmailException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void validateEmail(String email) {
        if ( !email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailException("entered invalid email");
        }
        System.out.println("Your entered email is valid.");
    }
}
