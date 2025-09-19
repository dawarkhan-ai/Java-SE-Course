package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        // Step 1: Clean and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Step 2: Length check
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Step 3: Convert to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare sorted arrays
        if (Arrays.equals(arr1,arr2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
