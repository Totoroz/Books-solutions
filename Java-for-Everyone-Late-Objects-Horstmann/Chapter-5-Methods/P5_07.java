/*Write a method
public static int countWords(String str)
that returns a count of all words in the string str . Words are separated by spaces. For
example, count­Words("Mary had a little lamb") should return 5.*/

public class P5_07 {
    public static int countWords(String sentence) {
	sentence = sentence.trim();
	int wordsCount = 0;
	if (!sentence.isEmpty()) {
	    wordsCount += 1;
	    for (int i = 1; i < sentence.length() - 1; i++) {
		if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ') {
		    wordsCount += 1;
		}
	    }
	}
	return wordsCount;
    }
}
