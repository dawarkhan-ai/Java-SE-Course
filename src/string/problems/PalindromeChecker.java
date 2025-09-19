package string.problems;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String to check whether it is Palidrome or not:");
        String pStr = sc.nextLine();
        System.out.println("Nice your input is taken of size: " + pStr.length());

        // Using self logic
        System.out.println("Checking........Through developer logic");
        checkPalidrome1(pStr);

        // Using reverse() method
        System.out.println("Checking........Through reverse method");
        checkPalidrome2(pStr);
    }

    public static void checkPalidrome1(String pStr1) {
        StringBuilder pStrB = new StringBuilder();

        for (int i = (pStr1.length() - 1); i >= 0; i-- ) {
            pStrB.append(pStr1.charAt(i));
        }
        String pStr2 = pStrB.toString();

        System.out.println("The input String is pallidrome: " + pStr1.equalsIgnoreCase(pStr2));
    }

    public static void checkPalidrome2(String pStr1) {
        StringBuilder pStrB = new StringBuilder(pStr1);
        String pStr2 = pStrB.reverse().toString();
        System.out.println("The input String is pallidrome: "  + pStr1.equalsIgnoreCase(pStr2));
    }
}
