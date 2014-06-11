import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class ButtonFrame1 extends JFrame {
    private static int FRAME_WIDTH = 100;
    private static int FRAME_HEIGHT = 60;
    
    public ButtonFrame1() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    public void createComponents() {
        JButton button = new JButton("Click me!");
        JPanel panel = new JPanel();
        panel.add(button);
        this.add(panel);
        
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);
    }
}
