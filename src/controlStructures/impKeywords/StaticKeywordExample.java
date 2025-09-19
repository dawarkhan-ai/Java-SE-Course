package controlStructures.impKeywords;

public class StaticKeywordExample {
    static int count = 0;  // static variable

    // Static method
    static void increment() {
        count++;
    }

    // Static block for initialization
    static {
        System.out.println("Class Loaded");
        count = 100;  // initializing static variable
    }

    public static void main(String[] args) {
        increment();
        System.out.println("Count: " + count);  // Output: Count: 101
    }
}

