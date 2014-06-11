import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class InvestmentFrame3 extends JFrame {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 250;
    private static final int AREA_ROWS = 10;
    private static final int AREA_COLUMNS = 30;

    private static final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;
    
    private JLabel rateLabel;
    private JTextField rateField;
    private JButton button;
    private JTextArea resultArea;
    private double balance;
    
    public InvestmentFrame3() {
        this.balance = INITIAL_BALANCE;
        this.resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        this.resultArea.setText(balance + "\n");
        this.resultArea.setEditable(false);
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
            resultArea.append(balance + "\n");
        }
    }
    
    private void createButton() {
        this.button = new JButton("Add interest");
        ActionListener listener = new AddInterestListener();
        this.button.addActionListener(listener);
    }
    
    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(this.rateLabel);
        panel.add(this.rateField);
        panel.add(this.button);
        JScrollPane scrollPane = new JScrollPane(this.resultArea);
        panel.add(scrollPane);
        this.add(panel);
    }
}
