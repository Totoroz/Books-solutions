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

/*Business P10.33  Implement a graphical application that simulates a cash register. Provide a text field
 for the item price and two buttons for adding the item to the sale, one for taxable
 items and one for non-taxable items. In a text area, display the register tape that lists
 all items (labeling the taxable items with a *), followed by the amount due. Provide
 another button for starting a new sale.*/

@SuppressWarnings("serial")
public class CashRegisterFrame extends JFrame {
    private JLabel itemPriceLabel;
    private JButton addTaxableItemButton;
    private JButton addNonTaxableItemButton;
    private JTextField addItemField;
    private JTextArea currentSaleArea;
    private JButton finalizeSaleButton;
    private final static int FRAME_WIDTH = 280;
    private final static int FRAME_HEIGHT = 160;

    public CashRegisterFrame() {
        this.createComponents();
        this.createPanel();
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    private void createComponents() {
        this.itemPriceLabel = new JLabel("Item price:");
        this.createButtons();
        final int FIELD_SIZE = 5;
        this.addItemField = new JTextField(FIELD_SIZE);
        final int COLUMNS = 6;
        final int ROWS = 6;
        this.currentSaleArea = new JTextArea(COLUMNS, ROWS);
        this.currentSaleArea.setEditable(false);
    }

    private void createButtons() {
        this.addTaxableItemButton = new JButton("Add taxable");
        this.addNonTaxableItemButton = new JButton("Add non-taxable");
        this.finalizeSaleButton = new JButton("Finalize");
        class AddItemListener implements ActionListener {
            private boolean taxable;

            public AddItemListener(boolean taxable) {
                this.taxable = taxable;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double itemPrice = Double.parseDouble(addItemField.getText());
                    if (itemPrice <= 0) {
                        throw new IllegalArgumentException();
                    } else if (taxable) {
                        currentSaleArea.append(String.format("*%.2f\n", itemPrice));
                    } else {
                        currentSaleArea.append(String.format("%.2f\n", itemPrice));
                    }
                } catch (Exception except) {
                    JOptionPane.showMessageDialog(null, "Error: item price must be a positive number",
                            "INVALID ITEM PRICE", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        ActionListener addTaxableListener = new AddItemListener(true);
        this.addTaxableItemButton.addActionListener(addTaxableListener);
        ActionListener addNonTaxableListener = new AddItemListener(false);
        this.addNonTaxableItemButton.addActionListener(addNonTaxableListener);
        this.finalizeSaleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double pricesSum = 0;
                for (String item : currentSaleArea.getText().split("\n")) {
                    item = (item.charAt(0) == '*') ? item.substring(1, item.length() - 1): item;
                    pricesSum += Double.parseDouble(item);
                }
                JOptionPane.showMessageDialog(null, String.format("Your bill is: %.2f", pricesSum), "FINALIZED SALE", JOptionPane.INFORMATION_MESSAGE);
                currentSaleArea.setText("");
            }
        });
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(this.itemPriceLabel);
        panel.add(this.addItemField);
        panel.add(this.addTaxableItemButton);
        panel.add(this.addNonTaxableItemButton);
        JScrollPane scrollableCurrentSaleArea = new JScrollPane(this.currentSaleArea);
        panel.add(scrollableCurrentSaleArea);
        panel.add(finalizeSaleButton);
        super.add(panel);
    }

    public static void main(String[] args) {
        JFrame testFrame = new CashRegisterFrame();
    }
}
