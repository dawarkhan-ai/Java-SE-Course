package controlStructures.impKeywords;

final class MyClass {  // final class (cannot be extended)
    final void display() {  // final method (cannot be overridden)
        System.out.println("This method cannot be overridden.");
    }
}
public class FinalKeywordExample {
   static final int MAXAGE = 100;

    public static void main(String[] args) {
        // MAX_AGE = 101;  // This will give an error since MAX_AGE is final
        System.out.println("Max Age: " + MAXAGE);

        // MyClass cannot be inherited
        // class ExtendedClass extends MyClass { ... }
    }
}
