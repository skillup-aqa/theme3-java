package part1;

public class ArithmeticMeanCalculator {
    public static double calculateArithmeticMean(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        double result = calculateArithmeticMean(9.0, 2.0, 3.0);

        System.out.println(result);
    }
}
