package string.theoryImplementation.create;

public class StringLiteralExample {
    public static void main(String[] args) {
        String str1 = "Hello";  // String created using literal
        String str2 = "Hello";  // Same string from SCP (no new object created)

        System.out.println("str1 == str2 : " + (str1 == str2));  // true, as both reference same object in SCP
    }
}
