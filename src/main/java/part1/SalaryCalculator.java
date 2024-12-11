package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double salary = hoursPerMonth * hourlyRate;
        return salary;

    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double calculateSalaryBeforeTaxes = hoursPerMonth * hourlyRate;
        double percentageAmount = calculateSalaryBeforeTaxes * 0.95 - 1562;
        double SalaryAfterTaxes = calculateSalaryBeforeTaxes - percentageAmount;
        return Math.ceil(SalaryAfterTaxes * 100) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10.98));
        System.out.println(calculateSalaryAfterTaxes(160, 10.11));
    }
}
