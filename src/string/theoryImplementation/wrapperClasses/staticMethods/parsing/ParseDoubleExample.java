package string.theoryImplementation.wrapperClasses.staticMethods.parsing;

public class ParseDoubleExample {
    public static void main(String[] args) {
        String str = "3.1415";
        double num = Double.parseDouble(str);
        System.out.println("Parsed Double: " + num);
    }
}
