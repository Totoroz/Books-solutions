/*Write a recursive method
    public static boolean isPalindrome(String str)
that returns true if str is a palindrome, that is, a word that is the same when reversed.
Examples of palin­drome are “deed”, “rotor”, or “aibohphobia”. Hint: A word is a
palindrome if the first and last letters match and the remainder is also a palindrome.*/

public class P5_16 {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        else {
            return false;
        }
    }
}
