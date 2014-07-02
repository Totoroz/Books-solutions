package bg.synd.ATM;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import bg.synd.ATM.BankAccount.InsufficientFundsException;

public class ATMFrame extends JFrame {
    private static final int FRAME_WIDTH = 230;
    private static final int FRAME_HEIGHT = 250;
    private JButton aButton;
    private JButton bButton;
    private JButton cButton;

    private KeyPad keypad;
    private JTextArea display;
    private ATM theATM;

    public ATMFrame(ATM anATM) {
        this.theATM = anATM;
        this.createComponents();
        this.showState();
        super.setTitle("ATM");
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    private void createComponents() {
        this.keypad = new KeyPad();
        this.display = new JTextArea(4, 20);
        this.aButton = new JButton(" Enter ");
        this.aButton.addActionListener(new AbuttonListener());
        this.bButton = new JButton("    ");
        this.bButton.addActionListener(new BbuttonListener());
        this.cButton = new JButton("    ");
        this.cButton.addActionListener(new CbuttonListener());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(this.aButton);
        buttonPanel.add(this.bButton);
        buttonPanel.add(this.cButton);
        super.setLayout(new FlowLayout());
        super.add(this.keypad);
        super.add(this.display);
        super.add(buttonPanel);
    }

    private void showState() {
        int state = this.theATM.getState();
        this.keypad.clear();
        if (state == ATM.START_STATE) {
            aButton.setText(" Enter ");
            bButton.setText("    ");
            cButton.setText("    ");
            this.display.setText("Enter customer number");
        } else if (state == ATM.PIN_STATE) {
            this.display.setText("Enter PIN\nA = OK");
        } else if (state == ATM.ACCOUNT_STATE) {
            aButton.setText("Checking");
            bButton.setText("Savings");
            cButton.setText("Exit");
            this.display.setText("Select Account");
        } else if (state == ATM.TRANSACT_STATE) {
            aButton.setText("Withdraw");
            bButton.setText("Deposit");
            cButton.setText("Cancel");
            this.display.setText("Balance = " + this.theATM.getBalance() + "\nEnter amount and select transaction");
        }
    }

    class AbuttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int state = theATM.getState();
            if (state == ATM.START_STATE) {
                theATM.setCustomerNumber((int) keypad.getValue());
            } else if (state == ATM.PIN_STATE) {
                theATM.selectCustomer((int) keypad.getValue());
            } else if (state == ATM.ACCOUNT_STATE) {
                theATM.selectAccount(ATM.CHECKING);
            } else if (state == ATM.TRANSACT_STATE) {
                try {
                    theATM.withdraw(keypad.getValue());
                } catch (InsufficientFundsException exception) {
                    JOptionPane.showMessageDialog(null, "Insufficient funds.", "INVALID OPERATION",
                            JOptionPane.ERROR_MESSAGE);
                }
                theATM.back();
            }
            showState();
        }
    }

    class BbuttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int state = theATM.getState();
            if (state == ATM.ACCOUNT_STATE) {
                theATM.selectAccount(ATM.SAVINGS);
            } else if (state == ATM.TRANSACT_STATE) {
                theATM.deposit(keypad.getValue());
                theATM.back();
            }
            showState();
        }
    }

    class CbuttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int state = theATM.getState();
            if (state == ATM.ACCOUNT_STATE) {
                theATM.reset();
            } else if (state == ATM.TRANSACT_STATE) {
                theATM.back();
            }
            showState();
        }
    }
}
