import javax.swing.*;

public class GuiInput {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog(null,"Enter your name:","Input Demo",JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Hi "+firstName,"Popup Message", JOptionPane.INFORMATION_MESSAGE);
    }
}