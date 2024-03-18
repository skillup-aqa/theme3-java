package part1;

public class PercentCalculator {
    public static double calculatePercent(double number, double percent) {

        double K = (number * percent)/100 ;

        System.out.println("calculatePercent"+K);
        return K;
    }

    public static void main(String[] args) {
        double number = 100;
        double percent = 10;
        double result = calculatePercent(number, percent);
        System.out.println(result);
    }
}
