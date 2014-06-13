import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*P10.14   Write a graphics program that draws your name in red, contained inside a blue rect­
 angle. Provide a class NameViewer and a class NameComponent .*/

@SuppressWarnings("serial")
public class NameViewer extends JFrame {
    private final static int FRAME_WIDTH = 150;
    private final static int FRAME_HEIGHT = 150;
    private JComponent nameComponent;

    public NameViewer() {
        JPanel panel = new JPanel();
        nameComponent = new NameComponent();
        this.add(this.nameComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    class NameComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillRect(0, 0, 150, 150);
            g.setColor(Color.RED);
            g.drawString("Swing", 61, 75);
        }
    }
    
    public static void main(String[] args) {
        JFrame testFrame = new NameViewer();
    }
}
