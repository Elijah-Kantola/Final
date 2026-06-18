import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Final {

    public static boolean canDrive(int age) {
        int drivingAge = 16;
        return age >= drivingAge;
    }

    @Test
    public void testBelowAge() {
        assertFalse(Final.canDrive(15));
    }

    @Test
    public void testAtAge() {
        assertTrue(Final.canDrive(16));
    }

    @Test
    public void testAboveAge() {
        assertTrue(Final.canDrive(17));
    }

    @Test
    public void testNegative() {
        assertFalse(Final.canDrive(-1));
    }

    @Test
    public void testZero() {
        assertFalse(Final.canDrive(0));
    }

    @Test
    public void testAboveZero() {
        assertfalse(Final.canDrive(1));
    }

    @Test
    public void belowMaxValue() {
        assertTrue(Final.canDrive(Integer.MAX_VALUE - 1));
    }

    @Test
    public void testMaxValue() {
        assertTrue(Final.canDrive(Integer.MAX_VALUE));
    }

    @Test
    public void testMinValue() {
        assertFalse(Final.canDrive(Integer.MIN_VALUE));
    }

    @Test
    public void testJustAboveMinValue() {
        assertFalse(Final.canDrive(Integer.MIN_VALUE + 1));
    }
}

