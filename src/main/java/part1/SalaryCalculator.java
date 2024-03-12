package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double calculateSalaryBeforeTaxes = hoursPerMonth * hourlyRate;
        return calculateSalaryBeforeTaxes;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double SalaryAfterTaxes = Math.ceil((hoursPerMonth * hourlyRate) - ((hoursPerMonth * hourlyRate) * 0.05)) - 1562.0;
        return SalaryAfterTaxes;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
