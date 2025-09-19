package inheritance.problems;

class Button {
    void click() {
        System.out.println("Button is clicking...");
    }
}

public class AnonymousClassProblem {
    public static void main(String[] args) {
        Button btn = new Button(){
            void click() {
                System.out.println("Button is clicking by Anonymous Class...");
            }
        };

        btn.click();
    }
}
