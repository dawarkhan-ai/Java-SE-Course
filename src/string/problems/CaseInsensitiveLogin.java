package string.problems;

import java.util.Scanner;

public class CaseInsensitiveLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "Md Dawar Khan";

        System.out.println("Enter your username:");
        String inputUsername = sc.nextLine();

        if (correctUsername.equalsIgnoreCase(inputUsername)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
