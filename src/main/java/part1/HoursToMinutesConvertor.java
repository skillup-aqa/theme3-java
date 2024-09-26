package part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
         int minutes= hours * 60;
        return minutes;
    }

    public static int convertHoursToSeconds(int hours) {
        int seconds= hours*60*60;
        return seconds;
    }

    public static void main(String[] args) {
        int hours = 1;
        int result = convertHoursToMinutes(hours);
        System.out.println(result);
        result = convertHoursToSeconds(hours);
        System.out.println(result);
    }
}
