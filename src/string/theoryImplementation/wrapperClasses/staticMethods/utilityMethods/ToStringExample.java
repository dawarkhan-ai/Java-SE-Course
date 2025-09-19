package string.theoryImplementation.wrapperClasses.staticMethods.utilityMethods;

public class ToStringExample {
    public static void main(String[] args) {
        int num = 50;
        String str = Integer.toString(num);
        System.out.println("Integer to String: " + str);

        double pi = 3.14;
        String piStr = Double.toString(pi);
        System.out.println("Double to String: " + piStr);
    }
}

