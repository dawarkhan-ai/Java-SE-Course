package javaApplets.graphicsInApplet;

import java.applet.Applet;
import java.awt.*;

/* <applet code = "javaApplets.graphicsInApplet.GraphicsInApplet.class" width = "800" height = "800"> </applet>*/
public class GraphicsInApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(50, 50, 100, 100);
        g.drawString("Circle", 80, 120);
    }
}
