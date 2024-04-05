package part2;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        // Read about leap years here: https://en.wikipedia.org/wiki/Leap_year
        // TODO: Implement solution here
        if (year % 400 == 0 || year % 4 == 0 )
            return true;
        else if (year % 100 != 0)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int year = 2001;
        boolean result = isLeapYear(year);
        System.out.println(result);
    }
}
