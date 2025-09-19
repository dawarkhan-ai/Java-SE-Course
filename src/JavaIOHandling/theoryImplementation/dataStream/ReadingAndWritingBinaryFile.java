package JavaIOHandling.theoryImplementation.dataStream;

import java.io.*;

public class ReadingAndWritingBinaryFile {
    public static void main(String[] args) {
       try (
           DataInputStream dis = new DataInputStream(new FileInputStream("C:\\OneDriveDawar\\OneDrive\\Desktop\\Java_learning_II\\dependenciesFolder\\forIO\\Source.bin"));
           DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\OneDriveDawar\\OneDrive\\Desktop\\Java_learning_II\\dependenciesFolder\\forIO\\Destination.bin"));
       ){
        // Reading data in the sequence same the written in file
        int i = dis.readInt();
        double d = dis.readDouble();
        boolean b = dis.readBoolean();

        // not necessary the same sequence because this is different file
        dos.writeDouble(d);
        dos.writeBoolean(b);
        dos.writeInt(i);

        System.out.println("Data copied successfully.");

       } catch(IOException e) {
        System.out.println(e.getMessage());
       }

    }
}
