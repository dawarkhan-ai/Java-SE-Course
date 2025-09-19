package exceptions.problems;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReaderProblem {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
             fr = new FileReader("file1");

            int i;
            while(-1 != (i=fr.read())){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            if (fr != null) { // ✅ null check
                try {
                    fr.close(); // ✅ IOException might be thrown here
                } catch (IOException e) {
                    System.out.println("Error while closing the file: " + e.getMessage());
                }
            }
        }
    }
}
