import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JComponent;

public class ChartComponent extends JComponent {
    private ArrayList<Double> values;
    private double maxValue;
    
    public ChartComponent(double max) {
        values = new ArrayList<Double>();
        this.maxValue = max;
    }

    public void append(double value) {
        this.values.add(value);
        this.repaint();
    }

    public void paintComponent(Graphics g) {
        final int GAP = 5;
        final int BAR_HEIGHT = 10;
        int y = GAP;
        for (double value: values) {
            int barWidth = (int) (this.getWidth() * value / this.maxValue);
            g.fillRect(0, y, barWidth, BAR_HEIGHT);
            y += BAR_HEIGHT + GAP;
        }
    }
}
