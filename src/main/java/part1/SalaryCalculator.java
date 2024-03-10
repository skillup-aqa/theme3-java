package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double SalaryBeforeTaxes = hoursPerMonth * hourlyRate;
        return SalaryBeforeTaxes;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double SalaryBeforeTaxes = hoursPerMonth * hourlyRate;
        double Taxes = (SalaryBeforeTaxes / 100 * 5) + 1562;
        double SalaryAfterTaxes = Math.round(SalaryBeforeTaxes - Taxes);
        return SalaryAfterTaxes;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
