package part2;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        // Read about leap years here: https://en.wikipedia.org/wiki/Leap_year
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static void main(String[] args) {
        int year = 2020;
        boolean result = isLeapYear(year);
        System.out.println(result);
    }
}
