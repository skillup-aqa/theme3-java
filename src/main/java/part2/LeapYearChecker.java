package part2;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        // Read about leap years here: https://en.wikipedia.org/wiki/Leap_year
        // TODO: Implement solution here
        boolean isLeapYear;
        if (year % 100 == 0 && year % 400 != 0) {
            isLeapYear = false;
        } else {
            isLeapYear = year % 4 == 0;
        }
        return isLeapYear;
    }

    public static void main(String[] args) {
        int year = 2020;
        boolean result = isLeapYear(year);
        System.out.println(result);
    }
}
