package controlStructures.jumpingStatements;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skip iteration when i is 3
            }
            System.out.println("i = " + i);
        }
        System.out.println("Loop Ended.");
    }
}

