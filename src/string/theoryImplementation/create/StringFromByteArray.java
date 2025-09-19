package string.theoryImplementation.create;

public class StringFromByteArray {
    public static void main(String[] args) {
        byte[] byteArray = {72, 101, 108, 108, 111};  // ASCII values for "Hello"
        String str = new String(byteArray);  // Creating string from byte array

        System.out.println("String from byte[]: " + str);
    }
}
