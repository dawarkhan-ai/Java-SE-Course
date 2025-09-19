package controlStructures.readingConsoleInput;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Reading integer input
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();

        // Reading string input
        System.out.println("Enter a name: ");
        String name = scanner.next();  // This is to read the rest of the line after entering a number

        System.out.println("Entered integer: " + num);
        System.out.println("Entered name: " + name);

        scanner.close();  // Close the scanner
    }
}

