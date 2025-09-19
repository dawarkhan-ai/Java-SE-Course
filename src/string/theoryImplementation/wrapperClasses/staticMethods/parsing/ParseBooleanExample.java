package string.theoryImplementation.wrapperClasses.staticMethods.parsing;

public class ParseBooleanExample {
    public static void main(String[] args) {
        String str = "true";
        boolean flag = Boolean.parseBoolean(str);
        System.out.println("Parsed Boolean: " + flag);
    }
}
