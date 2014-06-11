import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class InvestmentFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private double balance;
    private static final int INTEREST_RATE = 5;
    private static final int INITIAL_BALANCE = 1000;
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 200;

    public InvestmentFrame() {
        this.balance = INITIAL_BALANCE;
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    class AddInterestListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double interest = balance * INTEREST_RATE / 100;
            balance += interest;
            label.setText("Balance: " + balance);
        }
    }

    public void createComponents() {
        button = new JButton("Click me");
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
        label = new JLabel("Balance: " + this.balance);
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        this.add(panel);
    }
}
