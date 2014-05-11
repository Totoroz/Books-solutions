import static org.junit.Assert.*;

import org.junit.Test;


public class P5_04Test {
    @Test
    public void oddSentence() {
	assertEquals("t", P5_04.middle("str"));
    }
    @Test
    public void evenSentence() {
	assertEquals("dd", P5_04.middle("middle"));
    }
}
