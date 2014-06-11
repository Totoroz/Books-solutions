import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*P10.9    Write a graphical application simulating a bank account. Supply text fields and but-
 tons for depositing and withdrawing money, and for displaying the current balance
 in a label.*/

@SuppressWarnings("serial")
public class BankAccountFrame extends JFrame {
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 300;
    private JButton depositButton;
    private JButton withdrawButton;
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
                        historyTransactions.append("Deposited " + amount);
                        currentBalanceLabel.setText(String.valueOf(balance));

                    } else if (action.equals("withdraw")) {
                        if (balance - amount >= 0) {
                            balance -= amount;
                            historyTransactions.append("Withdrew " + amount);
                            currentBalanceLabel.setText(String.valueOf(balance));
                        } else {
                            historyTransactions.append("Error: withdraw amount exceeds balance");
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
        this.createTextArea();
        amountLabel = new JLabel("Number amount: ");
        currentBalanceLabel = new JLabel(String.valueOf(balance));
        depositButton = new JButton("Deposit");
        ActionListener depositListener = new AddRemoveAmountListener("deposit");
        depositButton.addActionListener(depositListener);
        withdrawButton = new JButton("Withdraw");
        ActionListener withdrawListener = new AddRemoveAmountListener("withdraw");
        withdrawButton.addActionListener(withdrawListener);
        this.createTextField();
    }

    private void createTextArea() {
        final int ROWS = 10;
        final int COLUMNS = 10;
        historyTransactions = new JTextArea(ROWS, COLUMNS);
        historyTransactions.setEditable(false);
    }
    
    private void createTextField() {
        final int FIELD_WIDTH = 15;
        amountField = new JTextField(FIELD_WIDTH);
        amountField.setText("");
    }

    private void createPanel() {
        JPanel panelTop = new JPanel();
        panelTop.add(this.amountLabel);
        panelTop.add(this.amountField);
        panelTop.add(this.depositButton);
        panelTop.add(this.withdrawButton);
        panelTop.add(this.currentBalanceLabel);
        JPanel panelBot = new JPanel();
        panelBot.add(this.historyTransactions);
        this.add(panelTop);
        this.add(panelBot);
    }

    // just for the test
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        JFrame testFrame = new BankAccountFrame();
    }
}
