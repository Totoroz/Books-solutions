import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class ButtonFrame2 extends JFrame {
    private JButton button;
    private JLabel label;
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;
    
    public ButtonFrame2() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent action) {
            label.setText("I was clicked");
        }
    }
    
    public void createComponents() {
       this.button = new JButton("Click me!");
       ActionListener listener = new ClickListener();
       this.button.addActionListener(listener);
       this.label = new JLabel("Hello, World");
       
       JPanel panel = new JPanel();
       panel.add(button);
       panel.add(label);
       this.add(panel);
    }
}
