package JavaIOHandling.theoryImplementation.objectStreams;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


public class ObjectInputStreamObjectOutputStreamExample {
    public static void main(String[] args) {
        // Step 1: Create Student Object
        Student s1 = new Student(101, "Arjun");

        // Step 2: Serialize the object and save it to a file
        try {
            FileOutputStream fos = new FileOutputStream("dependenciesFolder/forIO/student.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);  // Serialization
            oos.close();
            fos.close();

            System.out.println("Object has been serialized and saved.");
        } catch (IOException e) {
           System.out.println( e.getMessage());
        }

        // Step 3: Deserialize the object from file
        try {
            FileInputStream fis = new FileInputStream("dependenciesFolder/forIO/student.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student)ois.readObject();  // Deserialization
            ois.close();
            fis.close();

            System.out.println("✅ Object has been deserialized.");
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
