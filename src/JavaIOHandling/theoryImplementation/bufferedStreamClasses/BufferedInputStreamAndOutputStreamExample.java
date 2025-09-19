package JavaIOHandling.theoryImplementation.bufferedStreamClasses;

import java.io.*;

public class BufferedInputStreamAndOutputStreamExample {
    public static void main(String[] args) {
        String sourceFile = "input.jpg";
        String destFile = "output.jpg";

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        ) {
            int bytesRead;

            while ((bytesRead = bis.read()) != -1) {
                bos.write(bytesRead);  //
            }
            bos.flush();
            System.out.println("File copied successfully using buffer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

