import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame {
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 200;
    private JTextField display;

    public CalculatorFrame() {
        super.setLayout(new BorderLayout());
        this.display = new JTextField("");
        this.display.setEditable(false);
        super.add(display, BorderLayout.NORTH);
        this.createPanel();
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    private void createPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3));
        buttonPanel.add(this.createDigitButton("7"));
        buttonPanel.add(this.createDigitButton("8"));
        buttonPanel.add(this.createDigitButton("9"));
        buttonPanel.add(this.createOperatorButton("/"));
        buttonPanel.add(this.createDigitButton("4"));
        buttonPanel.add(this.createDigitButton("5"));
        buttonPanel.add(this.createDigitButton("6"));
        buttonPanel.add(this.createOperatorButton("*"));
        buttonPanel.add(this.createDigitButton("1"));
        buttonPanel.add(this.createDigitButton("2"));
        buttonPanel.add(this.createDigitButton("3"));
        buttonPanel.add(this.createOperatorButton("-"));
        buttonPanel.add(this.createDigitButton("0"));
        buttonPanel.add(this.createDigitButton("."));
        buttonPanel.add(this.createOperatorButton("="));
        buttonPanel.add(this.createOperatorButton("+"));
        super.add(buttonPanel, BorderLayout.CENTER);
    }

    class DigitButtonListener implements ActionListener {
        private String digit;

        public DigitButtonListener(String digit) {
            this.digit = digit;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText() + this.digit);
        }
    }

    private JButton createDigitButton(String digit) {
        JButton button = new JButton(digit);
        button.addActionListener(new DigitButtonListener(digit));
        return button;
    }

    private JButton createOperatorButton(String operator) {
        return new JButton(operator);
    }
    
    public static void main(String[] args) {
        JFrame testFrame = new CalculatorFrame();
    }
}
