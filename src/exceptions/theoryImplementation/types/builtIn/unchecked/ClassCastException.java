package exceptions.theoryImplementation.types.builtIn.unchecked;

public class ClassCastException {
    public static void main(String[] args) {
        Object obj = new String("113");
        Integer i = (Integer) obj;  // Invalid cast from String to Integer
    }
}
