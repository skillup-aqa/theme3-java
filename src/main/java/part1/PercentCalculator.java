package part1;

public class PercentCalculator {
    public static double calculatePercent(double number, double percent) {
        double calculatePercent = (number * percent) / 100;
        return calculatePercent;
    }

    public static void main(String[] args) {
        double number = 100;
        double percent = 10;
        double result = calculatePercent(number, percent);
        System.out.println(result);
    }
}
