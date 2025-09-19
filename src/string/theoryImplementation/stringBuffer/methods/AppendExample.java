package string.theoryImplementation.stringBuffer.methods;

public class AppendExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("Appended StringBuffer: " + sb);  // Output: Hello World
    }
}
