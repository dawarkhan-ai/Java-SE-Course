package JavaIOHandling.problemSolving;

import java.io.*;

public class CountLineAndWordsUsingBufferedReader {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("dependenciesFolder/forIO/PS2Source.txt"));

            int countLine = 1;
            int countWords = 0;
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Line " + countLine + ": " + line);
                countLine++;

                String[] wordsArray = line.trim().split("\\s+");
                countWords += wordsArray.length;
            }
            System.out.println("Total words: " + countWords);

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
