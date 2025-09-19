package JavaIOHandling.problemSolving;

import java.util.Scanner;
import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    String pos;

     Employee(int id, String name, String pos) {
        this.id = id;
        this.name = name;
        this.pos = pos;
    }
}

public class SavingEmployeeDataUsingObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        String pos;

        System.out.println("Give the employee data(id, name, pos): ");
        id = sc.nextInt();
        name = sc.next();
        pos = sc.next();
        Employee em = new Employee(id, name, pos);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dependenciesFolder/forIO/PS4.dat"));
            oos.writeObject(em);
            System.out.println("Object is serialized.");
            oos.close();
        } catch(IOException e) {
            System.out.println("An error is caught: " + e.getMessage());
        }
    }
}
