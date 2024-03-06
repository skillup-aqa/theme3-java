package part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
        // TODO: Implement solution here
        return (hours*60);
    }

    public static int convertHoursToSeconds(int hours) {
        // TODO: Implement solution here
        return (hours*60)*60;
    }

    public static void main(String[] args) {
        int hours = 2;
        int result = convertHoursToMinutes(hours);
        System.out.println(result);
        result = convertHoursToSeconds(hours);
        System.out.println(result);
    }
}
