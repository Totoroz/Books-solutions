import org.testng.Assert;
import org.testng.annotations.Test;

public class P6_04Test {
    @Test
    public void testSumWithoutSmallest() {
        int[] actuals = { 5, 10, 2, 3, 4 };
        Assert.assertEquals(P6_04.sumWithoutSmallest(actuals), 5 + 10 + 2 + 3 + 4 - 2);
    }

    @Test
    public void testFindSmallest() {
        int[] actuals = { 5, 10, 2, 3, 4 };
        Assert.assertEquals(P6_04.findSmallest(actuals), 2);
    }
}
