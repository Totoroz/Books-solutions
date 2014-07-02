package bg.synd.emailSystem;

import java.util.List;

public class EmailSystem {
    private User currentUser;
    private Mailbox currentMailbox;
    private UsersDatabase usersDB;

    private int state;
    protected static final int START_STATE = 1;
    protected static final int ACCOUNT_STATE = 2;
    protected static final int WRITE_EMAIL_STATE = 3;
    protected static final int READ_RECEIVED_EMAILS_STATE = 4;
    protected static final int READ_SENT_EMAILS_STATE = 5;

    public EmailSystem(UsersDatabase usersDB) {
        this.usersDB = usersDB;
        this.reset();
    }

    public void reset() {
        this.state = START_STATE;
        this.currentUser = null;
        this.currentMailbox = null;
    }

    public void sendEmail(String recipientName, Message email) {
        User recipientUser = this.usersDB.findUser(recipientName);
        if (recipientUser != null) {
            currentMailbox.sendEmail(email);
            Mailbox recipientMailbox = recipientUser.getMailbox();
            recipientMailbox.receiveEmail(email);
        }
    }

    public boolean canLoginUser(String username, String password) {
        User u = this.usersDB.findUser(username, password);
        if (u != null) {
            this.currentUser = u;
            return true;
        }
        return false;
    }

    public List<Message> getSentEmails() {
        return currentMailbox.getSentEmails();
    }

    public List<Message> getReceivedEmails() {
        return currentMailbox.getReceivedEmails();
    }

    public Message getMatchingEmail(String title, List<Message> emails) {
        for (Message email : emails) {
            if (email.match(title)) {
                return email;
            }
        }
        return null;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
