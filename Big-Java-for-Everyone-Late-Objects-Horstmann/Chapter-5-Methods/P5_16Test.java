import static org.junit.Assert.*;

import org.junit.Test;


public class P5_16Test {
    @Test
    public void str_deed() {
        assertTrue(P5_16.isPalindrome("deed"));
    }
    @Test
    public void str_rotor() {
        assertTrue(P5_16.isPalindrome("rotor"));
    }
    @Test
    public void str_aibohphobia() {
        assertTrue(P5_16.isPalindrome("aibohphobia"));
    }
}
