package part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
        int convertHoursToMinutes = hours*60;
        return convertHoursToMinutes;
    }

    public static int convertHoursToSeconds(int hours) {
       int  convertHoursToSeconds = hours*3600;
        return convertHoursToSeconds;
    }

    public static void main(String[] args) {
        int hours = 2;
        int result = convertHoursToMinutes(hours);
        System.out.println(result);
        result = convertHoursToSeconds(hours);
        System.out.println(result);
    }
}
