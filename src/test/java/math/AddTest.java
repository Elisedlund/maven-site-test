package math;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AddTest {

    @Test
    public void addTest() throws Exception {
        assertTrue(Add.add(1, 1) == 2);
    }

    @Test
    public void addFailTest() throws Exception {
        assertTrue(Add.add(1, 1) == 0);
    }

}
