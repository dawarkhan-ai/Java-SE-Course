package string.theoryImplementation;

public class ConversionTechniques {
    public static void main(String[] args) {

        // 🔹 String → Primitive
        String strNumber = "123";
        int primitiveInt = Integer.parseInt(strNumber);
        double primitiveDouble = Double.parseDouble("3.14");

        System.out.println("String to Primitive:");
        System.out.println("Integer: " + primitiveInt);
        System.out.println("Double: " + primitiveDouble);

        // 🔹 Primitive → Wrapper (Auto-boxing + valueOf)
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);

        System.out.println("\nPrimitive to Wrapper:");
        System.out.println("Integer Object: " + wrapperInt);
        System.out.println("Double Object: " + wrapperDouble);

        // 🔹 Wrapper → Primitive (Unboxing + xxxValue())
        int unboxedInt = wrapperInt.intValue();
        double unboxedDouble = wrapperDouble.doubleValue();

        System.out.println("\nWrapper to Primitive:");
        System.out.println("int: " + unboxedInt);
        System.out.println("double: " + unboxedDouble);

        // 🔹 Wrapper → String
        String strFromInt = wrapperInt.toString();
        String strFromDouble = wrapperDouble.toString();

        System.out.println("\nWrapper to String:");
        System.out.println("String from Integer: " + strFromInt);
        System.out.println("String from Double: " + strFromDouble);

        // 🔹 Primitive → String
        String strFromPrimitiveInt = Integer.toString(primitiveInt);
        String strFromPrimitiveDouble = Double.toString(primitiveDouble);

        System.out.println("\nPrimitive to String:");
        System.out.println("String from int: " + strFromPrimitiveInt);
        System.out.println("String from double: " + strFromPrimitiveDouble);
    }
}

