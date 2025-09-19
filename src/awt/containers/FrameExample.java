package awt.containers;

import java.awt.*;

public class FrameExample extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame("My Frame");
        f.setSize(800, 800);
        f.add(new Button("First Button"), BorderLayout.NORTH);
        f.add(new Button("Second Button"),BorderLayout.SOUTH);
        f.add(new Button("Third Button"), BorderLayout.EAST);
        f.add(new Button("Fourth Button"), BorderLayout.WEST);
        f.add(new Button("Fiveth Button"), BorderLayout.CENTER);
        f.setVisible(true);
    }
}
