package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double salary = hoursPerMonth * hourlyRate;
        return Math.floor(salary);
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double grossSalary = hoursPerMonth * hourlyRate;
        double percentageAmount = grossSalary * 0.95 - 1562;
        double SalaryAfterTaxes = grossSalary - percentageAmount;
        return Math.floor(SalaryAfterTaxes);
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
