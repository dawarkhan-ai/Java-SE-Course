package string.theoryImplementation.wrapperClasses;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        // Auto-boxing: Primitive to Wrapper
        int a = 10;
        Integer obj = a;  // auto-boxing
        System.out.println("Auto-boxed Integer: " + obj);

        // Unboxing: Wrapper to Primitive
        Integer b = 20;
        int num = b;  // unboxing
        System.out.println("Unboxed int: " + num);
    }
}

