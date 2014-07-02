public class StringUtils {
    public static boolean isPalindrome(String text) {
        int length = text.length();
        if (length <= 1) {
            return true;
        } else {
            char first = Character.toLowerCase(text.charAt(0));
            char last = Character.toLowerCase(text.charAt(length - 1));
            if (Character.isLetter(first) && Character.isLetter(last)) {
                if (first == last) {
                    String shorterText = text.substring(1, length - 1);
                    return isPalindrome(shorterText);
                } else {
                    return false;
                }
            } else if (!Character.isLetter(last)) {
                String shorterText = text.substring(0, length - 1);
                return isPalindrome(shorterText);
            } else {
                String shorterText = text.substring(1);
                return isPalindrome(shorterText);
            }
        }
    }

    public static String reverse(String text) {
        if (text.length() <= 1) {
            return text;
        }
        return reverse(text.substring(1)) + text.charAt(0);
    }

    public static boolean find(String text, String needle) {
        if (text.length() < needle.length()) {
            return false;
        }
        if (text.startsWith(needle)) {
            return true;
        }
        return find(text.substring(1), needle);
    }

    public static int findIndex(String text, String needle) {
        return findIndex(text, needle, 0);
    }

    public static int findIndex(String text, String needle, int index) {
        if (text.length() < needle.length()) {
            return -1;
        }
        if (text.startsWith(needle)) {
            return index;
        }
        return findIndex(text.substring(1), needle, index + 1);
    }
}
