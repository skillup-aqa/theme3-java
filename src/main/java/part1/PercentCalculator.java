package part1;
import java.util.Scanner;
public class PercentCalculator {
    public static double calculatePercent(double number, double percent) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter namber");
        double a = scan.nextDouble();
               System.out.println("Enter %");
        double b = scan.nextDouble();
        double x = (a*b)/100;
        return x;
    }

    public static void main(String[] args) {
        double number = 100;
        double percent = 10;
        double result = calculatePercent(number, percent);
        System.out.println(result);
    }
}
