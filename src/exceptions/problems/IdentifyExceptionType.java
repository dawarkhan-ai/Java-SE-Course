package exceptions.problems;

public class IdentifyExceptionType {
    public static void main(String[] args) {
        // 1. NullPointerException (Unchecked)
        try {
            String str = null;
            System.out.println("Length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException (Unchedked)");
        }

        // 2. NumberFormatException (Unchedked)
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e){
            System.out.println("Caught NumberFormatException (Unchecked)");
        }

        // 3. ClassNotFoundException (Checked)
        try {
            Class.forName("com.example.NonExistantClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException (Checked)");
        }

        System.out.println("Program completed.");
    }
}
