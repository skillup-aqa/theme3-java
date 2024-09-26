package part1;

public class ArithmeticMeanCalculator {
    public static double calculateArithmeticMean(double a, double b, double c) {
       double avarageOfNumbers = (a + b + c) / 3;
        return avarageOfNumbers;
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        double result = calculateArithmeticMean(a, b, c);
        System.out.println(result);
    }
}
