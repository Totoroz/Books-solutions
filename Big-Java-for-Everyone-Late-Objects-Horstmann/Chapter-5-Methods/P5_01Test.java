import static org.junit.Assert.*;

import org.junit.Test;


public class P5_01Test {
    @Test
    public void smallest_when_x_smallest() {
	assertEquals(5, P5_01.smallest(5, 6, 7), 0);
    }
    @Test
    public void smallest_when_y_smallest() {
	assertEquals(5, P5_01.smallest(10, 5, 7), 0);
    }
    @Test
    public void smallest_when_z_smallest() {
	assertEquals(5, P5_01.smallest(10, 9, 5), 0);
    }
    @Test
    public void smallest_when_x_and_y_smallest() {
	assertEquals(7, P5_01.smallest(7, 7, 9), 0);
    }
    @Test
    public void smallest_when_x_and_z_smallest() {
	assertEquals(3, P5_01.smallest(3, 5, 3), 0);
    }
    @Test
    public void smallest_when_y_and_z_smallest() {
	assertEquals(1, P5_01.smallest(5, 1, 1), 0);
    }
    @Test
    public void average() {
	assertEquals((1 + 2 + 3) / 3, P5_01.average(1, 2, 3), 0.1);
    }
}
