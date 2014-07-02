import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*Business P11.26  Write a program with a graphical interface that implements a login window with text
 fields for the user name and password. When the login is successful, hide the login
 window and open a new window with a welcome message. Follow these rules for
 validating the password:
 1.   The user name is not case sensitive.
 2.   The password is case sensitive.
 3.   The user has three opportunities to enter valid credentials.
 Otherwise, display an error message and terminate the program. When the program
 starts, read the file users.txt . Each line in that file contains a username and password,
 separated by a space. You should make a users.txt file for testing your program.

 Business P11.27     In Exercise P11.26, the password is shown as it is typed. Browse the Swing documentation 
 to find an appropriate component for entering a password. Improve the
 solution of Exercise P11.26 by using this component instead of a text field. Each
 time the user types a letter, show a ■ character.*/
@SuppressWarnings("serial")
public class LoginFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private HashMap<String, String> usernamesAndPasswords;
    private JTextField usernameField;
    private JTextField passwordField;
    private JButton loginButton;
    private JPanel loginPanel;
    private JPanel welcomePanel;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public LoginFrame() {
        this.createComponents();
        super.setTitle("Login Panel");
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    private void createComponents() {
        this.mainPanel = new JPanel(new CardLayout());
        this.createHashMap();
        this.loginPanel = this.createLoginPanel();
        this.welcomePanel = this.createWelcomePanel();
        this.mainPanel.add(this.loginPanel, "LoginPanel");
        this.mainPanel.add(this.welcomePanel, "WelcomePanel");
        this.cardLayout = (CardLayout) this.mainPanel.getLayout();
        this.cardLayout.show(this.mainPanel, "LoginPanel");
        super.add(this.mainPanel);
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2));
        this.loginButton = new JButton("Login");
        final int TEXT_FIELD_SIZE = 10;
        this.usernameField = new JTextField(TEXT_FIELD_SIZE);
        this.passwordField = new JPasswordField(TEXT_FIELD_SIZE);
        this.loginButton.addActionListener(new ActionListener() {
            private int loginAttempts = 3;
            @Override
            public void actionPerformed(ActionEvent arg0) {
                boolean loggedIn = false;
                String inputUsername = usernameField.getText().toLowerCase();
                String inputPassword = passwordField.getText();
                if (this.loginAttempts == 1) {
                    JOptionPane.showMessageDialog(null, "Number of login attemtps exceeded. Exitting...");
                    System.exit(1);
                }
                for (Map.Entry<String, String> validUser : usernamesAndPasswords.entrySet()) {
                    if (inputUsername.equals(validUser.getKey().toLowerCase())) {
                        if (inputPassword.equals(validUser.getValue())) {
                            System.out.println("Login successful!");
                            cardLayout.show(mainPanel, "WelcomePanel");
                            loggedIn = true;
                        }
                    }
                }
                if (!loggedIn) {
                    this.loginAttempts -= 1;
                    String message = String.format("Invalid username/password. %d %s remaining", this.loginAttempts,
                            (this.loginAttempts > 1) ? "attempts" : "attempt");
                    JOptionPane.showMessageDialog(null, message, "LOGIN FAILED", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        panel.add(new JLabel("Username"));
        panel.add(this.usernameField);
        panel.add(new JLabel("Password"));
        panel.add(this.passwordField);
        panel.add(this.loginButton);
        return panel;
    }

    private JPanel createWelcomePanel() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(new JLabel("Welcome"));
        panel.add(new JButton("Change password"));
        JButton logoutBtn = new JButton("Logout");
        logoutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        panel.add(logoutBtn);
        return panel;
    }

    private void createHashMap() {
        this.usernamesAndPasswords = new HashMap<String, String>();
        try {
            Scanner fileScanner = new Scanner(new File("users.txt"));
            while (fileScanner.hasNextLine()) {
                String[] line = fileScanner.nextLine().split(" ");
                this.usernamesAndPasswords.put(line[0], line[1]);
                System.out.println(line[0] + " " + line[1]);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: no users.txt file found. No users/passwords available to read.", "USERS.TXT NOT FOUND!",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame testFrame = new LoginFrame();
    }
}
