package part2;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        boolean result = false;

        if (year % 400 == 0) {
            result = true;
        } else if (year % 4 == 0 && year / 100 != 0) {
            result = true;
        }
        return false;
    }

    public static void main(String[] args) {
        int year = 2020;
        boolean result = isLeapYear(year);
        System.out.println(result);
    }
}
