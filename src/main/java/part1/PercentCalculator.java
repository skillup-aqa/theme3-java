package part1;

public class PercentCalculator {
    public static double calculatePercent(double number, double percent) {
        double calculation = (percent / 100) * number;
        return calculation;
    }

    public static void main(String[] args) {
        double number = 100;
        double percent = 10;
        double result = calculatePercent(number, percent);
        System.out.println(result);
        number = 50;
        percent = 8;
        result = calculatePercent(number, percent);
        System.out.println(result);
    }
}
