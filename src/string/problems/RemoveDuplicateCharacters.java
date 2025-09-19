package string.problems;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String to remove duplciate character: ");
        String iStr = sc.nextLine();

        String oStr = removeDupChar(iStr);
        System.out.println("After removing duplicate characters new String will be: " + oStr);
    }

    static String removeDupChar(String iStr){
        boolean[] arr = new boolean[256];
        StringBuilder strB = new StringBuilder();

        for(int i = 0; i < iStr.length(); i++) {
            char c = iStr.charAt(i);

            if (!arr[c]) {
                arr[c] = true;
                strB.append(c);
            }
        }

        return strB.toString();
    }
}
