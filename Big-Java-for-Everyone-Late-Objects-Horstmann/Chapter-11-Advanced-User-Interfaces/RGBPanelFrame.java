import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

/*P11.1    Write an application with three buttons labeled “Red”, “Green”, and “Blue” that
 changes the background color of a panel in the center of the frame to red, green,
 or blue.
 P11.2  Add icons to the buttons of Exercise P11.1. Use a JButton constructor with an Icon
 argument and supply an ImageIcon .
 */
@SuppressWarnings("serial")
public class RGBPanelFrame extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private JPanel colorPanel;

    public RGBPanelFrame() {
        this.createComponents();
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    private void createComponents() {
        colorPanel = new JPanel();
        this.createPanels();
        super.add(colorPanel, BorderLayout.CENTER);
    }

    private void createPanels() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel buttonsPanel = this.createButtonsPanel();
        JPanel radioButtonsPanel = this.createRadioButtonsPanel();
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        mainPanel.add(radioButtonsPanel, BorderLayout.CENTER);
        super.add(mainPanel, BorderLayout.SOUTH);
    }

    private JPanel createButtonsPanel() {
        JPanel buttonsPanel = new JPanel(new GridLayout(3, 1));
        buttonsPanel.add(this.createButton("Red", Color.RED, new ImageIcon("red-icon.png")));
        buttonsPanel.add(this.createButton("Green", Color.GREEN, new ImageIcon("green-icon.png")));
        buttonsPanel.add(this.createButton("Blue", Color.BLUE, new ImageIcon("blue-icon.png")));
        return buttonsPanel;
    }

    private JPanel createRadioButtonsPanel() {
        JPanel radioButtonsPanel = new JPanel();
        ButtonGroup radioButtonsGroup = new ButtonGroup();
        JRadioButton redRadioButton = this.createRadioButton("Red", Color.RED);
        JRadioButton greenRadioButton = this.createRadioButton("Green", Color.GREEN);
        JRadioButton blueRadioButton = this.createRadioButton("Blue", Color.BLUE);
        radioButtonsGroup.add(redRadioButton);
        radioButtonsGroup.add(greenRadioButton);
        radioButtonsGroup.add(blueRadioButton);
        radioButtonsPanel.add(redRadioButton);
        radioButtonsPanel.add(greenRadioButton);
        radioButtonsPanel.add(blueRadioButton);
        return radioButtonsPanel;
    }

    class ChangeBackgroundListener implements ActionListener {
        private Color color;

        public ChangeBackgroundListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent action) {
            colorPanel.setBackground(color);
        }
    }

    private JButton createButton(String label, final Color color, ImageIcon icon) {
        JButton button = new JButton(label, icon);
        button.addActionListener(new ChangeBackgroundListener(color));
        return button;
    }

    private JRadioButton createRadioButton(String label, final Color color) {
        JRadioButton radioButton = new JRadioButton(label);
        radioButton.addActionListener(new ChangeBackgroundListener(color));
        return radioButton;
    }

    public static void main(String[] args) {
        JFrame testFrame = new RGBPanelFrame();
    }
}
