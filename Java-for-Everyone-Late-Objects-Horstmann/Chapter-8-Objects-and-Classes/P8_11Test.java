import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P8_11Test {
    P8_11 letter = new P8_11("John", "Marry");

    @Test
    public void testGetTextEmpty() {
        assertEquals("Dear John:\nSincerely,\nMarry", letter.getText());
    }

    @Test
    public void testAddLine() {
        letter.addLine("I am sorry we must part.");
        assertEquals("Dear John:\nI am sorry we must part.\nSincerely,\nMarry", letter.getText());
    }
}
