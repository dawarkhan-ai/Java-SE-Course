package exceptions.theoryImplementation.exceptionHandlingConstructs;

public class TryCatchExample {
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
