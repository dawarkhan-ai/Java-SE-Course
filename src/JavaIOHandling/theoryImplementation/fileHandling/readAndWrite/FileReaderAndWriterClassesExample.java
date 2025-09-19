package JavaIOHandling.theoryImplementation.fileHandling.readAndWrite;

import java.io.*;

public class FileReaderAndWriterClassesExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("dependenciesFolder/forIO/TextFile.txt");
            FileWriter fw = new FileWriter("dependenciesFolder/forIO/TextFile2.txt");
            int character;
            while ((character = fr.read()) != -1) {           // Read one character
                fw.write(character);       // Print as character
            }
            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
