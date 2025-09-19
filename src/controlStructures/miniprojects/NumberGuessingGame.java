package controlStructures.miniprojects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain = true;

        System.out.println(" Welcome to the Number Guessing Game!");

        while (playAgain) {
            int secretNumber = rand.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("\n I have selected a number between 1 and 100.");
            System.out.println("Can you guess it? ");

            while (guess != secretNumber) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("📉 Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("📈 Too high! Try again.");
                } else {
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                }
            }

            System.out.println("Do you want to play again? (yes/no): ");
            sc.nextLine();
            String response = sc.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing! See you again. ");
            }
        }

        sc.close();
    }
}