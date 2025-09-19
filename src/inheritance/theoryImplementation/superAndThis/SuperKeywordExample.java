package inheritance.theoryImplementation.superAndThis;

class Human {
    Human() {
        System.out.println("Human Constructor");
    }

    void speak() {
        System.out.println("Human speaks");
    }

}

class Boy extends Human {
    Boy() {
        super();
        System.out.println("Boy Constructor");
    }

    void speak() {
        super.speak();
        System.out.println("Boy speaks");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Boy boy = new Boy();

        boy.speak();
    }
}
