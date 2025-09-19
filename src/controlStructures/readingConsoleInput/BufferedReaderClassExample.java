package controlStructures.readingConsoleInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderClassExample {
    public static void main(String[] args) {
        try {
            // Create BufferedReader object
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Reading string input
            System.out.print("Enter your favorite color: ");
            String color = reader.readLine();

            System.out.println("Your favorite color is: " + color);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
