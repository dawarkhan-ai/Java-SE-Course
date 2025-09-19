package exceptions.problems;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter any integer number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter any string to convert in to integer");
        String str = sc.next();

       try {
           System.out.println("The result of entered two numbers is: " + result(num1, num2));
           System.out.println("The number format of input string is: " + Integer.parseInt(str));
       } catch(ArithmeticException e) {
           System.out.println(e.getMessage());
       } catch(NumberFormatException e) {
            System.out.println(e.getMessage());
       }
        sc.close();
    }

    static int result(int num1, int num2) {
        return num1 / num2;
    }

}
