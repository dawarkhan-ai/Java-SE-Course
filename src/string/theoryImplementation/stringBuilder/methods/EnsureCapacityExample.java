package string.theoryImplementation.stringBuilder.methods;

public class EnsureCapacityExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(50);  // Ensures capacity of at least 50
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());  // Output: 50
    }
}
