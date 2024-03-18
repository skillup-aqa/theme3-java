package part1;

public class HoursToMinutesConvertorAndSecondsTest {
    @Test
    public void testConvertHoursToMinutes() {
        int hours = 1;
        int expected = 60;
        int result = HoursToMinutesConvertor.convertHoursToMinutes(hours);
        assertEquals(result, expected);
    }

    @Test
    public void testConvertHoursToSeconds() {
        int hours = 1;
        int expected = 3600;
        int result = HoursToMinutesConvertor.convertHoursToSeconds(hours);
        assertEquals(result, expected);
    }
}
