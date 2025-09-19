package string.theoryImplementation.create;

public class StringFromStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");  // Append more text

        String str = sb.toString();  // Convert StringBuilder to String

        System.out.println("String from StringBuilder: " + str);
    }
}
