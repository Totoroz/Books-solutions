/*It is a well-known phenomenon that most people are easily able to read a text whose
words have two characters flipped, provided the first and last letter of each word are
not changed. For example,
	I dn’ot gvie a dman for a man taht can olny sepll a wrod one way. (Mrak Taiwn)
Write a method String scramble(String word) that constructs a scrambled version of a
given word, ran­domly flipping two characters other than the first and last one. Then
write a program that reads words and prints the scrambled words.*/

public class P5_08 {
    public static String scramble(String word) {
        if (word.length() > 3) {
            int pos1 = (int) (Math.random() * (word.length() - 3)) + 1;
            int pos2 = (int) (Math.random() * (word.length() - pos1 - 2)) + pos1 + 1;

            if (pos2 >= word.length() - 1) {
                System.out.println(pos1 + " " + pos2);
                System.exit(0);
            }
            return word.substring(0, pos1) + word.charAt(pos2) + word.substring(pos1 + 1, pos2)
                    + word.charAt(pos1) + word.substring(pos2 + 1);
        }
        else {
            return word;
        }
    }
}
