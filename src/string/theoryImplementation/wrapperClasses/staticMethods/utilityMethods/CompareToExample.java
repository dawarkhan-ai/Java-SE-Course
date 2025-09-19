package string.theoryImplementation.wrapperClasses.staticMethods.utilityMethods;

public class CompareToExample {
    public static void main(String[] args) {
        Integer a = 50;
        Integer b = 40;

        int result = a.compareTo(b); // a - b => 50 - 40 = positive
        System.out.println("Result of a.compareTo(b): " + result); // positive => a > b
    }
}
