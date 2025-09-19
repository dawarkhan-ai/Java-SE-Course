package JavaIOHandling.theoryImplementation.fileHandling.readAndWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException; 

public class FileInputStreamAndOutputStreamClassesExample {
    public static void main(String[] main) {
        try {
            FileInputStream fis = new FileInputStream("dependenciesFolder/forIO/Image.png");
            FileOutputStream fos = new FileOutputStream("dependenciesFolder/forIO/Image2.png");

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Written Successfully!");
            fis.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
