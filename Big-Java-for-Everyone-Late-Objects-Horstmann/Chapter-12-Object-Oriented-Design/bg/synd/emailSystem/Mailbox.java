package bg.synd.emailSystem;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {
    private List<Message> receivedEmails;
    private List<Message> sentEmails;

    public Mailbox() {
        this.receivedEmails = new ArrayList<Message>();
        this.sentEmails = new ArrayList<Message>();
    }

    public List<Message> getReceivedEmails() {
        return this.receivedEmails;
    }

    public List<Message> getSentEmails() {
        return this.sentEmails;
    }

    public void receiveEmail(Message email) {
        this.receivedEmails.add(email);
    }

    public void sendEmail(Message email) {
        this.sentEmails.add(email);
    }
}
