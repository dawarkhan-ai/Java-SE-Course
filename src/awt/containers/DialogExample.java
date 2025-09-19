package awt.containers;

import java.awt.*;

public class DialogExample {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(800, 800);
        f.setVisible(true);

        Dialog d = new Dialog(f, "Sample Title", true);
        d.setSize(300, 300);
        d.add(new Label("Welcome!"), BorderLayout.NORTH);
        d.setVisible(true);
    }
}
