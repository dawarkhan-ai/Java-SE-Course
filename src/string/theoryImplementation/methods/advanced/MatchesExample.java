package string.theoryImplementation.methods.advanced;

public class MatchesExample {
    public static void main(String[] args) {
        String email = "test@gmail.com";
        System.out.println(email.matches("[a-z]+@[a-z]+\\.com")); // true
    }
}
