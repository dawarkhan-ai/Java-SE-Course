package packages.theoryImplementation.useBuiltInPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOPackageDemo {
    public static void main(String[] args) {
        try {
            // Write to file
            FileWriter writer = new FileWriter("dependenciesFolder/forIO/file1");
            writer.write("This is a file created using java.io package.");

            // Read from file
            FileReader reader = new FileReader("dependenciesFolder/file1");
            int ch;
            while((ch = reader.read()) != -1) {
                System.out.print((char)ch);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
