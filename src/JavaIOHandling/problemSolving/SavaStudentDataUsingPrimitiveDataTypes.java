package JavaIOHandling.problemSolving;

import java.io.*;

public class SavaStudentDataUsingPrimitiveDataTypes {
    public static void main(String[] args) {
        try {
            int rollNumber = 35;
            String name = "MD Dawar Khan";
            float percentage = 77.5f;

            DataOutputStream dos = new DataOutputStream(new FileOutputStream("dependenciesFolder/forIO/PS3Source&Destination.bin"));
            DataInputStream dis = new DataInputStream(new FileInputStream("dependenciesFolder/forIO/PS3Source&Destination.bin"));

            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeFloat(percentage);
            System.out.println("The student data is saved.");

            System.out.println("\nThe saved student data is-");
            System.out.println("Roll No.: " + dis.readInt());
            System.out.println("Name: " + dis.readUTF());
            System.out.println("Percentage: " + dis.readFloat() + "%");

            dos.close();
            dis.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
