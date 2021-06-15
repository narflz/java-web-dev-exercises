package exercises.technology.test;

import exercises.technology.SmartPhone;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SmartPhoneTest {
    @Test
    public void inheritsSuperInFirstConstructor() {
        SmartPhone galaxyS10 = new SmartPhone(4,128, 256, true, true);
        assertEquals(256, galaxyS10.getRam(), .001);
    }
}
