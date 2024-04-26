package part1;

public class DivisionWithRemainderCalculator {
    public static int calculateRemainder(int dividend, int divisor) {
        int result = dividend % divisor;
        return result;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 5;
        int result = calculateRemainder(dividend, divisor);
        System.out.println(result);
    }
}
