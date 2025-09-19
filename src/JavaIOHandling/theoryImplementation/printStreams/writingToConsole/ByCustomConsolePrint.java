package JavaIOHandling.theoryImplementation.printStreams.writingToConsole;

import java.io.*;

public class ByCustomConsolePrint {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a custom PrintStream for console output
        PrintStream customOut = new PrintStream(new FileOutputStream(FileDescriptor.out));  // standard output

        customOut.println("This is printed using a custom PrintStream");
        customOut.printf("Formatted output: %.2f%n", 99.99);

        customOut.close();  // Not mandatory here since it's tied to console
    }
}
