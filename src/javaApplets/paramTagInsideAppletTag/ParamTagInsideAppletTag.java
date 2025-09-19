package javaApplets.paramTagInsideAppletTag;

import java.applet.Applet;
import java.awt.*;

/* <applet code = "ParamTagInsideAppletTag" width = "300" height = "100">
<param name = "username" value = "Dawar" /> </applet>*/
public class ParamTagInsideAppletTag extends Applet {
    public void paint(Graphics g) {
        String user = getParameter("username");
        g.drawString("Welcome " + user, 20,20);
    }
}
