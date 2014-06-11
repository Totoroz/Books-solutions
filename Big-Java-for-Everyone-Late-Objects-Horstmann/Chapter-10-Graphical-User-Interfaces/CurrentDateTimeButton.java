import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*P10.6    Enhance the ButtonViewer1 program so that it prints the date and time at which the
 button was clicked.*/

public class CurrentDateTimeButton extends JFrame {
    private static final int FRAME_WIDTH = 150;
    private static final int FRAME_HEIGHT = 150;

    public CurrentDateTimeButton() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setVisible(true);
    }

    private void createComponents() {
        JButton button = new JButton("Click");
        class AddCurrentDateTimeListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(new java.util.Date());
            }
        }
        ActionListener listener = new AddCurrentDateTimeListener();
        button.addActionListener(listener);
        this.add(button);
    }
    
    // just for testing
    public static void main(String[] args) {
        JFrame testFrame = new CurrentDateTimeButton();
    }
}
