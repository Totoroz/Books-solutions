import static org.junit.Assert.*;

import org.junit.Test;


public class P5_03Test {
    @Test
    public void firstDigit() {
	assertEquals(1, P5_03.firstDigit(1543));
    }
    @Test
    public void lastDigit() {
	assertEquals(6, P5_03.lastDigit(6554326));
    }
    @Test
    public void digits() {
	assertEquals(2, P5_03.digits(33));
    }
}
