package exceptions.problems;

import java.util.Scanner;

public class DivideAndHandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 1 more any integer number: ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("The division result of these two input numbers are: " + result);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
