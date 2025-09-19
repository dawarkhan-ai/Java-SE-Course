package inheritance.problems;

class Outer {
    static String sVariable = new String("Hello World");


    static class inner {
        void displaySVariable() {
            System.out.println(sVariable);
        }
    }
}

public class SNC {
    public static void main(String[] args) {
        Outer.inner iObj = new Outer.inner();

        iObj.displaySVariable();
    }
}
