import static org.junit.Assert.*;

import org.junit.Test;


public class P5_07Test {
    @Test
    public void blank() {
	assertEquals(0, P5_07.countWords(" "));
    }
    @Test
    public void blank_with_multiple_spaces() {
	assertEquals(0, P5_07.countWords("   "));
    }
    @Test
    public void one_word() {
	assertEquals(1, P5_07.countWords("hey"));
    }
    @Test
    public void two_words() {
	assertEquals(2, P5_07.countWords("hey you"));
    }
    @Test
    public void three_words() {
	assertEquals(3, P5_07.countWords("hey you there"));
    }
    @Test
    public void three_words_and_multiple_spaces() {
	assertEquals(3, P5_07.countWords("hey  spaces  exist"));
    }
    @Test
    public void five_words_and_multiple_spaces() {
	assertEquals(5, P5_07.countWords("these    spaces    seeem     too     long?"));
    }
    @Test
    public void two_words_but_prefix_and_suffix_spaces() {
	assertEquals(2, P5_07.countWords("  prefix     suffix    "));
    }
}
