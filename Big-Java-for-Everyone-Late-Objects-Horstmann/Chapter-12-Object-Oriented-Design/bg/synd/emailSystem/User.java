package bg.synd.emailSystem;

public class User {
    private String name;
    private String password;
    private Mailbox mailbox;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.mailbox = new Mailbox();
    }

    public boolean match(String aName, String aPassword) {
        return this.name.equals(name) && this.password.equals(aPassword);
    }

    public String getName() {
        return this.name;
    }

    protected String getPassword() {
        return this.password;
    }

    public Mailbox getMailbox() {
        return this.mailbox;
    }
}
