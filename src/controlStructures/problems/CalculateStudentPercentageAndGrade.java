package controlStructures.problems;

import java.util.Scanner;

public class CalculateStudentPercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your Roll No.:");
        int rollNo = sc.nextInt();
        System.out.println("Enter your Java mark:");
        int JavaMark = sc.nextInt();
        System.out.println("Enter your Math mark:");
        int MathsMark = sc.nextInt();
        System.out.println("Enter your ADA mark:");
        int ADAMark = sc.nextInt();

        int total = 0;
        float percentage;

        // Calculating total marks and percentage
        total = JavaMark + MathsMark + ADAMark;
        percentage = ( (float)total / 450) * 100;

        System.out.printf("You have gotten %.2f %%" , percentage );
        System.out.printf(" and ");
        if(percentage >= 90) {
            System.out.printf("Grade A");
        } else if(percentage >= 75) {
            System.out.printf("Grade B");
        } else if(percentage >= 50) {
            System.out.printf("Grade C");
        } else if(percentage < 50) {
            System.out.printf("You are failed! Try next time");
        }

        sc.close();

    }
}
