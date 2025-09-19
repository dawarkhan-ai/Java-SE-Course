package exceptions.theoryImplementation.exceptionHandlingConstructs;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 100;
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic error occured.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds." + e.getMessage());
        }
    }
}
