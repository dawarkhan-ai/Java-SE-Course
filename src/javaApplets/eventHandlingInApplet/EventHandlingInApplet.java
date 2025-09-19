package javaApplets.eventHandlingInApplet;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="javaApplets.eventHandlingInApplet.EventHandlingInApplet.class" width = 800 height = 800></applet> */

public class EventHandlingInApplet extends Applet {
    int x = 10;
    Button move;

    public void init() {
        move = new Button("Move Right");
        move.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x += 10;
                repaint();
            }
        });
        add(move);
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(x, 50, 50, 50);
    }


}
