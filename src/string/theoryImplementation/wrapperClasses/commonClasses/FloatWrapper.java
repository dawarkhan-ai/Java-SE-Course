package string.theoryImplementation.wrapperClasses.commonClasses;

public class FloatWrapper {
    public static void main(String[] args) {
        // Creating a Float object
        Float floatObj = Float.valueOf(3.14f);

        // Performing operations with Float class
        System.out.println("Float Object: " + floatObj);
        System.out.println("Float to String: " + floatObj.toString());
        System.out.println("Parsing String '5.5' to Float: " + Float.parseFloat("5.5"));
    }
}

