import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*P10.7    Implement the ClickListener in the ButtonViewer2 program of Section 10.2.2 as a
 regular class (that is, not an inner class). Hint: Store a reference to the label. Add a
 con­structor to the listener class that sets the reference.*/

@SuppressWarnings("serial")
public class EnhancedButtonViewer2 extends JFrame {
    private JButton button;
    private JLabel label;
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;
    

    public EnhancedButtonViewer2() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setVisible(true);
    }

    private void createComponents() {
        button = new JButton("Click me!");
        label = new JLabel("Hello, World!");
        ActionListener listener = new SeperatedClickListener(label);
        button.addActionListener(listener);
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);
    }
    
    // just for testing
    public static void main(String[] args) {
        JFrame testFrame = new EnhancedButtonViewer2();
    }
}

class SeperatedClickListener implements ActionListener {
    private JLabel label;

    public SeperatedClickListener(JLabel label) {
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("I was clicked.");
    }
}