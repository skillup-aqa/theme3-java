package part1;

public class DivisionWithRemainderCalculator {
    public static int calculateRemainder(int dividend, int divisor) {
        int Reminder = dividend % divisor;
        return Reminder;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int result = calculateRemainder(dividend, divisor);
        System.out.println(result);
    }
}
