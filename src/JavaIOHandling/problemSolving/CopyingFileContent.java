package JavaIOHandling.problemSolving;

import java.io.*;

public class CopyingFileContent {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("dependenciesFolder/forIO/PS1Source.txt");
            FileWriter fw = new FileWriter("dependenciesFolder/forIO/PS1Destination.txt");

            System.out.println("Copying the content:");
            int i;
            while ((i = fr.read()) != -1) {
                fw.write(i);
                System.out.print((char)i);
            }

            fr.close();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
