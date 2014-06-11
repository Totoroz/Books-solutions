import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/*P10.4    Enhance the ButtonViewer1 program in Section 10.2.1 so that it has two buttons
 labeled A and B, each of which prints a message “Button x was clicked!”, where x is
 A or B.
 P10.5   Implement a ButtonViewer1 program as in Exercise P10.4 using only a single listener
class. Hint: Pass the button label to the constructor of the listener.*/
public class ResponseTwoButtons extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 150;
    
    public ResponseTwoButtons() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        JButton aButton = new JButton("Button A");
        JButton bButton = new JButton("Button B");
        JPanel panel = new JPanel();
        
        class ClickListener implements ActionListener {
            private String text;
            
            public ClickListener(String text) {
                this.text = text;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked button " + text);
            }
            
        }
        ActionListener listenerA = new ClickListener("A");
        aButton.addActionListener(listenerA);
        ActionListener listenerB = new ClickListener("B");
        bButton.addActionListener(listenerB);
        panel.add(aButton);
        panel.add(bButton);
        this.add(panel);
    }

    // just for test purposes
    public static void main(String[] args) {
        JFrame testFrame = new ResponseTwoButtons();
    }
}
