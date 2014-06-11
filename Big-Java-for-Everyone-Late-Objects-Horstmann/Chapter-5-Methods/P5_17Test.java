import static org.junit.Assert.*;

import org.junit.Test;


public class P5_17Test {
    @Test
    public void hay_in_haystack() {
        assertTrue(P5_17.find("haystack", "hay"));;
    }
    @Test
    public void sip_in_Mississippi() {
        assertTrue(P5_17.find("Mississippi", "sip"));
    }
}
