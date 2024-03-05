package part1;

import static java.lang.Math.ceil;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        // TODO: Implement solution here
        double resultBT = hoursPerMonth * hourlyRate;
        return resultBT;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double resultBT = hoursPerMonth * hourlyRate;
        final double eSV = 1562.0;
        final double percent = 0.05;
        double resultAT = ceil((resultBT - resultBT * percent - eSV) * 100) / 100;
        return resultAT;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
