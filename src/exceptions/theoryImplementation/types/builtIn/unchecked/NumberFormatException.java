package exceptions.theoryImplementation.types.builtIn.unchecked;

public class NumberFormatException {
    public static void main(String[] args) {
        String s = "abc";
        int num = Integer.parseInt(s);  // Non-numeric string
    }

}
