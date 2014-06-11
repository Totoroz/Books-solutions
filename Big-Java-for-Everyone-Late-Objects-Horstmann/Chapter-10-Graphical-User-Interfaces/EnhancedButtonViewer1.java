import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*P10.2  Enhance the ButtonViewer1 program in Section 10.2.1 so that it prints a message
“I was clicked n times!” whenever the button is clicked. The value n should be incremented with each click.*/

@SuppressWarnings("serial")
public class EnhancedButtonViewer1 extends JFrame {
    private static int FRAME_WIDTH = 100;
    private static int FRAME_HEIGHT = 60;
    
    public EnhancedButtonViewer1() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    public void createComponents() {
        JButton button = new JButton("Click me!");
        JPanel panel = new JPanel();
        panel.add(button);
        this.add(panel);
        
        class EnhancedClickListener implements ActionListener {
            private int count;
            public void actionPerformed(ActionEvent event) {
                count += 1;
                System.out.println("I was clicked " + count + " time" + (count > 1? "s": ""));
            }
        }
        ActionListener listener = new EnhancedClickListener();
        button.addActionListener(listener);
    }
    
    // bad practice, but for sake of testing..
    public static void main(String[] args) {
        JFrame testFrame = new EnhancedButtonViewer1();
    }
}
