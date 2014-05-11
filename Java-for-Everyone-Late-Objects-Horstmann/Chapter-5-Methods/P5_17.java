/*Use recursion to implement a method public static boolean find(String str, String
match) that tests whether match is contained in str :
boolean b = find("Mississippi", "sip"); // Sets b to true
Hint: If str starts with match , then you are done. If not, consider the string that you
obtain by removing the first character.*/

public class P5_17 {
    public static boolean find(String str, String match) {
        if (str.length() < match.length()) {
            return false;
        }
        if (str.charAt(0) == match.charAt(0)) {
            boolean equal = true;
            for (int i = 0; i < match.length(); i++) {
                if (str.charAt(i) != match.charAt(i)) {
                    equal = false;
                }
            }
            if (equal) {
                return true;
            }
        }
        return find(str.substring(1), match);
    }
}
