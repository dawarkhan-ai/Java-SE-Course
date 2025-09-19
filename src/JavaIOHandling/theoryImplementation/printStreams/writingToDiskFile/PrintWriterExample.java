package JavaIOHandling.theoryImplementation.printStreams.writingToDiskFile;

import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("SampleFileForPrintWriter.txt");
        pw.println("Using PrintWriter");
        pw.printf("Price: ₹%.2f\n", 199.99);
        System.out.println("Successfully written");
        pw.close();
    }
}

