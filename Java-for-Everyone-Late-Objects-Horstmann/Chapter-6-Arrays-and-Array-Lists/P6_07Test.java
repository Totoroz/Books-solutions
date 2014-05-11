import static org.junit.Assert.*;

import org.junit.Test;


public class P6_07Test {
    @Test
    public void testReverse() {
        int[] actuals = { 1, 2, 3, 4, 5 };
        P6_07.reverse(actuals);
        int[] expecteds = { 5, 4, 3, 2, 1 };
        assertArrayEquals(expecteds, actuals);
    }
}
