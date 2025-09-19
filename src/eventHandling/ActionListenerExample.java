package eventHandling;

import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample extends Frame {
    ActionListenerExample() {

        Button b = new Button("Click Me");
        b.setBounds(100, 100, 80, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                b.setLabel("Clicked");
            }
        });
        add(b);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }
}
