import javax.swing.*;

public class GUIComponents {
    public static void main(String[] args) {
        // Create a button with text label OK
        JButton jbtOK = new JButton("OK");

        // Create a button with text label Cancel
        JButton jbtCancel = new JButton("Cancel");

        // Create a label with text "Enter your name: "
        JLabel jlblName = new JLabel("Enter your name: ");

        // Create a text field with text "Type Name Here"
        JTextField jtfName = new JTextField("Type Name Here");

        JCheckBox jchkBold = new JCheckBox("Bold");
        JCheckBox jchkItalic = new JCheckBox("Italic");
        JRadioButton jrbRed = new JRadioButton("Red");
        JRadioButton jrbYellow = new JRadioButton("Yellow");

        // Create a combo box with several choices
        // array of string containing students' status
        String s1[] = {"Freshman", "Sophomore", "Junior", "Senior"};

        JComboBox String jcboColor = new JComboBox(s1);

        // Create a panel to group components
        JPanel panel = new JPanel();

        panel.add(jbtOK);
        panel.add(jbtCancel);
        panel.add(jlblName);
        panel.add(jtfName);
        panel.add(jchkBold);
        panel.add(jchkItalic);
        panel.add(jrbRed);
        panel.add(jrbYellow);
        panel.add(jcboColor);

        // Create a frame
        JFrame frame = new JFrame();

        frame.add(panel); // Add the panel to the frame
        frame.setTitle("Show GUI Components");
        frame.setSize(450, 100);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}