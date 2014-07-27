package collections;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequency {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencies = new TreeMap<String, Integer>();
        Scanner fileIn = new Scanner(new File("alice30.txt"));
        while (fileIn.hasNext()) {
            String word = clean(fileIn.next());
            Integer count = frequencies.get(word);
            count = count != null ? count + 1 : 1;
            frequencies.put(word, count);
        }
        fileIn.close();
        for (String key : frequencies.keySet()) {
            System.out.printf("%s - %d\n", key, frequencies.get(key));
        }
    }

    public static String clean(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                r += ch;
            }
        }
        return r.toLowerCase();
    }
}
