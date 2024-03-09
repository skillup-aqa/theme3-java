package part1;

public class ArithmeticMeanCalculator {
    public static double calculateArithmeticMean(double a, double b, double c) {

        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 12;
        double c = 23;
        double result = calculateArithmeticMean(a, b, c);
        System.out.println(result);
    }
}
