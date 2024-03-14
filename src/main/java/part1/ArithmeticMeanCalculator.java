package part1;

public class ArithmeticMeanCalculator {
    public static double calculateArithmeticMean(double a, double b, double c) {
        double x = 20;
        double y = 20;
        double z = 50;
        double sum = (x+y+z)/3;
        return sum;
        //System.out.println(sum);
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 30;
        double result = calculateArithmeticMean(a, b, c);
        System.out.println(result);
    }
}
