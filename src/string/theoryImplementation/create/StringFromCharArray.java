package string.theoryImplementation.create;

public class StringFromCharArray {
    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str = new String(charArray);  // Creating string from char array

        System.out.println("String from char[]: " + str);
    }
}
