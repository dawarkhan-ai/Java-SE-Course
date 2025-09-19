package string.theoryImplementation.stringBuilder.methods;

public class SetLengthExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.setLength(5);  // Truncate to "Hello"
        System.out.println("StringBuilder after setLength(5): " + sb);  // Output: Hello
    }
}
