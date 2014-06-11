import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*P10.3    Enhance the ButtonViewer1 program in Section 10.2.1 so that it has two buttons, each
of which prints a message “I was clicked n times!” whenever the button is clicked.
Each button should have a separate click count.*/

public class EnhancedTwoButtons extends JFrame {
    private static int FRAME_WIDTH = 120;
    private static int FRAME_HEIGHT = 100;
    
    public EnhancedTwoButtons() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setVisible(true);
    }
    
    private void createComponents() {
        JButton aButton = new JButton("Click button A");
        JButton bButton = new JButton("Click button B");
        JPanel panel = new JPanel();

        class EnhancedClickLister implements ActionListener {
            private int count;
            @Override
            public void actionPerformed(ActionEvent e) {
                count += 1;
                System.out.println("I was clicked " + count + " time" + (count > 1? "s": ""));
            }
        }
        ActionListener aListener = new EnhancedClickLister();
        aButton.addActionListener(aListener);
        ActionListener bListener = new EnhancedClickLister();
        bButton.addActionListener(bListener);
        panel.add(aButton);
        panel.add(bButton);
        this.add(panel);
    }
    
    // bad practice, but for sake of testing..
    public static void main(String[] args) {
        JFrame testFrame = new EnhancedTwoButtons();
    }
}
