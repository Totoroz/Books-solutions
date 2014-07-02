package bg.synd.ATM;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ATMViewer {
    public static void main(String[] args) {
        ATM theATM;
        try {
            Bank theBank = new Bank();
            theBank.readCustomers("customers.txt");
            theATM = new ATM(theBank);
            JFrame frame = new ATMFrame(theATM);
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "No customers.txt file found");
        }
        
    }
}
