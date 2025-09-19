package string.theoryImplementation.formatting;

public class FormatMethodExample {
    public static void main(String[] args) {
        String name = "Ankit";
        int age = 21;

        String formatted = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(formatted);
    }
}
