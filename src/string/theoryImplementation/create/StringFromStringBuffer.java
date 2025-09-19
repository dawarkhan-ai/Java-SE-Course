package string.theoryImplementation.create;

public class StringFromStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  // Append more text

        String str = sb.toString();  // Convert StringBuffer to String

        System.out.println("String from StringBuffer: " + str);
    }
}

