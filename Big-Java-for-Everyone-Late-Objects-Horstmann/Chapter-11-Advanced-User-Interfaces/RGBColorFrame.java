import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*P11.1    Write an application with three buttons labeled “Red”, “Green”, and “Blue” that
changes the background color of a panel in the center of the frame to red, green,
or blue.
P11.2    Add icons to the buttons of Exercise P11.1. Use a JButton constructor with an Icon
argument and supply an ImageIcon.
P11.3    Write an application with three radio buttons labeled “Red”, “Green”, and “Blue”
that changes the background color of a panel in the center of the frame to red, green,
or blue.*/
@SuppressWarnings("serial")
public class RGBColorFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    private JPanel colorPanel;
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;

    public RGBColorFrame() {
        this.createComponents();
        super.setTitle("RGB Color Chooser");
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    class ColorListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            setFrameColor();
        }
    }

    private void createComponents() {
        colorPanel = new JPanel();
        super.add(colorPanel, BorderLayout.CENTER);
        this.createSlidersPanel();
        this.setFrameColor();
    }

    private void createSlidersPanel() {
        ChangeListener listener = new ColorListener();
        this.redSlider = new JSlider(0, 255, 255);
        this.redSlider.addChangeListener(listener);
        this.greenSlider = new JSlider(0, 255, 170);
        this.greenSlider.addChangeListener(listener);
        this.blueSlider = new JSlider(0, 255, 1);
        this.blueSlider.addChangeListener(listener);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(4, 2));
        controlPanel.add(new JLabel("Red"));
        controlPanel.add(this.redSlider);
        controlPanel.add(new JLabel("Green"));
        controlPanel.add(this.greenSlider);
        controlPanel.add(new JLabel("Blue"));
        controlPanel.add(this.blueSlider);
        JButton colorChooserButton = new JButton("Color chooser");
        colorChooserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColor = JColorChooser.showDialog(null, "PIck a color", new Color(50, 50, 50));
                setFrameColor(newColor);
            }
        });
        controlPanel.add(colorChooserButton);
        super.add(controlPanel, BorderLayout.SOUTH);
    }

    private void setFrameColor() {
        this.colorPanel.setBackground(new Color(this.redSlider.getValue(), this.greenSlider.getValue(), this.blueSlider
                .getValue()));
        this.colorPanel.repaint();
    }

    private void setFrameColor(Color newColor) {
        this.colorPanel.setBackground(newColor);
    }

    public static void main(String[] args) {
        JFrame testFrame = new RGBColorFrame();
    }
}
