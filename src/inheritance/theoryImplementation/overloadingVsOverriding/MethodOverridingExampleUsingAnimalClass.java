package inheritance.theoryImplementation.overloadingVsOverriding;

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExampleUsingAnimalClass {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.speak(); // Method overriding but not RuntimePolymorphism as not using Dynamic method Dispatch mechanism or Dynamic Binding
    }
}
