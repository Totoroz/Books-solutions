import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoSolidSquares extends JFrame {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    private JComponent twoSquaresComponent;

    public TwoSolidSquares() {
        this.twoSquaresComponent = new CreateSquareComponent();
        this.add(twoSquaresComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @SuppressWarnings("serial")
    class CreateSquareComponent extends JComponent {
        public void paintComponent(Graphics g) {
            g.setColor(new Color(128, 0, 128));
            g.fillRect(200, 200, 150, 60);
            g.setColor(Color.RED);
            g.fillRect(100, 100, 150, 60);
        }
    }

    public static void main(String[] args) {
        JFrame testFrame = new TwoSolidSquares();
    }
}
