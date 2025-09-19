package exceptions.theoryImplementation.tryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithMultipleResourceExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try (
                FileReader fr = new FileReader(filePath);
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        // No need to close fr or br manually!
    }
}

