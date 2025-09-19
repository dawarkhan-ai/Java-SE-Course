package awt;

import java.awt.*;

/**
 * Demonstrates various AWT UI components arranged neatly using GridLayout.
 */
public class UIComponentsExample {
    public static void main(String[] args) {
        // Panel 1 (Left): Label, Button, TextField, TextArea
        Panel panelLeft = new Panel();
        panelLeft.setLayout(new GridLayout(0, 1, 10, 10)); // vertical layout with spacing
        panelLeft.setBackground(Color.CYAN);

        panelLeft.add(new Label("Hi Dawar! This is the Label Component."));

        panelLeft.add(new Label("Below is Button:"));
        panelLeft.add(new Button("Click Me!"));

        panelLeft.add(new Label("Below is TextField:"));
        panelLeft.add(new TextField(20));

        panelLeft.add(new Label("Below is TextArea:"));
        panelLeft.add(new TextArea(3, 20));

        // Panel 2 (Right): Checkbox, Radio (CheckboxGroup), Choice, List
        Panel panelRight = new Panel();
        panelRight.setLayout(new GridLayout(0, 1, 10, 10)); // vertical layout with spacing
        panelRight.setBackground(Color.LIGHT_GRAY);

        panelRight.add(new Label("Below is Checkbox (multiple selection):"));
        panelRight.add(new Checkbox("Java"));
        panelRight.add(new Checkbox("Python", true));
        panelRight.add(new Checkbox("DBMS"));

        panelRight.add(new Label("Below is CheckboxGroup (Radio buttons):"));
        CheckboxGroup genderGroup = new CheckboxGroup();
        panelRight.add(new Checkbox("Male", genderGroup, true));
        panelRight.add(new Checkbox("Female", genderGroup, false));

        panelRight.add(new Label("Below is Choice dropdown:"));
        Choice choiceCountry = new Choice();
        choiceCountry.add("India");
        choiceCountry.add("USA");
        panelRight.add(choiceCountry);

        panelRight.add(new Label("Below is List (multi-select):"));
        List languageList = new List(4, true);
        languageList.add("Java");
        languageList.add("Python");
        languageList.add("C++");
        languageList.add("JavaScript");
        panelRight.add(languageList);

        // Main Frame
        Frame mainFrame = new Frame("AWT UI Components Example");
        mainFrame.setLayout(new GridLayout(1, 2)); // Two columns: left and right panels
        mainFrame.setSize(1000, 600);

        mainFrame.add(panelLeft);
        mainFrame.add(panelRight);

        mainFrame.setVisible(true);
    }
}
