package string.theoryImplementation.formatting;

public class StringWidthAndAlignmentExample {
    public static void main(String[] args) {
        String lang = "Java";

        System.out.println(String.format("|%10s|", lang));  // Right-aligned
        System.out.println(String.format("|%-10s|", lang)); // Left-aligned
    }
}
