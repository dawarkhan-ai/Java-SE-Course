package string.theoryImplementation.stringBuffer.methods;

public class InsertExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.insert(6, "Java ");
        System.out.println("StringBuffer after insert: " + sb);  // Output: Hello Java World
    }
}
