package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double calculateSalaryBeforeTaxes = hoursPerMonth * hourlyRate;
        return calculateSalaryBeforeTaxes;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double salaryAfterTaxes = calculateSalaryBeforeTaxes(hoursPerMonth, hourlyRate) * 0.95 - 1562;
        return Math.ceil(salaryAfterTaxes * 100) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
