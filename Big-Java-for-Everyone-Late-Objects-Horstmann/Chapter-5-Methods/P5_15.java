/*Write a recursive method
public static String reverse(String str)
that computes the reverse of a string. For example, reverse("flow") should return
"wolf" . Hint: Reverse the substring starting at the second character, then add the first
character at the end. For example, to reverse "flow" , first reverse "low" to "wol" , then
add the "f" at the end.*/

public class P5_15 {
    public static String reverse(String sentence) {
        if (sentence.length() > 1) {
            return reverse(sentence.substring(1)) + sentence.charAt(0);
        }
        return sentence;
    }
}
