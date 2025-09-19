package controlStructures.jumpingStatements;

public class ReturnValueExample {
    public static void main(String[] args) {
        int result = addNumbers(10, 20);
        System.out.println("Result = " + result);
    }

    static int addNumbers(int a, int b) {
        return a + b;  // Return sum of a and b
    }
}

