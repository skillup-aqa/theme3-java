package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double salaryBeforeTaxes1 = (hoursPerMonth * hourlyRate);
        return Math.ceil(salaryBeforeTaxes1 * 100) / 100;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double salaryBeforeTaxes = Math.ceil(hoursPerMonth * hourlyRate * 100) / 100;
        double tax = (salaryBeforeTaxes * 0.05) + 1562.00;
        double salaryAfterTaxes1 = (hoursPerMonth * hourlyRate) - tax;
        return Math.floor(salaryAfterTaxes1 * 100) / 100;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(290.24, 40));
        System.out.println(calculateSalaryAfterTaxes(290.24, 40));
    }

}