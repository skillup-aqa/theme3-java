package part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
        int hours1 = 2;
        int minutes = hours1*60;
        return minutes;
    }

    public static int convertHoursToSeconds(int hours) {
        int hours2 = 2;
        int seconds = hours2*3600;
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
