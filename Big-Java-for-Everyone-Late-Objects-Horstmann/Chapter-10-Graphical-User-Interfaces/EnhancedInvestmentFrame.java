import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*P10.8    Add error handling to the program in Section 10.3.2. If the interest rate is not a
 floating-point number, or if it less than 0, display an error message, using a JOption­
 Pane (see Special Topic 2.5).*/

@SuppressWarnings("serial")
public class EnhancedInvestmentFrame extends JFrame {
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

    public EnhancedInvestmentFrame() {
        balance = INITIAL_BALANCE;
        resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        resultArea.setText(balance + "\n");
        resultArea.setEditable(false);
        this.createTextField();
        this.createButton();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createTextField() {
        rateLabel = new JLabel("Interest Rate: ");
        final int FIELD_WIDTH = 10;
        rateField = new JTextField(FIELD_WIDTH);
        rateField.setText("" + DEFAULT_RATE);
    }

    class AddInterestListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            try {
                double rate = Double.parseDouble(rateField.getText());
                if (rate < 0) {
                    throw new IllegalArgumentException();
                }
                double interest = balance * rate / 100;
                balance = balance + interest;
                resultArea.append(balance + "\n");
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Rate is a positive floating-point number.",
                        "Invalid rate value entered!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void createButton() {
        button = new JButton("Add Interest");
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(button);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        panel.add(scrollPane);
        this.add(panel);
    }

    // only for the test
    public static void main(String[] args) {
        JFrame testFrame = new EnhancedInvestmentFrame();
    }
}
