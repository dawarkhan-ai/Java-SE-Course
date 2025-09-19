package exceptions.theoryImplementation.tryWithResource;

import java.io.*;

public class TryWithResource {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("dependenciesFolder/forIO/file1"))) {
            String line = br.readLine();
            System.out.println("First line: " + line);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
