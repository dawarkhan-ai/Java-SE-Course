package eventHandling;

import java.awt.*;
import java.awt.event.*;

public class WindowListenerExample extends Frame implements WindowListener {

    Label l;

    WindowListenerExample() {
        l = new Label("Perform window actions...");
        l.setBounds(50, 80, 250, 20);
        add(l);

        addWindowListener(this);

        setSize(400, 250);
        setLayout(null);
        setVisible(true);
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("✅ Window Opened");
        l.setText("Window Opened");
        setBackground(Color.CYAN);
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("❌ Window Closing");
        l.setText("Window Closing");
        dispose(); // Important to close the window
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("☑️ Window Closed");
        // Frame is closed, so this usually runs after dispose()
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("📥 Window Minimized");
        l.setText("Window Minimized");
        setBackground(Color.LIGHT_GRAY);
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("📤 Window Restored");
        l.setText("Window Restored");
        setBackground(Color.WHITE);
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("🟢 Window Active");
        l.setText("Window Activated");
        setBackground(Color.GREEN);
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("🔴 Window Inactive");
        l.setText("Window Deactivated");
        setBackground(Color.PINK);
    }

    public static void main(String[] args) {
        new WindowListenerExample();
    }
}
