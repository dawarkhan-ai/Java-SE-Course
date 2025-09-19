package string.theoryImplementation.stringBuffer.methods;

public class ReplaceExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.replace(6, 11, "Java");
        System.out.println("StringBuffer after replace: " + sb);  // Output: Hello Java
    }
}
