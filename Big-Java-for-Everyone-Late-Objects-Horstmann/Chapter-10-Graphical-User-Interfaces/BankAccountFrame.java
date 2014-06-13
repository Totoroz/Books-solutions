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

/*P10.9    Write a graphical application simulating a bank account. Supply text fields and but-
 tons for depositing and withdrawing money, and for displaying the current balance
 in a label.*/

@SuppressWarnings("serial")
public class BankAccountFrame extends JFrame {
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 450;
    private JButton depositButton;
    private JButton withdrawButton;
    private JLabel infoBalanceLabel;
    private JLabel currentBalanceLabel;
    private JLabel amountLabel;
    private JTextField amountField;
    private JTextArea historyTransactions;
    private static final double INITIAL_BALANCE = 1000;
    private double balance;

    public BankAccountFrame() {
        this.balance = INITIAL_BALANCE;
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        this.createTextArea();
        amountLabel = new JLabel("Number amount: ");
        currentBalanceLabel = new JLabel(String.valueOf(balance));
        this.createButtons();
        this.createTextField();
        infoBalanceLabel = new JLabel("Balance: ");
    }

    private void createButtons() {
        class AddRemoveAmountListener implements ActionListener {
            private String action;

            public AddRemoveAmountListener(String action) {
                this.action = action.toLowerCase();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountField.getText());
                    if (amount < 0) {
                        historyTransactions.append("Error: negative amount!\n");
                        throw new IllegalArgumentException();
                    }
                    if (action.equals("deposit")) {
                        balance += amount;
                        historyTransactions.append("Deposited " + amount + "\n");
                        currentBalanceLabel.setText(String.valueOf(balance));

                    } else if (action.equals("withdraw")) {
                        if (balance - amount >= 0) {
                            balance -= amount;
                            historyTransactions.append("Withdrew " + amount + "\n");
                            currentBalanceLabel.setText(String.valueOf(balance));
                        } else {
                            historyTransactions.append("Error: withdraw amount exceeds balance\n");
                            throw new IllegalArgumentException();
                        }
                    }
                } catch (Exception except) {
                    JOptionPane.showMessageDialog(null, "Amount must be a positive number! "
                            + "Also withdraw amount must be less or equal to current balance.", "Invalid number!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        depositButton = new JButton("Deposit");
        ActionListener depositListener = new AddRemoveAmountListener("deposit");
        depositButton.addActionListener(depositListener);
        withdrawButton = new JButton("Withdraw");
        ActionListener withdrawListener = new AddRemoveAmountListener("withdraw");
        withdrawButton.addActionListener(withdrawListener);
    }

    private void createTextArea() {
        final int ROWS = 25;
        final int COLUMNS = 30;
        historyTransactions = new JTextArea(ROWS, COLUMNS);
        historyTransactions.setEditable(false);
    }

    private void createTextField() {
        final int FIELD_WIDTH = 9;
        amountField = new JTextField(FIELD_WIDTH);
        amountField.setText("");
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(this.withdrawButton);
        panel.add(this.amountLabel);
        panel.add(this.amountField);
        panel.add(this.depositButton);
        panel.add(this.infoBalanceLabel);
        panel.add(this.currentBalanceLabel);
        JScrollPane scrollHistoryTransactions = new JScrollPane(this.historyTransactions);
        panel.add(scrollHistoryTransactions);
        this.add(panel);
    }

    // just for the test
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        JFrame testFrame = new BankAccountFrame();
    }
}
