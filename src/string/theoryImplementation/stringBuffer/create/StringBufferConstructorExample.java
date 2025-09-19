package string.theoryImplementation.stringBuffer.create;

public class StringBufferConstructorExample {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();  // Empty StringBuffer with default capacity
        System.out.println("StringBuffer sb1: " + sb1);  // Output: (empty)

        // Adding content to sb1
        sb1.append("Hello");
        System.out.println("sb1 after append: " + sb1);  // Output: Hello
    }
}

