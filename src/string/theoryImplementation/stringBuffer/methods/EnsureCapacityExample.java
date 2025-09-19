package string.theoryImplementation.stringBuffer.methods;

public class EnsureCapacityExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.ensureCapacity(50);  // Ensures capacity of at least 50
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());  // Output: 50
    }
}
