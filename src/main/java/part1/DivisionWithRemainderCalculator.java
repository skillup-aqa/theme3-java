package part1;

public class DivisionWithRemainderCalculator {
    public static int calculateRemainder(int dividend, int divisor) {
        return dividend % divisor;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int remainder_value = calculateRemainder(dividend, divisor);
        System.out.println(remainder_value);
    }
}
