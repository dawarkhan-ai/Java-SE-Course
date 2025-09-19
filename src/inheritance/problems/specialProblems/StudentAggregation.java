package inheritance.problems.specialProblems;

class Student {
    class Address {
        String city;
        int pincode;
    }

    String name;
    Address address;

    Student(String name, String city, int pincode) {
        this(city, pincode);
        this.name = name;
    }
    Student(String city, int pincode) {
        this.address = new Address();
        this.address.city = city;
        this.address.pincode = pincode;
    }

    void displayDetails() {
        class Marks {
            int mMark;
            int pMark;
            int cMark;

            Marks(int mMark, int pMark, int cMark) {
                this.mMark = mMark;
                this.pMark = pMark;
                this.cMark = cMark;
            }
        }

        Marks ob1 = new Marks(40, 50, 60);

        System.out.println("Name of Student is: " + name);
        System.out.println("Address of Student is: " + address.city + ", " + address.pincode);
        System.out.println("Marks in Core subjects- ");
        System.out.println("Maths Mark - " + ob1.mMark);
        System.out.println("Physics Mark - " + ob1.pMark);
        System.out.println("Chemistry Mark - " + ob1.cMark);
    }
}

public class StudentAggregation {
    public static void main(String[] args) {
        Student s1 = new Student("Dawar Khan", "Dharamjaigarh", 496116);

        s1.displayDetails();
    }
}
