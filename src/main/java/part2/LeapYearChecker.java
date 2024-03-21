package part2;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        // Read about leap years here: https://en.wikipedia.org/wiki/Leap_year
        boolean isLeapYear;
        if (year % 4 < 1) isLeapYear = true;
        else isLeapYear = false;
        return isLeapYear;
    }

    public static void main(String[] args) {
        int year = 2020;
        boolean result = isLeapYear(year);
        System.out.println(result);
    }
}
