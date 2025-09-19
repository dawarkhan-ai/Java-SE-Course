package JavaIOHandling.theoryImplementation.printStreams.writingToDiskFile;

import java.io.*;

public class PrintStreamExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("dependenciesFolder/forIO/SampleFileForPrintStream.txt");
        ps.println("Using PrintStream");
        ps.printf("Marks: %d%%\n", 85);
        System.out.println("Successfully written");
        ps.close();
    }
}
