package string.theoryImplementation.wrapperClasses.commonClasses;

public class BooleanWrapper {
    public static void main(String[] args) {
        // Creating a Boolean object
        Boolean boolObj = Boolean.valueOf("true");

        // Performing operations with Boolean class
        System.out.println("Boolean Object: " + boolObj);
        System.out.println("Boolean to String: " + boolObj.toString());
        System.out.println("Parsing String 'false' to Boolean: " + Boolean.parseBoolean("false"));
    }
}

