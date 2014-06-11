import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FilledFrame extends JFrame {
    private JButton button;
    private JLabel label;

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;

    public FilledFrame() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    public void createComponents() {
        button = new JButton("Click me");
        label = new JLabel("Hello world");
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        this.add(panel);
    }
}
