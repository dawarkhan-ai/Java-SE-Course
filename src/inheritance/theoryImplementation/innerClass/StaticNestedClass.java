package inheritance.theoryImplementation.innerClass;

public class StaticNestedClass {
    static class Inner {
        void show() {
            System.out.println("Static Inner Class");
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
        obj.show();
    }
}
