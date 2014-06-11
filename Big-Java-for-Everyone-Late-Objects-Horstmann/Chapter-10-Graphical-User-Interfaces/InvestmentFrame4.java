import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InvestmentFrame4 extends JFrame {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    private static final int CHART_WIDTH = 300;
    private static final int CHART_HEIGHT = 300;

    private static final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;

    private JLabel rateLabel;
    private JTextField rateField;
    private JButton button;
    private ChartComponent chart;
    private double balance;

    public InvestmentFrame4() {
        this.balance = INITIAL_BALANCE;
        this.chart = new ChartComponent(3 * INITIAL_BALANCE);
        this.chart.setPreferredSize(new Dimension(CHART_WIDTH, CHART_HEIGHT));
        this.chart.append(INITIAL_BALANCE);
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
            chart.append(balance);
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
        panel.add(this.chart);
        this.add(panel);
    }
}
