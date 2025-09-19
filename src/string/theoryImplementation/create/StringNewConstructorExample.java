package string.theoryImplementation.create;

public class StringNewConstructorExample {
    public static void main(String[] args) {
        String str1 = new String("Hello");  // String created using new keyword
        String str2 = new String("Hello");  // A new string object is created, different from SCP

        System.out.println("str1 == str2 : " + (str1 == str2));  // false, because they are different objects
    }
}
