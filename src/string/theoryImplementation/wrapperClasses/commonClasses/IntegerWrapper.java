package string.theoryImplementation.wrapperClasses.commonClasses;

public class IntegerWrapper {
    public static void main(String[] args) {
        // Creating an Integer object using valueOf() method
        Integer intObj = Integer.valueOf(10);

        // Performing operations with Integer class
        System.out.println("Integer Object: " + intObj);
        System.out.println("Integer to String: " + intObj.toString());
        System.out.println("Comparison with 20: " + intObj.compareTo(20));
        System.out.println("Parsing String '30' to Integer: " + Integer.parseInt("30"));
    }
}

