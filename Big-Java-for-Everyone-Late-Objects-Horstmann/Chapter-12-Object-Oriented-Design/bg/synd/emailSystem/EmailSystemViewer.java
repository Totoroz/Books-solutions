package bg.synd.emailSystem;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class EmailSystemViewer {
    public static void main(String[] args) throws FileNotFoundException {
        UsersDatabase usersDB = new UsersDatabase("users.txt");
        JFrame frame = new EmailSystemFrame(usersDB);
    }
}
