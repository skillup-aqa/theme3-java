package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double salary = hoursPerMonth * hourlyRate;
        return salary;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double grossSalary = hoursPerMonth * hourlyRate;
        double percentageAmount = ((grossSalary * 5) / 100) + 1562;
        double SalaryAfterTaxes = grossSalary - percentageAmount;
        return SalaryAfterTaxes;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
