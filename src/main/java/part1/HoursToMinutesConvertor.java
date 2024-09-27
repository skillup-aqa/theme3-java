package part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
        return hours * 60;
    }

    public static int convertHoursToSeconds(int hours) {
        return hours * 3600;
    }

    public static void main(String[] args) {
        int hours = 1;
        int result1 = convertHoursToMinutes(hours);
        System.out.println(result1);
        int result2 = convertHoursToSeconds(hours);
        System.out.println(result2);
    }
}
