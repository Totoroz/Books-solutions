import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class FaceFrame extends JFrame {
    private static int FRAME_WIDTH = 200;
    private static int FRAME_HEIGHT = 200;
    private JComponent faceComponent;

    public FaceFrame() {
        faceComponent = new FaceComponent();
        this.add(faceComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class FaceComponent extends JComponent {
        public void paintComponent(Graphics g) {
            g.drawOval(50, 50, 150, 150);
            g.drawOval(130, 125, 10, 10);
            g.drawOval(150, 125, 10, 10);
            g.drawLine(120, 160, 180, 160);
        }
    }

    public static void main(String[] args) {
        JFrame testFrame = new FaceFrame();
    }
}
