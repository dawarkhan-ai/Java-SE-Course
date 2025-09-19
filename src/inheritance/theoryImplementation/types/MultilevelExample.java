package inheritance.theoryImplementation.types;

class Human {
    void walk() {
        System.out.println("Human is walking...");
    }
}

class MaleHuman extends Human {
    void walk() {
        System.out.println("MaleHuman is walking...");
    }
}

class Boy extends MaleHuman {
    void walk() {
        System.out.println("Boy is walking...");
    }
}

public class MultilevelExample {
    public static void main(String[] args) {
        Boy boy = new Boy();

        boy.walk();
    }
}
