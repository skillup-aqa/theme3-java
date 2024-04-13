package part2;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
       if (year % 4 == 0) {
           if (year % 100 != 0 || year % 400 == 0) {
               return true; // It is a leap year
           }
       }
        return false; // It is a not leap year
    }

    public static void main(String[] args) {
        int year = 2025;
        boolean result = isLeapYear(year);
        System.out.println(result);
    }
}
