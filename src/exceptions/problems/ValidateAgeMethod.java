package exceptions.problems;

import java.util.Scanner;

public class ValidateAgeMethod {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        try(Scanner sc = new Scanner(System.in)){
            int age = sc.nextInt();
            validateAge(age);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

     private static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("You can't vote because your age is below 18");
        }
        System.out.println("You can give vote.");
    }
}
