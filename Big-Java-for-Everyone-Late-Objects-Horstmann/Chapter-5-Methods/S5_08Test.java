import static org.junit.Assert.*;
import org.junit.Test;

public class S5_08Test {
    @Test
    public void squareArea_of_2() {
	assertEquals(1, S5_08.squareArea(1), 0.1);
    }
    @Test
    public void squareArea_of_4() {
	assertEquals(4, S5_08.squareArea(2), 0.1);
    }
    @Test
    public void squareArea_of_6() {
	assertEquals(36, S5_08.squareArea(6), 0.1);
    }
}
