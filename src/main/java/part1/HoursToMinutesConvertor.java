package part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
        int result = hours * 60;
        return result;
    }

    public static int convertHoursToSeconds(int hours) {
        int result2 = hours * 3600;
        return result2;
    }

    public static void main(String[] args) {
        int hours = 2;
        int result = convertHoursToMinutes(hours);
        System.out.println(result);
        result = convertHoursToSeconds(hours);
        System.out.println(result);
    }
}
