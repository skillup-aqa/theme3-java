package part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
        int HoursToMinutes = hours * 60;
        return HoursToMinutes;
    }

    public static int convertHoursToSeconds(int hours) {
        int HoursToSeconds = hours * 3600;
        return HoursToSeconds;
    }

    public static void main(String[] args) {
        int hours = 1;
        int result = convertHoursToMinutes(hours);
        System.out.println(result);
        result = convertHoursToSeconds(hours);
        System.out.println(result);
    }
}
