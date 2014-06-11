/*Having a secure password is a very important practice, when much of our informa-
tion is stored online. Write a program that validates a new password, following these
rules:
•    The password must be at least 8 characters long.
•    The password must have at least one uppercase and one lowercase letter
•    The password must have at least one digit.
Write a program that asks for a password, then asks again to confirm it. If the
passwords don’t match or the rules are not fulfilled, prompt again. Your program
should include a method that checks whether a password is valid.*/

public class P5_30 {
    public static boolean checkLength(String password) {
        return password.length() > 8;
    }

    public static boolean hasUppercaseAndLowercase(String password) {
        boolean uppercase = false;
        boolean lowercase = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                uppercase = true;
            }
            else if (Character.isLowerCase(password.charAt(i))) {
                lowercase = true;
            }
        }
        if (lowercase == true && uppercase == true) {
            return true;
        }
        return false;
    }
    public static boolean hasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit((password.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
    public static boolean passwordsMatch(String input, String expected) {
        return input == expected;
    }
}
