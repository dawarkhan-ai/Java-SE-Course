package controlStructures.selectionStatements;

// Example of if-else-if ladder
public class IfElseIfExample {
    public static void main(String[] args) {
        int marks = 72;

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }

        System.out.println("Program Ended.");
    }
}

