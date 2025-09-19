package eventHandling;

import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {
    Label l1, l2, l3;

    KeyListenerExample() {
        // Label for keyPressed
        l1 = new Label("Key Pressed: ");
        l1.setBounds(20, 50, 250, 20);

        // Label for keyTyped
        l2 = new Label("Key Typed: ");
        l2.setBounds(20, 80, 250, 20);

        // Label for keyReleased
        l3 = new Label("Key Released: ");
        l3.setBounds(20, 110, 250, 20);

        add(l1);
        add(l2);
        add(l3);

        addKeyListener(this);
        setSize(400, 200);
        setLayout(null);
        setVisible(true);

        setFocusable(true); // Important for key events
    }

    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed: " + e.getKeyChar());
        setBackground(Color.YELLOW); // Visual feedback
    }

    public void keyTyped(KeyEvent e) {
        l2.setText("Key Typed: " + e.getKeyChar());
        setBackground(Color.CYAN); // Visual feedback
    }

    public void keyReleased(KeyEvent e) {
        l3.setText("Key Released: " + e.getKeyChar());
        setBackground(Color.GREEN); // Visual feedback
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
