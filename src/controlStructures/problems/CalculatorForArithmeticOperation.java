package controlStructures.problems;

import java.util.Scanner;

public class CalculatorForArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer number:");
        int num1 = sc.nextInt();

        System.out.println("Enter any other integer number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter operator symbol to perform operation: ");
        char op = sc.next().charAt(0);

        boolean flag = true;

        do{
            switch (op) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Result: " + (num1 / num2));
                    break;
            }
            System.out.println("Do you want to continue yes/no:");
            String str = sc.next();
            str.toLowerCase();
            if(str.equals("no")) {
                flag = false;
            }
        }while(flag == true);

        sc.close();
    }
}
