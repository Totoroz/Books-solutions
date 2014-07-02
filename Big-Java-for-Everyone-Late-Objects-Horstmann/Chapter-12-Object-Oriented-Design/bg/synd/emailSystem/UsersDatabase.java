package bg.synd.emailSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsersDatabase {
    private List<User> users;

    public UsersDatabase() {
        this.users = new ArrayList<User>();
    }

    public UsersDatabase(String filename) throws FileNotFoundException {
        this();
        this.readUsers(filename);
    }

    public void readUsers(String filename) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File(filename));
        while (fileIn.hasNext()) {
            String username = fileIn.next();
            String password = fileIn.next();
            System.out.println(username);
            System.out.println(password);
            User u = new User(username, password);
            this.addUser(u);
        }
        fileIn.close();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public User findUser(String username, String password) {
        for (User user : this.users) {
            if (user.match(username, password)) {
                return user;
            }
        }
        return null;
    }

    public User findUser(String username) {
        for (User user : this.users) {
            if (user.getName().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
