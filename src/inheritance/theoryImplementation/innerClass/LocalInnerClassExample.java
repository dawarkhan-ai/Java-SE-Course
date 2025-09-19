package inheritance.theoryImplementation.innerClass;

public class LocalInnerClassExample {
    void method() {
        class Local {
            void show() {
                System.out.println("Local Inner Class");
            }
        }

        Local local = new Local();
        local.show(); // Output: Local Inner Class
    }

    public static void main(String[] args) {
        LocalInnerClassExample outer = new  LocalInnerClassExample();
        outer.method();
    }
}
