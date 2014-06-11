import static org.junit.Assert.*;
import org.junit.Test;

public class P6_05Test {
    @Test
    public void testRemoveMin() {
        int[] actuals = { 10, 19, 20, 1, 6, 0, 0 };
        P6_05.removeMin(actuals);
        int[] expecteds = { 10, 19, 20, 6, 0, 0, 0 };
        assertArrayEquals(expecteds, actuals);
    }
}
