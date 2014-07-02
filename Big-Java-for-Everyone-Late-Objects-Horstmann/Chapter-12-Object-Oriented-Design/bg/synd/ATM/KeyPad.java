package bg.synd.ATM;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JPanel {
    private JPanel buttonPanel;
    private JButton clearButton;
    private JTextField display;

    public KeyPad() {
        super.setLayout(new BorderLayout());
        this.display = new JTextField();
        super.add(this.display, BorderLayout.NORTH);
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new GridLayout(4, 3));

        this.addButton("7");
        this.addButton("8");
        this.addButton("9");
        this.addButton("4");
        this.addButton("5");
        this.addButton("6");
        this.addButton("1");
        this.addButton("2");
        this.addButton("3");
        this.addButton("0");
        this.addButton(".");
        this.clearButton = new JButton("CE");
        this.clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        this.buttonPanel.add(this.clearButton);
        super.add(this.buttonPanel, BorderLayout.CENTER);
    }

    public double getValue() {
        return Double.parseDouble(this.display.getText());
    }

    public void clear() {
        this.display.setText("");
    }

    private void addButton(final String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (label.equals(".") && display.getText().indexOf(".") != -1) {
                    return;
                }
                display.setText(display.getText() + label);
            }
        });
        this.buttonPanel.add(button);

    }
}
