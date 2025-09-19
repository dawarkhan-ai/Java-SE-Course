package exceptions.theoryImplementation.types.builtIn.unchecked;

public class StringIndexOutOfBoundsException {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.charAt(10));  // Invalid string index
    }
}
