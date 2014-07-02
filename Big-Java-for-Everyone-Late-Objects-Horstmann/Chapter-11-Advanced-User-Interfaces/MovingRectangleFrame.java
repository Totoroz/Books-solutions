

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class MovingRectangleFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    private RectangleComponent scene;
    
    public MovingRectangleFrame() {
        this.scene = new RectangleComponent();
        super.add(this.scene);
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        ActionListener listener = new TimerListener();
        Timer timer = new Timer(100, listener);
        timer.start();
    }

    class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            scene.moveRectangle(1, 1);
        }
        
    }
    
    class RectangleComponent extends JComponent {
        private static final int RECTANGLE_WIDTH = 20;
        private static final int RECTANGLE_HEIGHT = 30;
        private int xLeft;
        private int yTop;

        public RectangleComponent() {
            xLeft = 0;
            yTop = 0;
        }

        public void paintComponent(Graphics g) {
            g.fillRect(xLeft, yTop, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
        }

        public void moveRectangle(int dx, int dy) {
            xLeft += dx;
            yTop += dy;
            super.repaint();
        }
    }
    
    public static void main(String[] args) {
        JFrame testFrame = new MovingRectangleFrame();
    }
}
