import static org.junit.Assert.*;

import org.junit.Test;

public class P5_15Test {
    @Test
    public void reverseString_ofOne() {
        assertEquals("a", P5_15.reverse("a"));
    }
    @Test
    public void reverseString_ofTwo() {
        assertEquals("cba", P5_15.reverse("abc"));
    }
    @Test
    public void reverseString_ofFive() {
        assertEquals("retaw", P5_15.reverse("water"));
    }
}
