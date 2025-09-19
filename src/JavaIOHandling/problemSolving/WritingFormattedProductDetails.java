package JavaIOHandling.problemSolving;

import java.io.*;

public class WritingFormattedProductDetails {
    public static void main(String[] args) {
        String productName = "RedmiA4 5G";
        double price = 85000.00;
        double discount = 10.00;

        try (PrintWriter pw = new PrintWriter("dependenciesFolder/forIO/PS5.txt")) {
            pw.println("Product Details:");
            pw.printf("Name: %s", productName);
            pw.printf("\nPrice: %.2f", price);
            pw.printf("\nDiscount: %.2f", discount);
            System.out.println("Successfully Done!");
        } catch (IOException e) {
            System.out.println("An error caught: " + e.getMessage());
        }
    }
}
