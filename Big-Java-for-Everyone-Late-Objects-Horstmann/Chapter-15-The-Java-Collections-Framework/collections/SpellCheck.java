package collections;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;

public class SpellCheck {
    public static Set<String> readWords(String filename) {
        Set<String> words = new HashSet<String>();
        try {
            for (String line : Files.readAllLines(new File(filename).toPath(), Charset.defaultCharset())) {
                String[] splitLine = line.split("\\s+");
                for (String word : splitLine) {
                    words.add(word.toLowerCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    public static void main(String[] args) {
        Set<String> dictionaryWords = readWords("/usr/share/dict/american-english");
        Set<String> documentWords = readWords("alice30.txt");

        for (String word : documentWords) {
            if (!dictionaryWords.contains(word)) {
                System.out.println(word);
            }
        }
    }
}
