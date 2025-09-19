package JavaIOHandling.theoryImplementation;

import java.io.*;

public class JavaIOExcepttionsHandling {
    public static void main(String[] args) {
        //  Common exception handling
        try (FileInputStream fis = new FileInputStream("sample.txt")) {
            int data = fis.read();
            System.out.println("Data: " + data);
        } catch (FileNotFoundException e) {
            System.err.println("Common: File nahi mili" + e.getMessage());
        } catch (IOException e) {
            System.err.println("Common: I/O error: " + e.getMessage());
        }

        // Rare exception handling (serialization)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"))) {
            oos.writeObject(new Object()); // Non-serializable object
        } catch (ObjectStreamException e) {
            System.err.println("Rare: Serialization error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Common: I/O error: " + e.getMessage());
        }
    }
}
