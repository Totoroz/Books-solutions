/*Write a method
public static String repeat(String str, int n)
that returns the string str repeated n times. For example, repeat("ho",
"hohoho" .*/

public class P5_05 {
    public static String repeat(String sentence, int times) {
	String output = "";
	for (int i = 0; i < times; i++) {
	    output += sentence;
	}
	return output;
    }
}
