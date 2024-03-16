package part1;

public class DivisionWithRemainderCalculator {
    public static int calculateRemainder(int dividend, int divisor) {
        int a = 10;
        int b = 3;
        int sum=a%b;
        int sum1=a/b;
        System.out.println(sum1);
        return sum;

    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int result = calculateRemainder(dividend, divisor);
        System.out.println(result);
    }
}
