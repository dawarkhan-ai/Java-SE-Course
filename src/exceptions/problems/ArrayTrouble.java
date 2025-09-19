package exceptions.problems;

import java.util.Scanner;

public class ArrayTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Enter any index number to print element of an array of size 5");
        int index = sc.nextInt();

        try {
            System.out.println(arr[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
