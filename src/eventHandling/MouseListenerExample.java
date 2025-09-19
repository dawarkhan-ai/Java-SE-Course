package eventHandling;

import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame {

    Label l1, l2, l3, l4, l5;

    MouseListenerExample() {
        // Create 5 labels to show different mouse events
        l1 = new Label("for Mouse Clicked:");
        l1.setBounds(20, 50, 250, 20);

        l2 = new Label("for Mouse Pressed:");
        l2.setBounds(20, 80, 250, 20);

        l3 = new Label("for Mouse Released:");
        l3.setBounds(20, 110, 250, 20);

        l4 = new Label("for Mouse Entered:");
        l4.setBounds(20, 140, 250, 20);

        l5 = new Label("for Mouse Exited:");
        l5.setBounds(20, 170, 250, 20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);

        // Register MouseListener
        addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

            }

            public void mousePressed(MouseEvent e) {
                l2.setText("Mouse Pressed");
                setBackground(Color.ORANGE);
            }

            public void mouseReleased(MouseEvent e) {
                l3.setText("Mouse Released");
                setBackground(Color.GREEN);
            }

            public void mouseEntered(MouseEvent e) {
                l4.setText("Mouse Entered the Window");
                setBackground(Color.CYAN);
            }

            public void mouseExited(MouseEvent e) {
                l5.setText("Mouse Exited the Window");
                setBackground(Color.LIGHT_GRAY);
            }
        });

        setSize(400, 250);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
