package part1;

public class DivisionWithRemainderCalculator {
    public static int calculateRemainder(int dividend, int divisor) {
        int calculateRemainder = dividend % divisor;
        return calculateRemainder; 
    }

    public static void main(String[] args) {
        int dividend = 30;
        int divisor = 3;
        int result = calculateRemainder(dividend, divisor);
        System.out.println(result);
    }
}
