package JavaIOHandling.theoryImplementation.fileHandling.JavaFileClass;

import java.io.*;

public class Example {
    public static void main(String[] args) {
        try {
            File file = new File("dependenciesFolder/forIO/test.txt");

            // Create file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }

            // Check properties
            System.out.println("Exists: " + file.exists());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());

            // Rename file
            File newFile = new File("dependenciesFolder/forIO/new_test.txt");
            if (file.renameTo(newFile)) {
                System.out.println("Renamed to: " + newFile.getName());
                System.out.println("Path: " + newFile.getAbsolutePath());
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
