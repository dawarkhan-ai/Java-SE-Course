package exceptions.theoryImplementation.exceptionHandlingConstructs;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int num = 50 / 10;
            System.out.println("Result: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught.");
        } finally {
            System.out.println("This block always executes.");
        }
    }

}
