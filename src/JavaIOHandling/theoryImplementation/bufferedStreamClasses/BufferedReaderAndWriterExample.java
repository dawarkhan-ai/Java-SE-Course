package JavaIOHandling.theoryImplementation.bufferedStreamClasses;

import java.io.*;

public class BufferedReaderAndWriterExample {
    public static void main(String[] args) {
        String sourceFile = "input.txt";    // source text file
        String destFile = "output.txt";     // destination text file

        try (
                // Create buffered reader and writer
                BufferedReader br = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));
        ) {
            int charRead;

            while (( charRead = br.read()) != -1) {
                bw.write( charRead);
            }

            System.out.println("Text file copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
