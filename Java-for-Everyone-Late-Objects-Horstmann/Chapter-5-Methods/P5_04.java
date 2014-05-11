/*Write a method
public static String middle(String str)
that returns a string containing the middle character in str if the length of str is odd,
or the two middle characters if the length is even. For example, middle("middle")
returns "dd" .*/

public class P5_04 {
    public static String middle(String sentence) {
	String output = "";
	int sentence_middle = sentence.length() / 2;
	if (sentence.length() % 2 == 0) {
	    output = sentence.substring(sentence_middle - 1, sentence_middle + 1);
	}
	else {
	    output = sentence.substring(sentence_middle, sentence_middle + 1);
	}
	return output;
    }
}
