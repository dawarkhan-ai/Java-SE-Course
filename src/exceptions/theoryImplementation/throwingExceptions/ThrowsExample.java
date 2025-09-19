package exceptions.theoryImplementation.throwingExceptions;

import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile();  // Calling method which declares throws IOException
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void readFile() throws IOException {
        FileReader fr = new FileReader("nonexistentfile.txt");  // Trying to open a non-existent file
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        System.out.println(line);
    }

}
