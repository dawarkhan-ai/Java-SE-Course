package string.theoryImplementation.methods.basic;

public class EqualsExample {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        System.out.println(s1.equals(s2));  // false (case-sensitive)
        System.out.println(s1.equalsIgnoreCase(s2));  // true (ignores case)
    }
}

