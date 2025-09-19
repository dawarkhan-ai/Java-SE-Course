package string.theoryImplementation.wrapperClasses.commonClasses;

public class ByteWrapper {
    public static void main(String[] args) {
        // Creating a Byte object
        Byte byteObj = Byte.valueOf((byte) 100);

        // Performing operations with Byte class
        System.out.println("Byte Object: " + byteObj);
        System.out.println("Byte to String: " + byteObj.toString());
        System.out.println("Parsing String '120' to Byte: " + Byte.parseByte("120"));
    }
}

