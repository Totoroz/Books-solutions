import javax.swing.JComponent;
import javax.swing.JFrame;


public class ChartViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setTitle("A chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent chart = new ChartComponent(10);
        frame.add(chart);
        frame.setVisible(true);
    }
}
