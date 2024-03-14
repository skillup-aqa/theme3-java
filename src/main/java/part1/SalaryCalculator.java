package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double salaryBeforeTax = Math.ceil(hoursPerMonth * hourlyRate * 100) / 100;
        return salaryBeforeTax;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double tax = hoursPerMonth * hourlyRate * 0.05 + 1562.00;
        double salaryAfterTax1 = hoursPerMonth * hourlyRate - tax;
        double salaryAfterTax = Math.ceil(salaryAfterTax1 * 100) / 100;
        return salaryAfterTax;

    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
