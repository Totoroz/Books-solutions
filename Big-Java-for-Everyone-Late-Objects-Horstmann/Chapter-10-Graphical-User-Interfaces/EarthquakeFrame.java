import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EarthquakeFrame extends JFrame {
    private JLabel fieldLabel;
    private JTextField magnitudeField;
    private JButton displayButton;
    private JLabel earthquakeDescription;
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 100;

    public EarthquakeFrame() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        this.fieldLabel = new JLabel("Magnitude: ");
        final int MAGNITUDE_FIELD_SIZE = 5;
        this.magnitudeField = new JTextField(MAGNITUDE_FIELD_SIZE);
        this.earthquakeDescription = new JLabel("");
        this.createDisplayButton();
    }

    private void createDisplayButton() {
        displayButton = new JButton("Display: ");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double magnitude = Double.parseDouble(magnitudeField.getText());
                    earthquakeDescription.setText(new Earthquake(magnitude).getDescription());
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Magnitude level must a number", "Invalid magnitude level",
                            JOptionPane.ERROR_MESSAGE);
                } catch (InvalidMagnitudeLevelException exception) {
                    JOptionPane.showMessageDialog(null, "Magnitude level must be a number greater than 0",
                            "Invalid magnitude level", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(this.fieldLabel);
        panel.add(this.magnitudeField);
        panel.add(this.displayButton);
        panel.add(this.earthquakeDescription);
        this.add(panel);
    }

    // source of info http://www.geo.mtu.edu/UPSeis/magnitude.html
    class Earthquake {
        private String description;
        private double magnitudeLevel;

        public Earthquake(double magnitudeLevel) throws InvalidMagnitudeLevelException {
            this.magnitudeLevel = magnitudeLevel;
            this.createDescription();
        }

        private void createDescription() throws InvalidMagnitudeLevelException {
            if (magnitudeLevel <= 0) {
                throw new InvalidMagnitudeLevelException();
            } else if (magnitudeLevel <= 2.5) {
                this.description = "Usually not felt, but can be recorded by seismograph.";
            } else if (magnitudeLevel <= 5.5) {
                this.description = "Often felt, but only causes minor damage.";
            } else if (magnitudeLevel <= 6.0) {
                this.description = "Slight damage to buildings and other structures.";
            } else if (magnitudeLevel <= 6.9) {
                this.description = "May cause a lot of damage in very populated areas.";
            } else if (magnitudeLevel <= 7.9) {
                this.description = "Major earthquake. Serious damage.";
            } else {
                this.description = "Great earthquake. Can totally destroy communities near the epicenter.";
            }
        }

        public String getDescription() {
            return this.description;
        }
    }

    // extra custom exception just for fun
    class InvalidMagnitudeLevelException extends Exception {
        public InvalidMagnitudeLevelException() {
        }

        public InvalidMagnitudeLevelException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        JFrame testFrame = new EarthquakeFrame();
    }
}
