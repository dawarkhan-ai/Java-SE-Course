package string.theoryImplementation.stringBuilder.methods;

public class DeleteExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.delete(5, 11);
        System.out.println("StringBuilder after delete: " + sb);  // Output: Hello
    }
}
