package string.theoryImplementation.stringBuffer.methods;

public class DeleteExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.delete(5,11);
        System.out.println("StringBuffer after delete: " + sb);  // Output: Hello
    }
}
