import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/*Business P10.35  Write a graphical application that produces a restaurant bill.
 Provide buttons for ten popular dishes or drink items. (You
 decide on the items and their prices.) Provide text fields for
 entering less popular items and prices. In a text area, show the
 bill, including tax and a suggested tip.*/

public class RestaurantBillFrame extends JFrame {
    private JButton smallMealButton;
    private JButton mediumMealButton;
    private JButton bigMealButton;
    private JButton soupButton;
    private JButton colaButton;
    private JButton beerButton;
    private JButton juiceButton;
    private JButton finalizeButton;
    private JLabel currentBillLabel;

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 150;

    public RestaurantBillFrame() {
        this.createComponents();
        this.createPanel();
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    private void createComponents() {
        this.currentBillLabel = new JLabel("0.00");
        this.createButtons();
    }

    private void createButtons() {
        smallMealButton = new JButton("Small Meal");
        mediumMealButton = new JButton("Medium Meal");
        bigMealButton = new JButton("Big Meal");
        soupButton = new JButton("Soup");
        colaButton = new JButton("Cola");
        beerButton = new JButton("Beer");
        juiceButton = new JButton("Juice");
        finalizeButton = new JButton("Finalize purchase");

        class AddItemListener implements ActionListener {
            private double itemPrice;

            public AddItemListener(double itemPrice) {
                this.itemPrice = itemPrice;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                double currentBillSum = Double.valueOf(currentBillLabel.getText()) + this.itemPrice;
                currentBillLabel.setText(String.format("%.4f", currentBillSum));
            }
        }

        smallMealButton.addActionListener(new AddItemListener(3));
        mediumMealButton.addActionListener(new AddItemListener(4));
        bigMealButton.addActionListener(new AddItemListener(5));
        soupButton.addActionListener(new AddItemListener(3.2));
        colaButton.addActionListener(new AddItemListener(1.5));
        beerButton.addActionListener(new AddItemListener(2));
        juiceButton.addActionListener(new AddItemListener(1.8));
        finalizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, String.format("Your bill is: %s", currentBillLabel.getText(),
                        "PURCHASE FINALIZED!", JOptionPane.INFORMATION_MESSAGE));
                currentBillLabel.setText("0.00");
            }
        });
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(this.currentBillLabel);
        panel.add(this.finalizeButton);
        panel.add(this.smallMealButton);
        panel.add(this.mediumMealButton);
        panel.add(this.bigMealButton);
        panel.add(this.soupButton);
        panel.add(this.colaButton);
        panel.add(this.beerButton);
        panel.add(this.juiceButton);
        super.add(panel);
    }
    
    public static void main(String[] args) {
        JFrame testFrame = new RestaurantBillFrame();
    }
}
