package bg.synd.emailSystem;

public class Message {
    private String recipient;
    private String sender;
    private String title;
    private String text;

    public Message(String recipient, String sender, String title, String text) {
        this.recipient = recipient;
        this.sender = sender;
        this.title = title;
        this.text = text;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public String getSender() {
        return this.sender;
    }

    public boolean match(String title) {
        return this.title.equals(title);
    }

    public String getTitle() {
        return this.title;
    }

    public String getText() {
        return this.text;
    }
    
    @Override
    public String toString() {
        return this.title;
    }
}
