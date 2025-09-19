package string.theoryImplementation.stringBuilder.methods;

public class ReplaceExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(6, 11, "Java");
        System.out.println("StringBuilder after replace: " + sb);  // Output: Hello Java
    }
}
