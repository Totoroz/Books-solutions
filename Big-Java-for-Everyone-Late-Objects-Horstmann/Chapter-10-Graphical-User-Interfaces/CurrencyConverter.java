import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*P10.34   Write a graphical application to implement a currency converter between euros and
 U.S. dollars, and vice versa. Provide two text fields for the euro and dollar amounts.
 Between them, place two buttons labeled > and < for updating the field on the right
 or left. For this exercise, use a conversion rate of 1 euro = 1.42 U.S. dollars.*/

@SuppressWarnings("serial")
public class CurrencyConverter extends JFrame {
    private JLabel euroLabel;
    private JTextField euroAmountField;
    private JLabel dollarLabel;
    private JTextField dollarAmountField;
    private JButton convertEuroButton;
    private JButton convertDollarsButton;
    private JLabel converseRateLabel;
    private JTextField converseRateField;
    private static final double INITIAL_CONVERSE_RATE = 1.42;
    private static final int FIELD_SIZE = 5;
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 50;

    public CurrencyConverter() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        this.converseRateLabel = new JLabel("Converse rate: ");
        this.converseRateField = new JTextField(FIELD_SIZE);
        this.converseRateField.setText(String.valueOf(INITIAL_CONVERSE_RATE));
        this.euroLabel = new JLabel("Euro: ");
        this.euroAmountField = new JTextField(FIELD_SIZE);
        this.euroAmountField.setText("0");
        this.dollarLabel = new JLabel("Dollars: ");
        this.dollarAmountField = new JTextField(FIELD_SIZE);
        this.dollarAmountField.setText("0");
        this.createButtons();
    }

    private void createButtons() {
        class ConvertListener implements ActionListener {
            private String toCurrency;

            public ConvertListener(String currency) {
                this.toCurrency = currency.toLowerCase();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                double conversionRate = INITIAL_CONVERSE_RATE;
                try {
                    conversionRate = Double.parseDouble(converseRateField.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Conversion rate must be a positive number",
                            "Error: invalid conversion rate", JOptionPane.ERROR_MESSAGE);
                }
                if (this.toCurrency.equals("euro")) {
                    try {
                        double amount = Double.parseDouble(dollarAmountField.getText());
                        euroAmountField.setText(String.format("%.4f", amount / conversionRate));
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Dollar amount must a positive number",
                                "Error: invalid dollar amount", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (this.toCurrency.equals("dollars")) {
                    try {
                        double amount = Double.parseDouble(euroAmountField.getText());
                        dollarAmountField.setText(String.format("%.4f", amount / conversionRate));
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Euro amount must be a positive number",
                                "Error: invalid euro amount", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        this.convertEuroButton = new JButton("<");
        ActionListener convertEuroListener = new ConvertListener("euro");
        this.convertEuroButton.addActionListener(convertEuroListener);
        ActionListener converDollarsListener = new ConvertListener("dollars");
        this.convertDollarsButton = new JButton(">");
        this.convertDollarsButton.addActionListener(converDollarsListener);
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(euroLabel);
        panel.add(euroAmountField);
        panel.add(convertEuroButton);
        panel.add(converseRateLabel);
        panel.add(converseRateField);
        panel.add(convertDollarsButton);
        panel.add(dollarLabel);
        panel.add(dollarAmountField);
        this.add(panel);
    }

    public static void main(String[] args) {
        JFrame testFrame = new CurrencyConverter();
    }
}
