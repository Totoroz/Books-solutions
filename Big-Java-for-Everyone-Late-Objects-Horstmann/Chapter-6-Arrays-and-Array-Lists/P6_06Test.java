import static org.junit.Assert.*;
import org.junit.Test;

public class P6_06Test {
    @Test
    public void testAlternatingSum() {
        int[] actuals = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
        int expected = P6_06.alternatingSum(actuals);
        assertEquals(1 - 4 + 9 - 16 + 9 - 7 + 4 - 9 + 11, expected);
    }
}
