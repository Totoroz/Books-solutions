import static org.junit.Assert.*;

import org.junit.Test;


public class P5_05Test {
    @Test
    public void repeatOnce() {
	assertEquals("hey", P5_05.repeat("hey", 1));
    }
    @Test
    public void repeatTwice() {
	assertEquals("heyhey", P5_05.repeat("hey", 2));
    }
    @Test
    public void repeatThreeTimes() {
	assertEquals("hohoho", P5_05.repeat("ho", 3));
    }
}
