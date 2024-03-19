package part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {


        int M = hours * 60;

        System.out.println("Minutes="+M);

        return M;
    }

    public static int convertHoursToSeconds(int hours) {


        int M = hours * 60;
        double S = M * 60;
        System.out.println("Seconds="+S);
        return (int) S;
    }

    public static void main(String[] args) {
        int hours = 1;
        int result = convertHoursToMinutes(hours);
        System.out.println(result);
        result = convertHoursToSeconds(hours);
        System.out.println(result);
    }
}
