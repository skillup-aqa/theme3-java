package part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
        int hoursToMinutes = hours * 60;
        return hoursToMinutes;
    }

    public static int convertHoursToSeconds(int hours) {
        int hoursToSeconds = hours * 3600;
        return hoursToSeconds;
    }

    public static void main(String[] args) {
        int hours = 1;
        int result = convertHoursToMinutes(hours);
        System.out.println(result);
        result = convertHoursToSeconds(hours);
        System.out.println(result);
    }
}
