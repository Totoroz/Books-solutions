package bg.synd.emailSystem;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EmailSystemFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JPanel loginPanel;
    private JPanel accountPanel;
    private JPanel readReceivedEmailsPanel;
    private JPanel readSentEmailsPanel;
    private JPanel composeEmailPanel;
    private EmailSystem emailSystem;

    public EmailSystemFrame(UsersDatabase usersDB) {
        this.emailSystem = new EmailSystem(usersDB);
        this.createComponents();
        this.showState();
        super.setTitle("Login");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setVisible(true);
    }

    private void createComponents() {
        this.loginPanel = this.createLoginPanel();
        this.accountPanel = this.createAccountPanel();
        this.composeEmailPanel = this.createComposeEmailPanel();
        this.readReceivedEmailsPanel = this.createReadReceivedEmailsPanel();
        this.readSentEmailsPanel = this.createReadSentEmailsPanel();
        this.mainPanel = this.createMainPanel();
        super.add(this.mainPanel);
    }

    private JPanel createMainPanel() {
        this.cardLayout = new CardLayout();
        JPanel panel = new JPanel(this.cardLayout);
        panel.add(this.loginPanel, "loginPanel");
        panel.add(this.accountPanel, "accountPanel");
        panel.add(this.readReceivedEmailsPanel, "readReceivedEmailsPanel");
        panel.add(this.readSentEmailsPanel, "readSentEmailsPanel");
        panel.add(this.composeEmailPanel, "composeEmailPanel");
        return panel;
    }

    private JPanel createLoginPanel() {
        final int FIELD_SIZE = 10;
        JLabel usernameFieldLabel = new JLabel("Username:");
        JLabel passwordFieldLabel = new JLabel("Password:");
        final JTextField usernameField = new JTextField(FIELD_SIZE);
        final JTextField passwordField = new JTextField(FIELD_SIZE);
        JButton loginButton = new JButton("Login");
        this.loginPanel = new JPanel(new BorderLayout());
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();
                if (EmailSystemFrame.this.emailSystem.canLoginUser(username, password)) {
                    EmailSystemFrame.this.emailSystem.setState(EmailSystem.ACCOUNT_STATE);
                }
                EmailSystemFrame.this.showState();
            }
        });
        JPanel rootPanel = new JPanel(new BorderLayout());
        JPanel usernamePanel = new JPanel();
        usernamePanel.add(usernameFieldLabel);
        usernamePanel.add(usernameField);
        JPanel passwordPanel = new JPanel();
        passwordPanel.add(passwordFieldLabel);
        passwordPanel.add(passwordField);
        rootPanel.add(usernamePanel, BorderLayout.NORTH);
        rootPanel.add(passwordPanel, BorderLayout.CENTER);
        rootPanel.add(loginButton, BorderLayout.SOUTH);
        return rootPanel;
    }

    private JPanel createAccountPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        JButton composeEmailButton = new JButton("Compose");
        composeEmailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmailSystemFrame.this.emailSystem.setState(EmailSystem.WRITE_EMAIL_STATE);
                EmailSystemFrame.this.showState();
            }
        });
        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmailSystemFrame.this.emailSystem.setState(EmailSystem.START_STATE);
                EmailSystemFrame.this.showState();
            }
        });
        JButton readReceivedEmailsButton = new JButton("Read received emails");
        readReceivedEmailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmailSystemFrame.this.emailSystem.setState(EmailSystem.READ_RECEIVED_EMAILS_STATE);
                EmailSystemFrame.this.showState();
            }
        });
        JButton readSentEmailsButton = new JButton("Read sent emails");
        readSentEmailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmailSystemFrame.this.emailSystem.setState(EmailSystem.READ_SENT_EMAILS_STATE);
                EmailSystemFrame.this.showState();
            }
        });
        panel.add(composeEmailButton);
        panel.add(readReceivedEmailsButton);
        panel.add(readSentEmailsButton);
        panel.add(logoutButton);
        return panel;
    }

    private JPanel createReadReceivedEmailsPanel() {
        List<Message> emails;
        try {
            emails = this.emailSystem.getReceivedEmails();
        } catch (Exception e) {
            emails = Collections.emptyList();
        }
        JPanel panel = new JPanel();
        JLabel senderLabel = new JLabel("Sender: ");
        JLabel titleLabel = new JLabel("Title: ");
        JTextArea messageText = this.createTextArea();
        if (!emails.isEmpty()) {
            Message mostRecentEmail = emails.get(emails.size() - 1);
            senderLabel.setText(senderLabel.getText() + mostRecentEmail.getSender());
            titleLabel.setText(titleLabel.getText() + mostRecentEmail.getTitle());
            messageText.setText(mostRecentEmail.getText());
        }
        panel.add(this.createEmailsTitlesComboBox(emails));
        JButton backButton = this.createBackButton();
        panel.add(backButton);
        return panel;
    }
    
    private JButton createBackButton() {
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmailSystemFrame.this.emailSystem.setState(EmailSystem.ACCOUNT_STATE);
                EmailSystemFrame.this.showState();
            }
        });
        return backButton;
    }

    private JPanel createReadSentEmailsPanel() {
        List<Message> emails;
        try {
            emails = this.emailSystem.getSentEmails();
        } catch (Exception e) {
            emails = Collections.emptyList();
        }
        JPanel panel = new JPanel();
        JLabel senderLabel = new JLabel("Sender: ");
        JLabel titleLabel = new JLabel("Title: ");
        JTextArea messageText = this.createTextArea();
        if (!emails.isEmpty()) {
            Message mostRecentEmail = emails.get(emails.size() - 1);
            senderLabel.setText(senderLabel.getText() + mostRecentEmail.getSender());
            titleLabel.setText(titleLabel.getText() + mostRecentEmail.getTitle());
            messageText.setText(mostRecentEmail.getText());
        }
        panel.add(this.createEmailsTitlesComboBox(emails));
        JButton backButton = this.createBackButton();
        panel.add(backButton);
        return panel;
    }

    private JComboBox<Message> createEmailsTitlesComboBox(List<Message> emails) {
        JComboBox<Message> comboBox = new JComboBox<Message>();
        for (Message email : emails) {
            comboBox.addItem(email);
        }
        comboBox.setSelectedIndex(comboBox.getItemCount() - 1);
        return comboBox;
    }

    private JTextArea createTextArea() {
        JTextArea textArea = new JTextArea(10, 20);
        textArea.setEditable(true);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        return textArea;
    }

    private JPanel createComposeEmailPanel() {
        
        final int FIELD_SIZE = 10;
        final JTextField senderField = new JTextField(FIELD_SIZE);
        final JTextField recipientField = new JTextField(FIELD_SIZE);
        final JTextField titleField = new JTextField(FIELD_SIZE);
        final JTextArea messageText = this.createTextArea();
        JButton sendEmailButton = new JButton("Send");
        sendEmailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Message email = new Message(recipientField.getText(), senderField.getText(), titleField.getText(),
                        messageText.getText());
                EmailSystemFrame.this.emailSystem.sendEmail(recipientField.getText(), email);
                EmailSystemFrame.this.emailSystem.setState(EmailSystem.ACCOUNT_STATE);
                EmailSystemFrame.this.showState();
            }
        });
        JPanel rootPanel = new JPanel(new BorderLayout());
        JPanel senderPanel = new JPanel();
        senderPanel.add(new JLabel("Sender:"));
        senderPanel.add(senderField);
        JPanel recipientPanel = new JPanel();
        recipientPanel.add(new JLabel("Recipient:"));
        recipientPanel.add(recipientField);
        JPanel fieldsPanel = new JPanel(new BorderLayout());
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Title:"));
        titlePanel.add(titleField);
        fieldsPanel.add(senderPanel, BorderLayout.NORTH);
        fieldsPanel.add(recipientPanel, BorderLayout.CENTER);
        fieldsPanel.add(titlePanel, BorderLayout.SOUTH);
        rootPanel.add(fieldsPanel, BorderLayout.NORTH);
        JPanel botPanel = new JPanel(new BorderLayout());
        botPanel.add(messageText, BorderLayout.CENTER);
        JPanel botButtonsPanel = new JPanel();
        botButtonsPanel.add(this.createBackButton());
        botButtonsPanel.add(sendEmailButton);
        botPanel.add(botButtonsPanel, BorderLayout.SOUTH);
        rootPanel.add(botPanel, BorderLayout.CENTER);
        return rootPanel;
    }

    private void showState() {
        int state = this.emailSystem.getState();
        if (state == EmailSystem.ACCOUNT_STATE) {
            this.cardLayout.show(this.mainPanel, "accountPanel");
        } else if (state == EmailSystem.READ_RECEIVED_EMAILS_STATE) {
            this.cardLayout.show(this.mainPanel, "readReceivedEmailsPanel");
        } else if (state == EmailSystem.READ_SENT_EMAILS_STATE) {
            this.cardLayout.show(this.mainPanel, "readSentEmailsPanel");
        } else if (state == EmailSystem.START_STATE) {
            this.cardLayout.show(this.mainPanel, "loginPanel");
        } else if (state == EmailSystem.WRITE_EMAIL_STATE) {
            this.cardLayout.show(this.mainPanel, "composeEmailPanel");
        }
    }
}
