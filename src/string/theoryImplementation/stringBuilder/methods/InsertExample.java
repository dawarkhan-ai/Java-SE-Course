package string.theoryImplementation.stringBuilder.methods;

public class InsertExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(6, "Java ");
        System.out.println("StringBuilder after insert: " + sb);  // Output: Hello Java World
    }
}
