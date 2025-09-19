import javax.swing.*;
import java.awt.event.*;

public class TestMouse {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Test");
        JButton button = new JButton("Click or Hold Me");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }
        });
    }
}

