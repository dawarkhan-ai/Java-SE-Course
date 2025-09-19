package string.theoryImplementation.wrapperClasses;

public class CreateWrapperObject {
    public static void main(String[] args) {
        // Recommended way to create wrapper object
        Integer num = Integer.valueOf(5);

        System.out.println("Using valueOf():");
        System.out.println("Integer Value: " + num);
    }
}
