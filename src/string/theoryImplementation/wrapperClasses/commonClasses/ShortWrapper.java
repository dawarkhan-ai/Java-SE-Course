package string.theoryImplementation.wrapperClasses.commonClasses;

public class ShortWrapper {
    public static void main(String[] args) {
        // Creating a Short object
        Short shortObj = Short.valueOf((short) 10);

        // Performing operations with Short class
        System.out.println("Short Object: " + shortObj);
        System.out.println("Short to String: " + shortObj.toString());
        System.out.println("Parsing String '15' to Short: " + Short.parseShort("15"));
    }
}

