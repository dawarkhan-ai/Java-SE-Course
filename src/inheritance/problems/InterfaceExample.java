package inheritance.problems;

interface Drawable {
    void draw();
}

class Circles implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }

    Circles() {
        super();
    }
}

class Rectangles implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
    }

    Rectangles() {
        super();
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Drawable c1 = new Circles();
        c1.draw();

        Drawable r1 = new Rectangles();
        r1.draw();
    }
}
