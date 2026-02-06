// PRACTICAL NO 15 A


import java.awt.*;

public class RadioCheckboxGroup extends Frame
{
    Label label;
    CheckboxGroup group;
    Checkbox radioButton1, radioButton2;
    Checkbox checkBox1, checkBox2;

    public RadioCheckboxGroup()
    {
        setLayout(new FlowLayout());

        label = new Label("Select your preferences:");

        // Radio Button Group
        group = new CheckboxGroup();
        radioButton1 = new Checkbox("Male", group, false);
        radioButton2 = new Checkbox("Female", group, false);

        // Checkboxes
        checkBox1 = new Checkbox("Agree to Terms");
        checkBox2 = new Checkbox("Subscribe to Newsletter");

        add(label);
        add(radioButton1);
        add(radioButton2);
        add(checkBox1);
        add(checkBox2);

        setSize(300, 200);
        setTitle("Radio Button and Checkbox Example");
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new RadioCheckboxGroup();
    }
}
