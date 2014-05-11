import static org.junit.Assert.*;

import org.junit.Test;


public class P5_06Test {
    @Test
    public void no_vowels() {
	assertEquals(0, P5_06.countVowels("DCTPZXC"));
    }
    @Test
    public void three_vowels() {
	assertEquals(3, P5_06.countVowels("AEGY"));
    }
    @Test
    public void all_vowels() {
	assertEquals(5, P5_06.countVowels("AEIOU"));
    }
}
