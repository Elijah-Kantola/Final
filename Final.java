public class Final {

    public static boolean canDrive(int age) {
        int drivingAge = 16;
        return age >= drivingAge;
    }

    @Test
    public void TestBelowAge() {
        assertFalse(Final.canDrive(15));
    }

    @Test
    public void TestAtAge() {
        assertTrue(Final.canDrive(16));
    }

    @Test
    public void TestAboveAge() {
        assertTrue(Final.canDrive(17));
    }

    @Test
    public void TestZero() {
        assertFalse(Final.canDrive(0));
    }

    @Test
    public void TestMaxValue() {
        assertTrue(Final.canDrive(Integer.MAX_VALUE));
    }
}

