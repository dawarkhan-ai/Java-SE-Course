package string.theoryImplementation.formatting;

public class FormatSpecifiersDemo {
    public static void main(String[] args) {
        String name = "Ankit";
        int age = 21;
        float percentage = 85.6789f;
        double salary = 12345.6789;
        char grade = 'A';
        boolean isPass = true;

        System.out.println("----- Format Specifiers Demo -----");

        // %s – String
        System.out.printf("Name: %s%n", name);

        // %d – Integer
        System.out.printf("Age: %d years%n", age);

        // %f – Floating point
        System.out.printf("Percentage: %.2f%%%n", percentage);  // 2 decimal precision

        // %f – Double (same as float in format)
        System.out.printf("Salary: %.3f%n", salary);  // 3 decimal precision

        // %c – Character
        System.out.printf("Grade: %c%n", grade);

        // %b – Boolean
        System.out.printf("Passed: %b%n", isPass);

        // %n – Platform-independent new line
        System.out.printf("Line1%nLine2%n");

        // Width and alignment
        System.out.printf("Right-aligned: |%10s|%n", name);
        System.out.printf("Left-aligned : |%-10s|%n", name);
    }
}

