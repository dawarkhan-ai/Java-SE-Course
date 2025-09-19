package exceptions.problems;

import java.util.Scanner;
import java.io.IOException;

class BankException extends RuntimeException {
    BankException(String message) {
        super(message);
    }
}

public class CustomBankException {
    static double balance = 1000;

    public static void main (String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter amount to withdraw");
            double amount = sc.nextDouble();
            try {
                withdraw(amount);
            } catch (BankException e) {
                System.out.println("Exception caugh: " +e.getMessage());
            }
        }
    }

    private static void withdraw(double amount) {
        if(amount > balance) {
            throw new BankException("entered amount is greater than your balance!");
        }
        System.out.println("amount withdrawing...");
    }
}
