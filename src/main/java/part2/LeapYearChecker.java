package part2;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        boolean result = true;

        if (year % 4 != 0) {
            result = false;
        } else if ((year % 400 != 0) && (year % 100 == 0)) {
            result = false;
        }
            return result;
        }


        public static void main (String[]args){
            int year = 2020;
            boolean result = isLeapYear(year);
            System.out.println(result);
        }
    }




