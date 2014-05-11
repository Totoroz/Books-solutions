import static org.junit.Assert.*;

import org.junit.Test;


public class P5_02Test {
    @Test
    public void allTheSame_true() {
	assertTrue(P5_02.allTheSame(1, 1, 1));
    }
    @Test
    public void allTheSame_false() {
	assertFalse(P5_02.allTheSame(3, 4, 5));
    }
    @Test
    public void allDifferent_two_same() {
	assertFalse(P5_02.allDifferent(5, 5, 4));
    }
    @Test
    public void allDifferent_true() {
	assertTrue(P5_02.allDifferent(1, 3, 5));
    }
    @Test
    public void sorted_false() {
	assertFalse(P5_02.sorted(5, 6, 2));
    }
    @Test
    public void sorted_true() {
	assertTrue(P5_02.sorted(3, 2, 1));
    }
}
