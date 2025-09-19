package string.theoryImplementation.wrapperClasses.staticMethods.factoryMethods;

public class ValueOfExample {
    public static void main(String[] args) {
        Integer intObj = Integer.valueOf("100");
        Double doubleObj = Double.valueOf("25.75");
        Boolean boolObj = Boolean.valueOf("false");

        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Boolean Object: " + boolObj);
    }
}

