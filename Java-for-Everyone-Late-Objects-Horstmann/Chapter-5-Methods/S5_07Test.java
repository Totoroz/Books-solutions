import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class S5_07Test {
    @Test
    public void cubeVolume_of_1() {
	assertEquals(1, S5_07.cubeVolume(1), 0.1);
    }
    @Test
    public void cubeVolume_of_2() {
	assertEquals(8, S5_07.cubeVolume(2), 0.1);
    }
    @Test
    public void cubeVolume_of_3() {
	assertEquals(27, S5_07.cubeVolume(3), 0.1);
    }
}
