package awt.containers;

import java.awt.*;

public class PanelExample {
    public static void main(String[] args) {
        Panel p = new Panel();
        p.add(new Button("First Button"));
        p.add(new Button("Second Button"));
        p.add(new Button("Third Button"));
        p.add(new Button("Fourth Button"));

        Panel p2 = new Panel();
        p2.add(new Button("First Button"));
        p2.add(new Button("Second Button"));
        p2.add(new Button("Third Button"));
        p2.add(new Button("Fourth Button"));

        Frame f = new Frame("Frame of 2 Panel");
        f.setSize(800,800);
        f.add(p, BorderLayout.EAST);
        f.add(p2, BorderLayout.WEST);
        f.setVisible(true);
    }
}
