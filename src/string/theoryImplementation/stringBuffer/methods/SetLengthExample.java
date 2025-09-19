package string.theoryImplementation.stringBuffer.methods;

public class SetLengthExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.setLength(5);  // Truncate to "Hello"
        System.out.println("StringBuffer after setLength(5): " + sb);  // Output: Hello
    }
}
