
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        for (String s : permutations("eat")) {
            System.out.println(s);
        }
    }

    public static List<String> permutations(String word) {
        List<String> result = new ArrayList<String>();
        if (word.length() <= 1) {
            result.add(word);
            return result;
        } else {
            for (int i = 0; i < word.length(); i++) {
                String shorter = word.substring(0, i) + word.substring(i + 1);
                List<String> shorterPermutations = permutations(shorter);
                for (String s : shorterPermutations) {
                    result.add(word.charAt(i) + s);
                }
            }
            return result;
        }
    }
}