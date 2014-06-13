import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*P10.11   Write a graphical application for computing statistics of a data set. Supply a text
 field and but­ton for adding floating-point values, and display the current minimum,
 maximum, and average in a label.*/

@SuppressWarnings("serial")
public class SetStatisticsFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private JLabel inputLabel;
    private JTextField inputField;
    private JButton submitButton;
    private JLabel minValueLabel;
    private JLabel minValue;
    private JLabel maxValueLabel;
    private JLabel maxValue;
    private JLabel averageValueLabel;
    private JLabel averageValue;
    private List<Double> numbers;

    public SetStatisticsFrame() {
        numbers = new ArrayList<Double>();
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        this.inputLabel = new JLabel("Number: ");
        final int INPUT_FIELD_SIZE = 10;
        this.inputField = new JTextField(INPUT_FIELD_SIZE);
        this.minValueLabel = new JLabel("Min: ");
        this.minValue = new JLabel("0");
        this.maxValueLabel = new JLabel("Max: ");
        this.maxValue = new JLabel("0");
        this.averageValueLabel = new JLabel("Average: ");
        this.averageValue = new JLabel("0");
        this.createButton();
    }

    private void createButton() {
        this.submitButton = new JButton("Submit");
        this.submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputNumber = Double.parseDouble(inputField.getText());
                    if (inputNumber < Double.parseDouble(minValue.getText())) {
                        minValue.setText(String.valueOf(inputNumber));
                    } else if (inputNumber > Double.parseDouble(maxValue.getText())) {
                        maxValue.setText(String.valueOf(inputNumber));
                    }
                    numbers.add(inputNumber);
                    averageValue.setText(String.valueOf(setSum() / numbers.size()));
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Not a number!", "Invalid input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private double setSum() {
        double sum = 0;
        for (double number : this.numbers) {
            sum += number;
        }
        return sum;
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(this.inputLabel);
        panel.add(this.inputField);
        panel.add(this.submitButton);
        panel.add(this.minValueLabel);
        panel.add(this.minValue);
        panel.add(this.maxValueLabel);
        panel.add(this.maxValue);
        panel.add(this.averageValueLabel);
        panel.add(this.averageValue);
        this.add(panel);
    }

    public static void main(String[] args) {
        JFrame testFrame = new SetStatisticsFrame();
    }
}
