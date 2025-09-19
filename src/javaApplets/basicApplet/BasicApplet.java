package javaApplets.basicApplet;

import java.applet.Applet;
import java.awt.*;

/* <applet code = "javaApplets.basicApplet.BasicApplet" width = "300" height = "800"> </applet>*/
public class BasicApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Hello Applet!", 50, 50);
    }
}
