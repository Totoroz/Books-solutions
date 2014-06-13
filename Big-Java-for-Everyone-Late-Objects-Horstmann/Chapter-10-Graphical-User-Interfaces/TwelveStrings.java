import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class TwelveStrings extends JFrame {
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 260;
    private JComponent twelveStringsComponent;
    
    public TwelveStrings() {
        twelveStringsComponent = new StringsComponent();
        this.add(twelveStringsComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    class StringsComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLACK);
            g.drawString("BLACK", 0, 10);
            g.setColor(Color.BLUE);
            g.drawString("BLUE", 0, 30);
            g.setColor(Color.CYAN);
            g.drawString("CYAN", 0, 50);
            g.setColor(Color.GRAY);
            g.drawString("GRAY", 0, 70);
            g.setColor(Color.DARK_GRAY);
            g.drawString("DARK_GRAY", 0, 90);
            g.setColor(Color.LIGHT_GRAY);
            g.drawString("LIGHT_GRAY", 0, 110);
            g.setColor(Color.GREEN);
            g.drawString("GREEN", 0, 130);
            g.setColor(Color.MAGENTA);
            g.drawString("MAGENTA", 0, 150);
            g.setColor(Color.ORANGE);
            g.drawString("ORANGE", 0, 170);
            g.setColor(Color.PINK);
            g.drawString("PINK", 0, 190);
            g.setColor(Color.RED);
            g.drawString("RED", 0, 210);
            g.setColor(Color.YELLOW);
            g.drawString("YELLOW", 0, 230);
        }
    }
    
    public static void main(String[] args) {
        JFrame testFrame = new TwelveStrings();
    }
}
