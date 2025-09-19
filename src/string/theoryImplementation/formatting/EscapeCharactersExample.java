package string.theoryImplementation.formatting;

public class EscapeCharactersExample {
    public static void main(String[] args) {
        System.out.println("1. New Line (\\n):");
        System.out.println("Hello\nWorld");

        System.out.println("\n2. Tab (\\t):");
        System.out.println("Name:\tAnkit");

        System.out.println("\n3. Double Quote (\\\"):");
        System.out.println("She said, \"Java is fun!\"");

        System.out.println("\n4. Backslash (\\\\):");
        System.out.println("Path: C:\\Program Files\\Java");

        System.out.println("\n5. Carriage Return (\\r):");
        System.out.println("Java Programming\rCode");  // 'Code' overwrites start

        System.out.println("\n6. Backspace (\\b):");
        System.out.println("Oops\b!");  // Removes 's' before '!'

        System.out.println("\n7. Form Feed (\\f):");
        System.out.println("Hello\fWorld");  // Output may vary

        System.out.println("\n8. Mixed Example:");
        System.out.println("Name:\t\"Ravi\"\nAge:\t20\nPath:\tC:\\Users\\Ravi");
    }
}

