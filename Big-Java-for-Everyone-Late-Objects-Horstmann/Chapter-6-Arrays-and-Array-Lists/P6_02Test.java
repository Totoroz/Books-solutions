import static org.junit.Assert.*;

import org.junit.Test;

public class P6_02Test {
    @Test
    public void swap() {
        int[] actuals = { 1, 2, 3 };
        P6_02.swap(actuals, 0, 2);
        int[] expecteds = { 3, 2, 1 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void shiftBy1() {
        int[] actuals = { 1, 4, 9, 16, 25 };
        P6_02.shift(actuals);
        int[] expecteds = { 25, 1, 4, 9, 16 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void replace() {
        int[] actuals = { 5, 10, 15, 20 };
        P6_02.replace(actuals, 0);
        int[] expecteds = { 5, 0, 15, 0 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void replaceByNeighBours() {
        int[] actuals = { 5, 10, 15, 20 };
        P6_02.replaceByNeighBours(actuals);
        int[] expecteds = { 5, 15, 20, 20 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void oddArrayRemoveMiddleElement() {
        int[] actuals = { 5, 10, 15 };
        P6_02.removeMiddleElement(actuals);
        int[] expecteds = { 5, 15, 0 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void evenArrayRemoveMiddleElement() {
        int[] actuals = { 5, 10, 15, 20 };
        P6_02.removeMiddleElement(actuals);
        int[] expecteds = { 5, 20, 0, 0 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testMoveEvenElements() {
        int[] actuals = { 5, 10, 15 };
        P6_02.moveEvenElements(actuals);
        int[] expecteds = { 10, 5, 15 };
        assertArrayEquals(expecteds, actuals);
    }
    @Test
    public void testMoveEvenElementsArrayOfFour() {
        int[] actuals = { 5, 10, 12, 15 };
        P6_02.moveEvenElements(actuals);
        int[] expecteds = {10, 12, 5, 15 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testSecondLargestElement() {
        int[] actuals = { 5, 10, 15 };
        assertEquals(10, P6_02.secondLargestElement(actuals));
    }

    @Test
    public void testIsSortedFalse() {
        int[] actuals = { 1, 4, 3, 5, 6 };
        assertFalse(P6_02.isSorted(actuals));
    }
    @Test
    public void testIsSortedTrue() {
        int[] actuals = { 1, 2, 3, 4, 5 };
        assertTrue(P6_02.isSorted(actuals));
    }

    @Test
    public void testHasAdjacentDuplicatesFalse() {
        int[] actuals = { 1, 2, 3, 4, 5 };
        assertFalse(P6_02.hasAdjacentDuplicates(actuals));
    }
    @Test
    public void testHasAdjacentDuplicatesTrue() {
        int[] actuals = { 1, 2, 2, 4, 5 };
        assertTrue(P6_02.hasAdjacentDuplicates(actuals));
    }

    @Test
    public void testHasDuplicateElementsFalse() {
        int[] actuals = { 1, 2, 3, 4, 5 };
        assertFalse(P6_02.hasDuplicateElements(actuals));
    }
    @Test
    public void testHasDuplicateElementsTrue() {
        int[] actuas = { 1, 2, 3, 4, 1 };
        assertTrue(P6_02.hasDuplicateElements(actuas));
    }
}
