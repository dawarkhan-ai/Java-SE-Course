package string.theoryImplementation.stringBuilder.create;

public class StringBuilderConstructorExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();  // Empty StringBuilder with default capacity
        System.out.println("StringBuilder sb1: " + sb1);  // Output: (empty)

        // Adding content to sb1
        sb1.append("World");
        System.out.println("sb1 after append: " + sb1);  // Output: World
    }
}

