package javaApplets.appletLifeCycle;

import java.applet.Applet;
import java.awt.*;


public class LifeCycleApplet extends Applet {

    String message;

    // 1. init() – called once when applet is loaded
    public void init() {
        message = "1. init() called";
        setBackground(Color.LIGHT_GRAY);
        System.out.println("init() method executed");
    }

    // 2. start() – called when applet starts or resumes
    public void start() {
        message += "\n2. start() called";
        System.out.println("start() method executed");
    }

    // 3. paint() – called when UI needs to be rendered
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Applet Life Cycle Demo", 100, 50);

        g.setColor(Color.BLACK);
        g.drawString("init(), start(), paint(), stop(), destroy()", 60, 100);

        g.setColor(Color.RED);
        g.drawString("Check console for method call flow", 70, 150);
    }

    // 4. stop() – called when applet is paused or browser minimized
    public void stop() {
        System.out.println("stop() method executed");
    }

    // 5. destroy() – called when applet is removed from memory
    public void destroy() {
        System.out.println("destroy() method executed");
    }
}

