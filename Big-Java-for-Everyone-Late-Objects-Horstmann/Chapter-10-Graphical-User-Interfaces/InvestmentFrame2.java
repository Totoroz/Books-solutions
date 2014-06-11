import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InvestmentFrame2 extends JFrame {
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 100;
    private static final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;

    private JLabel rateLabel;
    private JTextField rateField;
    private JButton button;
    private JLabel resultLabel;
    private double balance;

    public InvestmentFrame2() {
        this.balance = INITIAL_BALANCE;
        this.resultLabel = new JLabel("Balance: " + this.balance);
        this.createTextField();
        this.createButton();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
        this.rateLabel = new JLabel("Interest rate: ");
        final int FIELD_WIDTH = 10;
        this.rateField = new JTextField(FIELD_WIDTH);
        this.rateField.setText("" + DEFAULT_RATE);
    }

    class AddInterestListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double rate = Double.parseDouble(rateField.getText());
            double interest = balance * rate / 100;
            balance += interest;
            resultLabel.setText("Balance: " + balance);
        }
    }

    private void createButton() {
        this.button = new JButton("Add Interest");
        ActionListener listener = new AddInterestListener();
        this.button.addActionListener(listener);
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(this.rateLabel);
        panel.add(this.rateField);
        panel.add(this.button);
        panel.add(this.resultLabel);
        this.add(panel);
    }
}
