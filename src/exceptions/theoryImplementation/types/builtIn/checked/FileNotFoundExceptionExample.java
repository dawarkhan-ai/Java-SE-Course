package exceptions.theoryImplementation.types.builtIn.checked;

import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("nonexixtent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException occured: " + e.getMessage());
        }
    }
}
