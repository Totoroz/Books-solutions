import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/*P10.1  Write a program that shows a square frame filled with 100 buttons labeled 1 to 100.
Nothing needs to happen when you press any of the buttons.*/

@SuppressWarnings("serial")
public class HundredButtons extends JFrame {
    public HundredButtons() {
        JPanel panel = new JPanel();
        for (int i = 1; i < 101; i++) {
            JButton button = new JButton("" + i);
            panel.add(button);
        }
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(435, 430);
        this.setVisible(true);
    }
    
    // bad practice, but just for testing
    public static void main(String[] args) {
        JFrame testFrame = new HundredButtons();
    }
}
