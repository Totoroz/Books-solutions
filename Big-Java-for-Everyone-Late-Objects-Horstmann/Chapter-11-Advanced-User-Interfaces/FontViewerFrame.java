import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class FontViewerFrame extends JFrame {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    private JLabel label;
    private JCheckBox italicCheckBox;
    private JCheckBox boldCheckBox;
    private JRadioButton smallButton;
    private JRadioButton mediumButton;
    private JRadioButton largeButton;
    private JRadioButton customSizeButton;
    private JComboBox<String> facenameCombo;
    private ActionListener listener;

    public FontViewerFrame() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        this.label = new JLabel(JOptionPane.showInputDialog(null, "Font text: ", "FONT TEXT", JOptionPane.INFORMATION_MESSAGE));
        super.add(this.label);
        this.listener = new ChoiceListener();
        this.createControlPanel();
        this.setLabelFont();
    }

    class ChoiceListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setLabelFont();
        }
    }

    private void createControlPanel() {
        JPanel facenamePanel = this.createComboBox();
        JPanel sizeGroupPanel = this.createCheckBoxes();
        JPanel styleGroupPanel = this.createRadioButtons();
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 1));
        controlPanel.add(facenamePanel);
        controlPanel.add(sizeGroupPanel);
        controlPanel.add(styleGroupPanel);
        super.add(controlPanel, BorderLayout.SOUTH);
    }

    private JPanel createComboBox() {
        this.facenameCombo = new JComboBox<String>();
        GraphicsEnvironment graphEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        for (Font font : graphEnv.getAllFonts()) {
            this.facenameCombo.addItem(font.getFontName());
        }
        this.facenameCombo.setEditable(true);
        this.facenameCombo.addActionListener(listener);

        JPanel panel = new JPanel();
        panel.add(this.facenameCombo);
        return panel;
    }

    private JPanel createCheckBoxes() {
        this.italicCheckBox = new JCheckBox("Italic");
        this.italicCheckBox.addActionListener(listener);
        this.boldCheckBox = new JCheckBox("Bold");
        this.boldCheckBox.addActionListener(listener);
        JPanel panel = new JPanel();
        panel.add(this.italicCheckBox);
        panel.add(this.boldCheckBox);
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Style"));
        return panel;
    }

    private JPanel createRadioButtons() {
        this.smallButton = new JRadioButton("Small");
        this.smallButton.addActionListener(listener);
        this.mediumButton = new JRadioButton("Medium");
        this.mediumButton.addActionListener(listener);
        this.largeButton = new JRadioButton("Large");
        this.largeButton.addActionListener(listener);
        this.largeButton.setSelected(true);
        this.customSizeButton = new JRadioButton("Custom");
        this.customSizeButton.addActionListener(listener);

        ButtonGroup group = new ButtonGroup();
        group.add(this.smallButton);
        group.add(this.mediumButton);
        group.add(this.largeButton);
        group.add(this.customSizeButton);
        JPanel panel = new JPanel();
        panel.add(this.smallButton);
        panel.add(this.mediumButton);
        panel.add(this.largeButton);
        panel.add(this.customSizeButton);
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));
        return panel;
    }

    private void setLabelFont() {
        String facename = "" + this.facenameCombo.getSelectedItem();
        int style = 0;
        if (this.italicCheckBox.isSelected()) {
            style += Font.ITALIC;
        }
        if (this.boldCheckBox.isSelected()) {
            style += Font.BOLD;
        }

        int size = 0;
        final int SMALL_SIZE = 24;
        final int MEDIUM_SIZE = 36;
        final int LARGE_SIZE = 48;
        boolean isCustomSizeSet = false;
        if (this.smallButton.isSelected()) {
            size = SMALL_SIZE;
        } else if (this.mediumButton.isSelected()) {
            size = MEDIUM_SIZE;
        } else if (this.largeButton.isSelected()) {
            size = LARGE_SIZE;
        } else if (!isCustomSizeSet)
            if (this.customSizeButton.isSelected()) {
                try {
                    size = Integer.parseInt(JOptionPane.showInputDialog("Font size: "));
                    if (size <= 0) {
                        throw new IllegalArgumentException("Font size must be positive");
                    }
                    isCustomSizeSet = true;
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Font size must a positive integer", "INVALID FONT SIZE!",
                            JOptionPane.ERROR_MESSAGE);
                    size = SMALL_SIZE;
                    isCustomSizeSet = false;
                }
            }
        this.label.setFont(new Font(facename, style, size));
        this.label.repaint();
    }

    public static void main(String[] args) {
        JFrame testFrame = new FontViewerFrame();
    }
}
