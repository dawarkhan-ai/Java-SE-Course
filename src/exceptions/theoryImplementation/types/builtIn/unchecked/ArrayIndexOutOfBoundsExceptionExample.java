package exceptions.theoryImplementation.types.builtIn.unchecked;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);  // Invalid index
    }
}
