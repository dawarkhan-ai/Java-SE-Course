package string.theoryImplementation.wrapperClasses.commonClasses;

public class DoubleWrapper {
    public static void main(String[] args) {
        // Creating a Double object
        Double doubleObj = Double.valueOf(3.14);

        // Performing operations with Double class
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Double to String: " + doubleObj.toString());
        System.out.println("Comparison with 5.0: " + doubleObj.compareTo(5.0));
        System.out.println("Parsing String '10.5' to Double: " + Double.parseDouble("10.5"));
    }
}

