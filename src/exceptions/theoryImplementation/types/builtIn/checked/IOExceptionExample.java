package exceptions.theoryImplementation.types.builtIn.checked;

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("dependenciesFolder/forIO/file1");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
                fr.close();
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("IOException occured: " + e.getMessage());
        }
    }
}
