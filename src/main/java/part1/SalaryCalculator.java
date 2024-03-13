package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double calculateSalaryBeforeTaxes = hoursPerMonth * hourlyRate;
        return calculateSalaryBeforeTaxes;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double SalaryAfterTaxes = (((hoursPerMonth * hourlyRate) - ((hoursPerMonth * hourlyRate) * 0.05)) - 1562.0);
        return Math.round((SalaryAfterTaxes * 100) / 100);
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160.00, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
