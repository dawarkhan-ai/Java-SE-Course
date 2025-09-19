package inheritance.theoryImplementation;

class Laptop {
    String brand;

    Laptop(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Laptop brand: " + brand);
    }
}


public class Developer {
    Laptop lp;

    Developer(Laptop lp) {
        this.lp = lp;
    }

    void showLaptop() {
        lp.displayBrand();
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell");
        Developer dev = new Developer(laptop);
        dev.showLaptop();
    }
}
