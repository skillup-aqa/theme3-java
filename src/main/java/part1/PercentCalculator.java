package part1;

public class PercentCalculator {
    public static double calculatePercent(double number, double percent) {
       double calculatePercent = (number*percent)/100;
        return calculatePercent;
    }

    public static void main(String[] args) {
        double number = 50;
        double percent = 8;
        double result = calculatePercent(number, percent);
        System.out.println(result);
    }
}
