package string.theoryImplementation.formatting;

public class PrintfMethodExample {
    public static void main(String[] args) {
        String product = "Pen";
        int quantity = 10;
        double price = 12.5;

        System.out.printf("Product: %s%n", product);
        System.out.printf("Quantity: %d%n", quantity);
        System.out.printf("Total Price: %.2f%n", quantity * price);
    }
}
