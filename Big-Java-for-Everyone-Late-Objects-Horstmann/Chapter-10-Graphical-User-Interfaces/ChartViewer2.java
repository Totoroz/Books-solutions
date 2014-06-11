import javax.swing.JFrame;


public class ChartViewer2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setTitle("Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartComponent2());
        frame.setVisible(true);
    }
}
